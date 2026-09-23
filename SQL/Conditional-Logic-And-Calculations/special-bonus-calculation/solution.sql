SELECT employee_id,
  CASE
    WHEN employee_id%2=1 AND name NOT LIKE 'M%'
        THEN salary  
    ELSE '0'
  END AS bonus
FROM Employees

-- ""= & !=" for exact match, and "Like/Not Like" for pattern matching