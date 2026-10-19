SELECT p.player_id, p.player_name, COUNT(*) AS grand_slams_count
FROM (SELECT Wimbledon AS player_id FROM Championships
      UNION ALL
      SELECT Fr_open FROM Championships
      UNION ALL
      SELECT US_open FROM Championships
      UNION ALL
      SELECT Au_open FROM Championships) winners
JOIN Players p ON winners.player_id=p.player_id
GROUP BY p.player_id, p.player_name
ORDER BY grand_slams_count DESC, p.player_id ASC;