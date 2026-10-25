WITH RankedLogins AS (
  SELECT user_id, time_stamp AS last_stamp,
      LEAD(time_stamp) OVER(
          PARTITION BY user_id 
          ORDER BY time_stamp
      ) AS next_stamp
  FROM Logins
  WHERE YEAR(time_stamp)=2020
)
SELECT user_id, last_stamp
FROM RankedLogins
WHERE next_stamp IS NULL;