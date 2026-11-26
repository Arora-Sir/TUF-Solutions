With TopCustomer AS(
  SELECT customer_number,
         DENSE_RANK() OVER(ORDER BY COUNT(customer_number) DESC) AS rnk
  FROM Orders
  GROUP BY customer_number
)
SELECT customer_number
FROM TopCustomer
WHERE rnk=1;