SELECT id,name
FROM Students s
WHERE s.department_id NOT IN (SELECT id FROM Departments)