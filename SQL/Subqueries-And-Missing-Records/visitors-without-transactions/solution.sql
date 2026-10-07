-- SELECT v.customer_id, COUNT(v.visit_id) AS count_no_trans
SELECT customer_id, COUNT(*) AS count_no_trans
FROM Visits v
-- LEFT JOIN Transactions AS t ON v.visit_id=t.visit_id
-- WHERE t.visit_id IS NULL
WHERE NOT EXISTS(SELECT 1 from Transactions t WHERE t.visit_id=v.visit_id)
GROUP BY customer_id
-- GROUP BY v.customer_id
ORDER BY count_no_trans DESC