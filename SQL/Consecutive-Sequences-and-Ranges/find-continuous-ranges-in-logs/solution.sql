WITH NumberedLogs AS (
    SELECT log_id, ROW_NUMBER() OVER(ORDER BY log_id) AS rn
    FROM Logs
)
SELECT MIN(log_id) AS start_id, MAX(log_id) AS end_id
FROM NumberedLogs
GROUP BY (log_id-rn) -- Creating Islands like 1-1=2-2=3-3 & 7-4=8-5 and so on... 
ORDER BY start_id;