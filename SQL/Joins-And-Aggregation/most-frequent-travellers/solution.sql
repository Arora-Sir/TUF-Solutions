SELECT u.name, 
        -- CASE WHEN SUM(r.distance) IS NULL THEN 0
        -- ELSE SUM(r.distance)
        -- END AS travelled_distance
        
        -- COALESCE(SUM(r.distance), 0) AS travelled_distance
        
        IFNULL(SUM(r.distance), 0) AS travelled_distance

FROM  Users u
LEFT JOIN Rides r ON u.id=r.user_id
GROUP BY u.id
ORDER BY travelled_distance DESC, u.name ASC