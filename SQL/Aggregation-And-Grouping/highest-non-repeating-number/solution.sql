SELECT 
(   SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(*)=1
    ORDER BY num DESC
    LIMIT 1
) AS num -- Added this outer Select to handle the NULL case, because if inner query returns NULL, then it will print null as nums as per question statement.