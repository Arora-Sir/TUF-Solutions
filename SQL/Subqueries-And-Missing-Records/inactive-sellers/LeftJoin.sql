SELECT s.seller_name
FROM Seller s
LEFT JOIN Orders o ON s.seller_id=o.seller_id 
                   AND YEAR(o.sale_date)=2020
GROUP BY s.seller_id,s.seller_name
HAVING COUNT(o.order_id)=0
ORDER BY s.seller_name;

-- pick all sellers in year 2020 with no orders done