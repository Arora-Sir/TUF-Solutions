# [Inactive Customers](https://takeuforward.org/practice/sql/inactive-customers?category=subqueries-and-missing-records&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

You are managing an e-commerce platform and want to identify customers who have never placed an order. This can help your marketing or sales team target those users with special promotions or reminders.

You are given two tables:

Customers:

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║     id      ║   int    ║
║─────────────┼──────────║
║    name     ║  vachar  ║
╚═════════════╩══════════╝
```

- *id* : Unique id of the customer.
- *name* : name of each customer.

Orders:

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║     id      ║   int    ║
║─────────────┼──────────║
║ customerid  ║   int    ║
╚═════════════╩══════════╝
```

- *id* : Unique id of the order
- *customerId* : customerId is a foreign key, which is taking reference from Customer table

Write an SQL query to return the names of all customers who do not appear in the Orders table.

The result should be ordered by customer name in ascending order.

### Example 1:

Example:

Input:

Customers Table:

```
╔══════════╦══════════╗
║    id    ║   name   ║
╠══════════╬══════════╣
║    1     ║   Joe    ║
║──────────┼──────────║
║    2     ║  Henry   ║
║──────────┼──────────║
║    3     ║   Sam    ║
║──────────┼──────────║
║    4     ║   Max    ║
╚══════════╩══════════╝
```

Orders Table:

```
╔══════════╦════════════╗
║    id    ║ customerId ║
╠══════════╬════════════╣
║    1     ║     3      ║
║──────────┼────────────║
║    2     ║     1      ║
╚══════════╩════════════╝
```

Expected Output:

```
╔═══════════╗
║ Customers ║
╠═══════════╣
║   Henry   ║
║───────────║
║    Max    ║
╚═══════════╝
```

Explanation:

- Joe (1) = Ordered&nbsp;
- Henry (2) = No order&nbsp;
- Sam (3) = Ordered&nbsp;
- Max (4) = No order&nbsp;

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
