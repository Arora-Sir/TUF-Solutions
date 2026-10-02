SELECT e.name
FROM Employees e
JOIN Employees m ON e.manager_id=m.employee_id AND e.salary>m.salary