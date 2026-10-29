# [Order Count per Customer](https://takeuforward.org/practice/sql/order-count-per-customer?category=date-and-time-analysis&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

In e-commerce analytics, identifying loyal and high-value customers is crucial. A customer consistently spending above a certain threshold in consecutive months might be eligible for loyalty rewards, marketing campaigns, or early product access.

You are given three tables:

**Customers** table:

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║ customer_id ║   int    ║
║─────────────┼──────────║
║    name     ║ varchar  ║
║─────────────┼──────────║
║   country   ║ varchar  ║
╚═════════════╩══════════╝
```

- **customer_id** : Unique identifier for the customer (Primary Key)
- **name** : Name of the customer
- **country** : Country where the customer is located

**Product** table:

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║ product_id  ║   int    ║
║─────────────┼──────────║
║ description ║ varchar  ║
║─────────────┼──────────║
║    price    ║   int    ║
╚═════════════╩══════════╝
```

- **product_id** : Unique identifier for the product (Primary Key)
- **description** : Description of the product
- **price** : Price of the product

**Orders** table:

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║   order_id  ║   int    ║
║─────────────┼──────────║
║ customer_id ║   int    ║
║─────────────┼──────────║
║ product_id  ║   int    ║
║─────────────┼──────────║
║ order_date  ║   date   ║
║─────────────┼──────────║
║  quantity   ║   int    ║
╚═════════════╩══════════╝
```

- **order_id** : Unique order ID (Primary Key)
- **customer_id** : References Customers.customer_id (who placed the order)
- **product_id** : References Product.product_id (what was purchased)
- **order_date** : Date the order was placed, date in format ("YYYY-MM-DD")
- **quantity** : Number of units of the product purchased

Write a query to return the customer_id and customer_name of customers who have spent at least $100 in both June and July of 2020.

### Example 1:

**Example:**

**Input:**

Customers Table:

```
╔═════════════╦══════════╦═════════╗
║ customer_id ║   name   ║ country ║
╠═════════════╬══════════╬═════════╣
║      1      ║ Winston  ║   USA   ║
║─────────────┼──────────┼─────────║
║      2      ║ Jonathan ║  Peru   ║
║─────────────┼──────────┼─────────║
║      3      ║ Moustafa ║  Egypt  ║
╚═════════════╩══════════╩═════════╝
```

Product Table:

```
╔════════════╦═════════════╦═══════╗
║ product_id ║ description ║ price ║
╠════════════╬═════════════╬═══════╣
║     10     ║    Phone    ║  300  ║
║────────────┼─────────────┼───────║
║     20     ║   T-Shirt   ║  10   ║
║────────────┼─────────────┼───────║
║     30     ║    Book     ║  45   ║
║────────────┼─────────────┼───────║
║     40     ║  Keychain   ║   2   ║
╚════════════╩═════════════╩═══════╝
```

Orders Table:

```
╔══════════╦═════════════╦════════════╦════════════╦══════════╗
║ order_id ║ customer_id ║ product_id ║ order_date ║ quantity ║
╠══════════╬═════════════╬════════════╬════════════╬══════════╣
║    1     ║      1      ║     10     ║ 2020-06-10 ║    1     ║
║──────────┼─────────────┼────────────┼────────────┼──────────║
║    2     ║      1      ║     20     ║ 2020-07-01 ║    1     ║
║──────────┼─────────────┼────────────┼────────────┼──────────║
║    3     ║      1      ║     30     ║ 2020-07-08 ║    2     ║
║──────────┼─────────────┼────────────┼────────────┼──────────║
║    4     ║      2      ║     10     ║ 2020-06-15 ║    2     ║
║──────────┼─────────────┼────────────┼────────────┼──────────║
║    5     ║      2      ║     40     ║ 2020-07-01 ║   10     ║
║──────────┼─────────────┼────────────┼────────────┼──────────║
║    6     ║      3      ║     20     ║ 2020-06-24 ║    2     ║
║──────────┼─────────────┼────────────┼────────────┼──────────║
║    7     ║      3      ║     30     ║ 2020-06-25 ║    2     ║
║──────────┼─────────────┼────────────┼────────────┼──────────║
║    9     ║      3      ║     30     ║ 2020-05-08 ║    3     ║
╚══════════╩═════════════╩════════════╩════════════╩══════════╝
```

**Output:**

```
╔═════════════╦═════════╗
║ customer_id ║  name   ║
╠═════════════╬═════════╣
║      1      ║ Winston ║
╚═════════════╩═════════╝
```

**Explanation:**

**Winston:**

- June: 1 * 300 = 300
- July: 1 * 10 + 2 * 45 = 100 → qualifies.

**Jonathan:**

- June: 2 * 300 = 600
- July: 10 * 2 = 20 → excluded.

**Moustafa:**

- June: 2 * 10 + 2 * 45 = 110
- July: 0 → excluded.

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
