SELECT MAX(num) AS num
FROM ( 
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(*) = 1
) AS SingleNumbers

-- In SQL, any subquery placed inside the FROM clause is known as a derived table.
-- The SQL standard and database engines (especially MySQL and PostgreSQL) strictly require every derived table to have a name.
-- The FROM clause only accepts tables. When we place a subquery inside FROM, SQL constructs a temporary in-memory result. The engine requires you to give that temporary result a table name so the query planner can address it like a real table.

