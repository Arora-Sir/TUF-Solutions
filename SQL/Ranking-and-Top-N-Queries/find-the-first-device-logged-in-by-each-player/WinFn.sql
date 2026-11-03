WITH Ranked AS(
  SELECT player_id,device_id,DENSE_RANK() OVER(PARTITION BY player_id ORDER BY event_date) AS event_rank
  FROM Activity
)
SELECT player_id,device_id
FROM Ranked
WHERE event_rank=1
ORDER BY player_id,device_id;