# [Updated Bank Balances](https://takeuforward.org/practice/sql/updated-bank-balances?category=joins-and-aggregation&source=sql---75-frequently-asked-interview-questions&bug=true)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

In a banking system, it's important to identify high-value customers with large balances. This can help in offering premium services, credit evaluations, and fraud detection.

You are given:

**Users** table:

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║   account   ║   int    ║
║─────────────┼──────────║
║    name     ║ varchar  ║
╚═════════════╩══════════╝
```

- **account** : Unique account number for each user (Primary Key).
- **name** : Name of the user, unique across all users means no two users in the table will have identical names.

**Transactions** table:

```
╔═══════════════╦══════════╗
║ Column Name   ║   Type   ║
╠═══════════════╬══════════╣
║   trans_id    ║   int    ║
║───────────────┼──────────║
║   account     ║   int    ║
║───────────────┼──────────║
║   amount      ║   int    ║
║───────────────┼──────────║
║ transacted_on ║   date   ║
╚═══════════════╩══════════╝
```

- **trans_id** : Unique transaction ID (Primary Key)
- **account** : The account number this transaction belongs to (foreign key to Users.account)
- **amount** : Positive if money was received, negative if money was transferred out
- **transacted_on** : The date of the transaction

Write a query to return the name and balance of users whose total account balance exceeds 10,000. A user's balance is calculated by summing all the amounts from transactions linked to their account. The result can be returned in any order.

### Example 1:

**Example:**

**Input:**

Users Table:

```
╔═════════╦═════════╗
║ account ║  name   ║
╠═════════╬═════════╣
║ 900001  ║  Alice  ║
║─────────┼─────────║
║ 900002  ║   Bob   ║
║─────────┼─────────║
║ 900003  ║ Charlie ║
╚═════════╩═════════╝
```

Transactions Table:

```
╔══════════╦═════════╦════════╦═══════════════╗
║ trans_id ║ account ║ amount ║ transacted_on ║
╠══════════╬═════════╬════════╬═══════════════╣
║    1     ║ 900001  ║  7000  ║  2020-08-01   ║
║──────────┼─────────┼────────┼───────────────║
║    2     ║ 900001  ║  7000  ║  2020-09-01   ║
║──────────┼─────────┼────────┼───────────────║
║    3     ║ 900001  ║ -3000  ║  2020-09-02   ║
║──────────┼─────────┼────────┼───────────────║
║    4     ║ 900002  ║  1000  ║  2020-09-12   ║
║──────────┼─────────┼────────┼───────────────║
║    5     ║ 900003  ║  6000  ║  2020-08-07   ║
║──────────┼─────────┼────────┼───────────────║
║    6     ║ 900003  ║  6000  ║  2020-09-07   ║
║──────────┼─────────┼────────┼───────────────║
║    7     ║ 900003  ║ -4000  ║  2020-09-11   ║
╚══════════╩═════════╩════════╩═══════════════╝
```

**Output:**

```
╔═══════╦═════════╗
║ name  ║ balance ║
╠═══════╬═════════╣
║ Alice ║  11000  ║
╚═══════╩═════════╝
```

**Explanation:**

- **Alice** : 7000 + 7000 - 3000 = 11000
- **Bob** : 1000 = below 10000
- **Charlie** : 6000 + 6000 - 4000 = 8000

Only Alice has a balance exceeding 10000.

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
