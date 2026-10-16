-- The database reads the physical Products table only once.
-- It multiplies each row by the 3 store names in memory and evaluates the price using CASE.

SELECT 
    p.product_id,
    s.store,
    CASE s.store
        WHEN 'store1' THEN p.store1
        WHEN 'store2' THEN p.store2
        WHEN 'store3' THEN p.store3
    END AS price
FROM Products p
CROSS JOIN (
    SELECT 'store1' AS store UNION ALL
    SELECT 'store2' UNION ALL
    SELECT 'store3'
) s
WHERE CASE s.store
    WHEN 'store1' THEN p.store1
    WHEN 'store2' THEN p.store2
    WHEN 'store3' THEN p.store3
END IS NOT NULL
ORDER BY p.product_id, s.store, price;