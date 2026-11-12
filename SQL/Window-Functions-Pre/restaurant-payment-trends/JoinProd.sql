WITH DailyTotals AS(
    SELECT visited_on, SUM(amount) AS daily_amount
    FROM Customer
    GROUP BY visited_on
)
SELECT d1.visited_on,
       SUM(d2.daily_amount) AS amount,
       ROUND(SUM(d2.daily_amount)/7.0,2) AS average_amount
FROM DailyTotals d1 -- today
JOIN DailyTotals d2 -- past 7 days
  ON d2.visited_on BETWEEN DATE_SUB(d1.visited_on, INTERVAL 6 DAY) AND d1.visited_on
WHERE d1.visited_on >= 
(
    SELECT DATE_ADD(MIN(visited_on), INTERVAL 6 DAY) 
    FROM Customer
)
GROUP BY d1.visited_on
ORDER BY d1.visited_on ASC;