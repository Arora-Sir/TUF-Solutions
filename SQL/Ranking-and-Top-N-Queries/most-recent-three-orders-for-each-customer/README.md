# [Most Recent Three Orders for Each Customer](https://takeuforward.org/practice/sql/most-recent-three-orders-for-each-customer?category=ranking-and-top-n-queries&source=sql---75-frequently-asked-interview-questions&sidebar=0)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

We have two tables: **Customers** and **Orders** .

**Table: Customers**

```
╔═════════════╦═════════╗
║ Column Name ║  Type   ║
╠═════════════╬═════════╣
║ customer_id ║   int   ║
║─────────────┼─────────║
║    name     ║ varchar ║
╚═════════════╩═════════╝
```

- **customer_id** is the primary key for this table. It contains information about the customers.

**Table: Orders**

```
╔═════════════╦════════╗
║ Column Name ║  Type  ║
╠═════════════╬════════╣
║  order_id   ║  int   ║
║─────────────┼────────║
║ order_date  ║  date  ║
║─────────────┼────────║
║ customer_id ║  int   ║
║─────────────┼────────║
║    cost     ║  int   ║
╚═════════════╩════════╝
```

- **order_id** is the primary key for this table. It contains the orders made by customers.
- **customer_id** references the customer who placed the order.
- Each customer has only one order per day.

Write a solution to find the most recent three orders for each customer. If a customer has less than three orders, return all of their orders.

Return the result table ordered by **customer_name** in ascending order. In case of a tie, order by **customer_id** in ascending order. If there is still a tie, order them by **order_date** in descending order.

### Example 1:

**Example**

**Input:**

**Customers table:**

```
╔═════════════╦═══════════╗
║ customer_id ║   name    ║
╠═════════════╬═══════════╣
║      1      ║  Winston  ║
║─────────────┼───────────║
║      2      ║ Jonathan  ║
║─────────────┼───────────║
║      3      ║ Annabelle ║
║─────────────┼───────────║
║      4      ║  Marwan   ║
║─────────────┼───────────║
║      5      ║  Khaled   ║
╚═════════════╩═══════════╝
```

**Orders table:**

```
╔══════════╦════════════╦═════════════╦══════╗
║ order_id ║ order_date ║ customer_id ║ cost ║
╠══════════╬════════════╬═════════════╬══════╣
║    1     ║ 2020-07-31 ║      1      ║  30  ║
║──────────┼────────────┼─────────────┼──────║
║    2     ║ 2020-07-30 ║      2      ║  40  ║
║──────────┼────────────┼─────────────┼──────║
║    3     ║ 2020-07-31 ║      3      ║  70  ║
║──────────┼────────────┼─────────────┼──────║
║    4     ║ 2020-07-29 ║      4      ║ 100  ║
║──────────┼────────────┼─────────────┼──────║
║    5     ║ 2020-06-10 ║      1      ║ 1010 ║
║──────────┼────────────┼─────────────┼──────║
║    6     ║ 2020-08-01 ║      2      ║ 102  ║
║──────────┼────────────┼─────────────┼──────║
║    7     ║ 2020-08-01 ║      3      ║ 111  ║
║──────────┼────────────┼─────────────┼──────║
║    8     ║ 2020-08-03 ║      1      ║  99  ║
║──────────┼────────────┼─────────────┼──────║
║    9     ║ 2020-08-07 ║      2      ║  32  ║
║──────────┼────────────┼─────────────┼──────║
║   10     ║ 2020-07-15 ║      1      ║  2   ║
╚══════════╩════════════╩═════════════╩══════╝
```

**Output:**

```
╔═══════════════╦═════════════╦══════════╦════════════╗
║ customer_name ║ customer_id ║ order_id ║ order_date ║
╠═══════════════╬═════════════╬══════════╬════════════╣
║   Annabelle   ║      3      ║    7     ║ 2020-08-01 ║
║───────────────┼─────────────┼──────────┼────────────║
║   Annabelle   ║      3      ║    3     ║ 2020-07-31 ║
║───────────────┼─────────────┼──────────┼────────────║
║   Jonathan    ║      2      ║    9     ║ 2020-08-07 ║
║───────────────┼─────────────┼──────────┼────────────║
║   Jonathan    ║      2      ║    6     ║ 2020-08-01 ║
║───────────────┼─────────────┼──────────┼────────────║
║   Jonathan    ║      2      ║    2     ║ 2020-07-30 ║
║───────────────┼─────────────┼──────────┼────────────║
║    Marwan     ║      4      ║    4     ║ 2020-07-29 ║
║───────────────┼─────────────┼──────────┼────────────║
║    Winston    ║      1      ║    8     ║ 2020-08-03 ║
║───────────────┼─────────────┼──────────┼────────────║
║    Winston    ║      1      ║    1     ║ 2020-07-31 ║
║───────────────┼─────────────┼──────────┼────────────║
║    Winston    ║      1      ║   10     ║ 2020-07-15 ║
╚═══════════════╩═════════════╩══════════╩════════════╝
```

**Explanation:**

Winston has 4 orders, so we discard the oldest order from 2020-06-10.

Annabelle only has 2 orders, so we return them.

Jonathan has exactly 3 orders.

Marwan has only one order.

We sort the result by customer_name (ascending), then by customer_id (ascending), and then by order_date (descending).

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
