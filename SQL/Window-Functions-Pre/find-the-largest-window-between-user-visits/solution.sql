WITH VisitWindows AS(
    SELECT user_id,visit_date,
           LEAD(visit_date, 1, '2021-01-01') OVER(PARTITION BY user_id ORDER BY visit_date) AS next_visit_date -- Look '1' row down (offset) as ORDER BY visit_date gives us the next date of it, otherwise default to 2021-01-01
    FROM UserVisits
)
SELECT user_id,
       MAX(DATEDIFF(next_visit_date, visit_date)) AS biggest_window
FROM VisitWindows
GROUP BY user_id
ORDER BY user_id;