SELECT v.customer_id, COUNT(v.visit_id) AS count_no_trans
FROM Visits v
WHERE NOT EXISTS(SELECT 1 from Transactions t WHERE t.visit_id=v.visit_id)
GROUP BY v.customer_id
ORDER BY count_no_trans DESC