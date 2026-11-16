WITH AllTasks AS(
  SELECT fail_date AS task_date, 'failed' AS period_state 
  FROM Failed
  WHERE fail_date BETWEEN '2019-01-01' AND '2019-12-31'

  UNION ALL
  
  SELECT success_date AS task_date, 'succeeded' AS period_state 
  FROM Succeeded
  WHERE success_date BETWEEN '2019-01-01' AND '2019-12-31'
),
RankedTasks AS(
  SELECT task_date, period_state,
         ROW_NUMBER() OVER(PARTITION BY period_state ORDER BY task_date) AS rn
  FROM AllTasks
)
SELECT period_state, MIN(task_date) AS start_date, MAX(task_date) AS end_date
FROM RankedTasks
GROUP BY period_state, DATE_SUB(task_date, INTERVAL rn DAY) -- Similar as Gaps & Island problem where gaps of 1 day will group as one, and 2 days as other group...Giving us a particular date for a group after substracting the row numbers (Island), i.e the row number increase and the date also increase giving us same islands.
ORDER BY start_date;