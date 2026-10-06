-- Preferred in Production

SELECT s.id, s.name
FROM Students s
WHERE NOT EXISTS(
    SELECT 1 
    FROM Departments d 
    WHERE d.id=s.department_id
);

-- Short-circuits immediately: The moment the database finds even one matching department ID, it stops searching and moves to the next student. It does not scan further.
-- Direct index lookup: If Departments.id has an index (which primary keys always do), this runs as a high-speed pointer lookup.
-- 100% NULL-safe: It never breaks when data contains nulls.