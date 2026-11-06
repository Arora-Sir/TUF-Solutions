# [Find Transactions with Maximum Amount Per Day](https://takeuforward.org/practice/sql/find-transactions-with-maximum-amount-per-day?category=ranking-and-top-n-queries&source=sql---75-frequently-asked-interview-questions&sidebar=0)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

We have a table named **Transactions** that contains the information about transactions.

**Table: Transactions**

```
╔════════════════╦══════════╗
║  Column Name   ║   Type   ║
╠════════════════╬══════════╣
║ transaction_id ║   int    ║
║────────────────┼──────────║
║      day       ║ datetime ║
║────────────────┼──────────║
║     amount     ║   int    ║
╚════════════════╩══════════╝
```

**transaction_id** is the primary key and contains unique values for this table.

Each row in this table represents a transaction with its transaction_id, day of the transaction, and the amount for that transaction.

**Task:**

Write a query to find the transaction_id of the transactions with the maximum amount on their respective day. If there are multiple transactions on the same day with the maximum amount, return all of them.

Return the result table ordered by **transaction_id** in ascending order.

### Example 1:

**Example**

**Input:**

**Transactions table:**

```
╔════════════════╦════════════════════╦════════╗
║ transaction_id ║        day         ║ amount ║
╠════════════════╬════════════════════╬════════╣
║       8        ║ 2021-4-3 15:57:28  ║   57   ║
║────────────────┼────────────────────┼────────║
║       9        ║ 2021-4-28 08:47:25 ║   21   ║
║────────────────┼────────────────────┼────────║
║       1        ║ 2021-4-29 13:28:30 ║   58   ║
║────────────────┼────────────────────┼────────║
║       5        ║ 2021-4-28 16:39:59 ║   40   ║
║────────────────┼────────────────────┼────────║
║       6        ║ 2021-4-29 23:39:28 ║   58   ║
╚════════════════╩════════════════════╩════════╝
```

**Output:**

```
╔════════════════╗
║ transaction_id ║
╠════════════════╣
║       1        ║
║────────────────║
║       5        ║
║────────────────║
║       6        ║
║────────────────║
║       8        ║
╚════════════════╝
```

**Explanation:**

On 2021-4-3, we have only one transaction with ID 8, so we add 8 to the result.

On 2021-4-28, we have two transactions with IDs 5 and 9. Transaction 5 has the maximum amount (40), so we include it in the result.

On 2021-4-29, both transactions 1 and 6 have the same amount (58), so we include both in the result.

The result is ordered by transaction_id.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
