# [A & B Buyers Without C](https://takeuforward.org/practice/sql/a-b-buyers-without-c?category=subqueries-and-missing-records&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Your company wants to promote product C to customers who have already shown interest in related products A and B, but have not purchased C yet. These customers are potential buyers for C, and you'd like to target them for marketing campaigns.

You are given two tables:

Customers:

```
╔═══════════════╦══════════╗
║  Column Name  ║   Type   ║
╠═══════════════╬══════════╣
║  customer_id  ║   int    ║
║───────────────┼──────────║
║ customer_name ║ varchar  ║
╚═══════════════╩══════════╝
```

- *customer_id* is primary key above table(Customers).
- *customer_name* is the name of the customer.

Orders:

```
╔══════════════╦══════════╗
║ Column Name  ║   Type   ║
╠══════════════╬══════════╣
║   order_id   ║   int    ║
║──────────────┼──────────║
║ customer_id  ║   int    ║
║──────────────┼──────────║
║ product_name ║ varchar  ║
╚══════════════╩══════════╝
```

- *order_id* is primary key above table(Orders)
- *customer_id* is a foreign key that references the Customers table.
- *product_name* is the name of the product.

Write an SQL query to return the customer_id and customer_name of customers who have:

- Purchased both 'A' and 'B',
- Not purchased 'C'.

Return the result ordered by customer_id.

### Example 1:

Example:

Input:

Customers:

```
╔═════════════╦═══════════════╗
║ customer_id ║ customer_name ║
╠═════════════╬═══════════════╣
║      1      ║    Daniel     ║
║─────────────┼───────────────║
║      2      ║     Diana     ║
║─────────────┼───────────────║
║      3      ║   Elizabeth   ║
║─────────────┼───────────────║
║      4      ║     Jhon      ║
╚═════════════╩═══════════════╝
```

Orders:

```
╔══════════╦═════════════╦══════════════╗
║ order_id ║ customer_id ║ product_name ║
╠══════════╬═════════════╬══════════════╣
║    10    ║      1      ║      A       ║
║──────────┼─────────────┼──────────────║
║    20    ║      1      ║      B       ║
║──────────┼─────────────┼──────────────║
║    30    ║      1      ║      D       ║
║──────────┼─────────────┼──────────────║
║    40    ║      1      ║      C       ║
║──────────┼─────────────┼──────────────║
║    50    ║      2      ║      A       ║
║──────────┼─────────────┼──────────────║
║    60    ║      3      ║      A       ║
║──────────┼─────────────┼──────────────║
║    70    ║      3      ║      B       ║
║──────────┼─────────────┼──────────────║
║    80    ║      3      ║      D       ║
║──────────┼─────────────┼──────────────║
║    90    ║      4      ║      C       ║
╚══════════╩═════════════╩══════════════╝
```

Output:

```
╔═════════════╦═══════════════╗
║ customer_id ║ customer_name ║
╠═════════════╬═══════════════╣
║      3      ║  Elizabeth    ║
╚═════════════╩═══════════════╝
```

Explanation:&nbsp;

Only the customer_id with id 3 bought the product A and B but not the product C.

- Customer 1 = A, B, C = No
- Customer 2 = Only A = No
- Customer 3 = A, B, D = Yes
- Customer 4 = Only C = No

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
