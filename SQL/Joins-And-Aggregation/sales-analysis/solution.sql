SELECT p.product_name,s.year,s.price
FROM Sales s
JOIN Product p ON p.product_id=s.product_id -- Default JOIN = INNER JOIN & LEFT JOIN also okay here. For optimization we use INNER JOIN as