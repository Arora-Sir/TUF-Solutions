SELECT DISTINCT c1.seat_id
FROM Cinema c1
JOIN Cinema c2 ON c2.free=1
JOIN Cinema c3 ON c3.free=1
WHERE c1.free=1
      AND ( -- c1 on left, middle and right
            (c2.seat_id=c1.seat_id+1 AND c3.seat_id=c1.seat_id+2)
            OR (c2.seat_id=c1.seat_id-1 AND c3.seat_id=c1.seat_id+1)
            OR (c2.seat_id=c1.seat_id-2 AND c3.seat_id=c1.seat_id-1)
          )
ORDER BY c1.seat_id;