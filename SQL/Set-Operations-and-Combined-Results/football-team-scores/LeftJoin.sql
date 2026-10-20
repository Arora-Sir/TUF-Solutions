-- no need to add t or m anywhere because we already did a left join so all of the team_id will be here in left join table already

SELECT t.team_id, t.team_name,
        SUM( 
          CASE 
            WHEN m.host_team=t.team_id AND host_goals>guest_goals THEN 3
            WHEN m.guest_team=t.team_id AND host_goals<guest_goals THEN 3
            WHEN m.host_goals=m.guest_goals THEN 1
            ELSE 0 
          END
        ) AS num_points
FROM Teams t
LEFT JOIN Matches m ON t.team_id IN (m.host_team, m.guest_team)
GROUP BY team_id,team_name
ORDER BY num_points DESC, t.team_id ASC;
