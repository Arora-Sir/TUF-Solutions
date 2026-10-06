-- Good, but heavier on memory

SELECT s.id,s.name
FROM Students s
LEFT JOIN Departments d ON s.department_id=d.id
WHERE d.id IS NULL

-- Joins first, filters second: SQL must perform a full join between Students and Departments in memory before the WHERE clause filters out the non-null rows.
-- On tables with millions of rows, allocating memory for the joined table creates unnecessary overhead.