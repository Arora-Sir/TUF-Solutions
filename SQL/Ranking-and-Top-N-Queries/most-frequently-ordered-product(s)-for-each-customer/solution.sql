WITH RankedItems AS(
  SELECT p.client_id,p.item_id,item_name,
         DENSE_RANK() OVER(PARTITION BY p.client_id ORDER BY COUNT(*) DESC) AS rnk
  FROM Purchases p
  JOIN Items i ON i.item_id=p.item_id
  GROUP BY p.client_id, p.item_id
)
SELECT client_id,item_id,item_name
FROM RankedItems
WHERE rnk=1
ORDER BY client_id, item_id;