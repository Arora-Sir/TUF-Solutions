WITH RankedTransactions AS(
  SELECT transaction_id,
  DENSE_RANK() OVER(PARTITION BY DATE(day) ORDER BY amount DESC) AS rnk
  FROM Transactions
)
SELECT transaction_id
FROM RankedTransactions
WHERE rnk=1
ORDER BY transaction_id;