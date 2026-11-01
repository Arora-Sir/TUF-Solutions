SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary
FROM Employee e
JOIN Department d ON d.id=e.departmentId
WHERE e.salary IN (SELECT MAX(salary) FROM Employee GROUP BY departmentId)
ORDER BY e.salary DESC, e.name;