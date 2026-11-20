-- Will work for all above levels heirarchy as used RECURSIVE CTE

WITH RECURSIVE EmployeeHierarchy AS(
    SELECT employee_id
    FROM Employees
    WHERE manager_id=1 AND employee_id<>1 -- will use these values for level 2, 3, 4...

    UNION ALL

    SELECT e.employee_id
    FROM Employees e
    JOIN EmployeeHierarchy h ON e.manager_id=h.employee_id -- The moment a round finds 0 new rows from above query, the loop stops automatically
)
SELECT employee_id
FROM EmployeeHierarchy
ORDER BY employee_id;