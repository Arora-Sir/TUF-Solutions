SELECT s.name
FROM SalesPerson s
WHERE NOT EXISTS (
  SELECT 1 
  FROM Company c
  JOIN Orders o ON c.com_id=o.com_id
  WHERE c.name='RED' AND o.sales_id=s.sales_id)