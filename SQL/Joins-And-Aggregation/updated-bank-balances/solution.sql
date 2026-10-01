SELECT u.name,
      SUM(t.amount) as balance
FROM Users u
JOIN Transactions t ON u.account=t.account
GROUP BY u.name,u.account -- Added this instead of t.account as we selected u.name in SELECT statement and we need the account grouping to check overall balance
Having balance>10000 -- Will give error in other SQL's as execution order of Having<Select