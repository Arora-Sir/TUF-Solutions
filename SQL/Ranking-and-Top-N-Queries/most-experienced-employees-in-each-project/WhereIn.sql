SELECT p.project_id, p.employee_id
FROM Project p
JOIN Employee e ON p.employee_id=e.employee_id
WHERE (p.project_id, e.experience_years) IN 
  (
    SELECT p1.project_id, MAX(e1.experience_years)
    FROM Project p1
    JOIN Employee e1 ON p1.employee_id=e1.employee_id
    GROUP BY p1.project_id
  )
ORDER BY p.project_id,p.employee_id;