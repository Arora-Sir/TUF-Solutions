SELECT p.player_id, p.player_name,
      (SUM(CASE WHEN c.Wimbledon=p.player_id THEN 1 ELSE 0 END) +
       SUM(CASE WHEN c.Fr_open=p.player_id THEN 1 ELSE 0 END) +
       SUM(CASE WHEN c.US_open=p.player_id THEN 1 ELSE 0 END) +
       SUM(CASE WHEN c.Au_open=p.player_id THEN 1 ELSE 0 END)) AS grand_slams_count
FROM Players p
JOIN Championships c ON p.player_id IN (c.Wimbledon, c.Fr_open, c.US_open, c.Au_open)
GROUP BY p.player_id, p.player_name
-- Having not needed as we have already Cross Joined with the rows that will drop other cases autaomtically
-- HAVING(SUM(CASE WHEN c.Wimbledon=p.player_id THEN 1 ELSE 0 END)+
--        SUM(CASE WHEN c.Fr_open=p.player_id THEN 1 ELSE 0 END)+
--        SUM(CASE WHEN c.US_open=p.player_id THEN 1 ELSE 0 END)+
--        SUM(CASE WHEN c.Au_open=p.player_id THEN 1 ELSE 0 END)) > 0
ORDER BY grand_slams_count DESC, p.player_id ASC;