SELECT co.name AS country
FROM Country co
JOIN Person p 
     ON CAST(SUBSTRING(p.phone_number, 1, 3) AS UNSIGNED)=co.country_code
-- CAST(... AS UNSIGNED) will strip the leading zeros and make STRING to INT for explicit conversion otherwiser SQL does itself with Implicit conversion and can mistake or gives warnings based on the data mismatch

JOIN Calls c ON p.id IN (c.caller_id, c.callee_id)
GROUP BY co.name
HAVING AVG(c.duration)>(SELECT AVG(duration) FROM Calls);
