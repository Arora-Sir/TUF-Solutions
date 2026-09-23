SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY COUNT(customer_number) DESC -- We can use COUNT(*) also as we have already grouped the cusromer id's
LIMIT 1 