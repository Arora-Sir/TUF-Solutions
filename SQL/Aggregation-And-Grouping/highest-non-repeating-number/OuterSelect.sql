SELECT 
(   SELECT num
    FROM MyNumbers 
    GROUP BY num
    HAVING COUNT(*)=1
    ORDER BY num DESC
    LIMIT 1
) AS num -- Added this outer Select to handle the NULL case, because if inner query returns NULL, then it will print null as nums as per question statement.

-- The select query only returning a single value here, so it needs only column alias (not table alias) in this.