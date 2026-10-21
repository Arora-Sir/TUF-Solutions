SELECT co.name AS country
FROM Country co
JOIN Person p 
    --  ON CAST(SUBSTRING(p.phone_number, 1, 3) AS UNSIGNED)=co.country_code
    --  ON SUBSTRING(p.phone_number, 1, 3)=co.country_code
     ON LEFT(p.phone_number, 3)=co.country_code -- Same thing
-- CAST(... AS UNSIGNED) will strip the leading zeros and make STRING to INT for explicit conversion otherwiser SQL does itself with Implicit conversion and can mistake or gives warnings based on the data mismatch
-- Although both are alraedy type as varchar, so not needed the CAST here specifically for this problem.

-- JOIN Calls c ON p.id IN (c.caller_id, c.callee_id)
JOIN (
    SELECT caller_id AS person_id, duration FROM Calls
    UNION ALL
    SELECT callee_id AS person_id, duration FROM Calls
) c ON p.id=c.person_id

GROUP BY co.name
HAVING AVG(c.duration)>(SELECT AVG(duration) FROM Calls);