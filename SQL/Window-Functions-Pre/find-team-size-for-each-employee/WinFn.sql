WITH TeamSizes AS(
    SELECT employee_id, COUNT(*) OVER(PARTITION BY team_id) AS team_size
    FROM Employee
)
SELECT employee_id, team_size
FROM TeamSizes
ORDER BY employee_id;