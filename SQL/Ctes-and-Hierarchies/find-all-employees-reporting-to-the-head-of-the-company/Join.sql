-- Only work for 3 level heirarchy as used join 2 times

SELECT e1.employee_id
FROM Employees e1
JOIN Employees e2 ON e1.manager_id=e2.employee_id
JOIN Employees e3 ON e2.manager_id=e3.employee_id
WHERE e3.manager_id=1 AND e1.employee_id!=1
ORDER BY e1.employee_id;