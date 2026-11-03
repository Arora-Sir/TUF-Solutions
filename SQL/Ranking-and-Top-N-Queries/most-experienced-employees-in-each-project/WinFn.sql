WITH Ranked AS
(
  SELECT p.project_id,p.employee_id,
         DENSE_RANK() OVER(PARTITION BY p.project_id ORDER BY e.experience_years DESC) AS exp_rank
  FROM Project p
  JOIN Employee e ON e.employee_id=p.employee_id
)
SELECT project_id, employee_id
FROM Ranked
WHERE exp_rank=1
ORDER BY project_id,employee_id;