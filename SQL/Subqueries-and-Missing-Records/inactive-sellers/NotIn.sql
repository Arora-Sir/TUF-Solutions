SELECT s.seller_name
FROM Seller s
-- LEFT JOIN Orders o ON s.seller_id=o.seller_id -- not needed as no need of order anywhere else
WHERE s.seller_id NOT IN (SELECT seller_id FROM Orders WHERE YEAR(sale_date)=2020)
ORDER BY s.seller_name