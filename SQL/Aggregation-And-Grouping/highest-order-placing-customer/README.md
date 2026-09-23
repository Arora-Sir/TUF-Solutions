# [Highest Order Placing Customer](https://takeuforward.org/practice/sql/highest-order-placing-customer?category=aggregation-and-grouping&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

As a business, you want to identify which customer places the most orders. This is useful for targeting high-value customers with loyalty programs or marketing campaigns.

You are given a table named **Orders** that tracks customer orders.

```
╔═════════════════╦══════════╗
║   Column Name   ║   Type   ║
╠═════════════════╬══════════╣
║   order_number  ║   int    ║
║─────────────────┼──────────║
║ customer_number ║   int    ║
╚═════════════════╩══════════╝
```

- **order_number:** Unique order ID (Primary Key) for each order placed.
- **customer_number:** ID of the customer who placed the order.

Write a query to find the customer_number of the customer who has placed the most orders. It is guaranteed that exactly one customer will have placed more orders than any other.

### Example 1:

**Example:**

**Input:**

Orders Table

```
╔══════════════╦═════════════════╗
║ order_number ║ customer_number ║
╠══════════════╬═════════════════╣
║      1       ║        1        ║
║──────────────┼─────────────────║
║      2       ║        2        ║
║──────────────┼─────────────────║
║      3       ║        3        ║
║──────────────┼─────────────────║
║      4       ║        3        ║
╚══════════════╩═════════════════╝
```

**Expected Output:**

```
╔═════════════════╗
║ customer_number ║
╠═════════════════╣
║        3        ║
╚═════════════════╝
```

**Explanation:**

- Customer 1 placed 1 order.
- Customer 2 placed 1 order.
- Customer 3 placed 2 orders (most orders).

Thus, the result is customer_number 3.

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
