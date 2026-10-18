SELECT employee_id
FROM(
    SELECT employee_id FROM Employees
    UNION ALL
    SELECT employee_id FROM Salaries
) AS Combined
GROUP BY employee_id
HAVING COUNT(*)=1
ORDER BY employee_id;