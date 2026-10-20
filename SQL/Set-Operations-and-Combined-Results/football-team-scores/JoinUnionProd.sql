-- Production code because it uses ON t.team_id = m.team_id, and two seperate queries for fast index lookups using UNION ALL and sum them together

SELECT t.team_id, t.team_name, COALESCE(SUM(m.points), 0) AS num_points
FROM Teams t
LEFT JOIN (
    SELECT host_team AS team_id,
        CASE 
            WHEN host_goals>guest_goals THEN 3
            WHEN host_goals=guest_goals THEN 1
            ELSE 0 
        END AS points
    FROM Matches

    UNION ALL

    SELECT guest_team AS team_id,
        CASE 
            WHEN guest_goals>host_goals THEN 3
            WHEN host_goals=guest_goals THEN 1
            ELSE 0 
        END AS points
    FROM Matches
) m ON t.team_id=m.team_id
GROUP BY t.team_id, t.team_name
ORDER BY num_points DESC, t.team_id ASC;