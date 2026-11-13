WITH SeatNeighbour AS(
  SELECT seat_id,free,
         LAG(free, 1) OVER (ORDER BY seat_id) AS prev1,
         LAG(free, 2) OVER (ORDER BY seat_id) AS prev2,
         LEAD(free, 1) OVER (ORDER BY seat_id) AS next1,
         LEAD(free, 2) OVER (ORDER BY seat_id) AS next2
  FROM Cinema
)
SELECT seat_id
FROM SeatNeighbour
WHERE free=1 AND
      ((prev1=1 AND prev2=1) OR (prev1=1 AND next1=1) OR (next1=1 AND next2=1))
ORDER BY seat_id;