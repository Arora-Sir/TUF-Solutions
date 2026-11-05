SELECT p.product_name, p.product_id, o.order_id, o.order_date
FROM Orders o
JOIN Products p ON o.product_id=p.product_id
WHERE (o.product_id,o.order_date) IN(
    SELECT product_id, MAX(order_date)
    FROM Orders
    GROUP BY product_id
)
ORDER BY p.product_name, p.product_id, o.order_id;