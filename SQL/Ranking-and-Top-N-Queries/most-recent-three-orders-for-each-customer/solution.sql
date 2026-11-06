WITH RankedCustomers AS(
  SELECT c.customer_id,c.name,o.order_date,o.order_id,
  ROW_NUMBER() OVER(PARTITION BY o.customer_id ORDER BY order_date DESC) AS rnk
  FROM Customers c
  JOIN Orders o ON o.customer_id=c.customer_id
)
SELECT name AS customer_name,customer_id,order_id, order_date
FROM RankedCustomers
WHERE rnk<=3
ORDER BY customer_name,customer_id,order_date DESC;