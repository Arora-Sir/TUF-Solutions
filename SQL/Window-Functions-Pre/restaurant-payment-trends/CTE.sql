WITH DailyTotals AS(
    SELECT visited_on, SUM(amount) AS daily_amount
    FROM Customer
    GROUP BY visited_on
),
RollingStats AS(
    SELECT visited_on,
           SUM(daily_amount) OVER
           (
             ORDER BY visited_on 
             RANGE BETWEEN INTERVAL 6 DAY PRECEDING AND CURRENT ROW
             -- MySQL 8.0 Calendar Window Function (RANGE BETWEEN)
           ) AS amount,
           ROUND(
             SUM(daily_amount) OVER
             (
               ORDER BY visited_on
               RANGE BETWEEN INTERVAL 6 DAY PRECEDING AND CURRENT ROW
             )/7.0,
           2) AS average_amount
    FROM DailyTotals
)
SELECT visited_on, amount, average_amount
FROM RollingStats
WHERE visited_on >= 
(
  SELECT DATE_ADD(MIN(visited_on), INTERVAL 6 DAY) FROM Customer
)
ORDER BY visited_on ASC;