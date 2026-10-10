SELECT customer_id
FROM Customer
GROUP BY customer_id
HAVING (Select COUNT(*) FROM Product)=COUNT(DISTINCT product_key)
ORDER BY customer_id