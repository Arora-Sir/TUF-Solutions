SELECT
  event_day as day,
  emp_id,
  SUM(Out_time-in_time) as total_time
FROM Employees
GROUP BY emp_id,event_day
ORDER BY event_day,emp_id 