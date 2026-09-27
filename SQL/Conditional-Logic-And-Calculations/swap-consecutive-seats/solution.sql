SELECT (
        CASE 
          WHEN id%2=1 AND id+1<=(SELECT MAX(id) FROM Seat) THEN id+1 -- 1 to 2
          WHEN id%2=0 THEN id-1 -- 2 to 1
          ELSE id -- Last ID as same
        END 
      ) AS id,
      student
FROM Seat
ORDER BY id