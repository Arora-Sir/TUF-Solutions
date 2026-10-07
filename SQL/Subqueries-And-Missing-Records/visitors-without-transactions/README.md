# [Visitors Without Transactions](https://takeuforward.org/practice/sql/visitors-without-transactions?category=subqueries-and-missing-records&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A shopping mall management system tracks customer visits and transactions. Some customers visit the mall but do not make any purchases during their visit.

The mall’s management wants to identify these customers and determine how many times they visited without making a transaction.

Your task is to find all customers who visited without making any transactions and count the number of such visits per customer.

The company maintains two tables:

**Visits** table, which contains:

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║  visit_id   ║   int    ║
║─────────────┼──────────║
║ customer_id ║   int    ║
╚═════════════╩══════════╝
```

- visit_id: A unique identifier for each visit.
- customer_id: The ID of the customer who visited the mall.

**Transactions** table, which contains:

```
╔════════════════╦══════════╗
║  Column Name   ║   Type   ║
╠════════════════╬══════════╣
║ transaction_id ║   int    ║
║────────────────┼──────────║
║    visit_id    ║   int    ║
║────────────────┼──────────║
║     amount     ║   int    ║
╚════════════════╩══════════╝
```

- transaction_id: A unique identifier for each transaction.
- visit_id: A reference to the visit in which the transaction occurred.
- amount: The amount spent during the transaction.

Your task is to:

- Find customers who visited but did not make any transactions.
- Count how many times each customer made such visits.

Return the result in sorted by count_no_trans in descending order.

The sample output format is in the following example.

### Example 1:

Example Input:

Visits Table

```
╔══════════╦═════════════╗
║ visit_id ║ customer_id ║
╠══════════╬═════════════╣
║    1     ║     23      ║
║──────────┼─────────────║
║    2     ║      9      ║
║──────────┼─────────────║
║    4     ║     30      ║
║──────────┼─────────────║
║    5     ║     54      ║
║──────────┼─────────────║
║    6     ║     96      ║
║──────────┼─────────────║
║    7     ║     54      ║
║──────────┼─────────────║
║    8     ║     54      ║
╚══════════╩═════════════╝
```

Transactions Table

```
╔════════════════╦══════════╦══════════╗
║ transaction_id ║ visit_id ║  amount  ║
╠════════════════╬══════════╬══════════╣
║       2        ║    5     ║   310    ║
║────────────────┼──────────┼──────────║
║       3        ║    5     ║   300    ║
║────────────────┼──────────┼──────────║
║       9        ║    5     ║   200    ║
║────────────────┼──────────┼──────────║
║       12       ║    1     ║   910    ║
║────────────────┼──────────┼──────────║
║       13       ║    2     ║   970    ║
╚════════════════╩══════════╩══════════╝
```

Output:

```
╔═════════════╦════════════════╗
║ customer_id ║ count_no_trans ║
╠═════════════╬════════════════╣
║     54      ║       2        ║
║─────────────┼────────────────║
║     30      ║       1        ║
║─────────────┼────────────────║
║     96      ║       1        ║
╚═════════════╩════════════════╝
```

Explanation:

- Customer 23 - Made a transaction during visit 1, Excluded
- Customer 9 - Made a transaction during visit 2, Excluded
- Customer 30 - Visited once (visit 4) and did not make a transaction, Included
- Customer 54 - Visited 3 times (visits 5, 7, 8) but made transactions only in visit 5 , Visited twice without a transaction , Included with count 2
- Customer 96 - Visited once (visit 6) and did not make a transaction , Included

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
