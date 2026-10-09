SELECT c.customer_id, customer_name
FROM Customers c
JOIN Orders o ON c.customer_id=o.customer_id
GROUP BY c.customer_id -- modern MySQL 5.7+ will compile as id is primary key and no need to add name here
HAVING SUM(product_name='A')>0 -- COUNT(0)=1
    AND SUM(product_name='B')>0
    AND SUM(product_name='C')=0
ORDER BY c.customer_id; 