SELECT c.name AS Customers
FROM Customers c
WHERE NOT EXISTS(SELECT 1 from Orders o
                 WHERE o.customerId=c.id) -- Early Circuit Break
ORDER BY c.name;