# [Find the Most Recent Order for Each Product](https://takeuforward.org/practice/sql/find-the-most-recent-order-for-each-product?category=ranking-and-top-n-queries&source=sql---75-frequently-asked-interview-questions&sidebar=0)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

We have three tables: **Customers** , **Orders** , and **Products** .

**Table: Customers**

```
+-------------+-----------+
| Column Name | Type      |
+-------------+-----------+
| customer_id | int       |
| name        | varchar   |
+-------------+-----------+
```

customer_id is the primary key for this table and contains information about each customer.

**Table: Orders**

```
+-------------+------------+
| Column      | Type       | 
+-------------+------------+
| order_id    | int        |
| order_date  | date       |
| customer_id | int        |
| product_id  | int        |
+-------------+------------+
```

order_id is the primary key for this table.

customer_id references the customer who placed the order.

product_id references the product that was ordered.

**Table: Products**

```
+--------------+--------------+
| Column       | Type         |
+--------------+--------------+
| product_id   | int          |
| product_name | varchar      |
| price        | int          |
+--------------+--------------+
```

product_id is the primary key for this table.

product_name refers to the name of the product.

price refers to the price of the product.

**Task:**

Write a query to find the most recent order(s) for each product. Order the results by product_name, then product_id, and then order_id, all in ascending order.

### Example 1:

**Example:**

**Input:**

Customers table:

```
+-------------+-----------+
| customer_id | name      |
+-------------+-----------+
| 1           | Winston   |
| 2           | Jonathan  |
| 3           | Annabelle |
| 4           | Marwan    |
| 5           | Khaled    |
+-------------+-----------+
```

Orders table:

```
+----------+------------+-------------+------------+
| order_id | order_date | customer_id | product_id |
+----------+------------+-------------+------------+
| 1        | 2020-07-31 | 1           | 1          |
| 2        | 2020-07-30 | 2           | 2          |
| 3        | 2020-08-29 | 3           | 3          |
| 4        | 2020-07-29 | 4           | 1          |
| 5        | 2020-06-10 | 1           | 2          |
| 6        | 2020-08-01 | 2           | 1          |
| 7        | 2020-08-01 | 3           | 1          |
| 8        | 2020-08-03 | 1           | 2          |
| 9        | 2020-08-07 | 2           | 3          |
| 10       | 2020-07-15 | 1           | 2          |
+----------+------------+-------------+------------+
```

Products table:

```
+------------+--------------+-------+
| product_id | product_name | price |
+------------+--------------+-------+
| 1          | keyboard     | 120   |
| 2          | mouse        | 80    |
| 3          | screen       | 600   |
| 4          | hard disk    | 450   |
+------------+--------------+-------+
```

**Output:**

```
+--------------+------------+----------+------------+
| product_name | product_id | order_id | order_date |
+--------------+------------+----------+------------+
| keyboard     | 1          | 6        | 2020-08-01 |
| keyboard     | 1          | 7        | 2020-08-01 |
| mouse        | 2          | 8        | 2020-08-03 |
| screen       | 3          | 3        | 2020-08-29 |
+--------------+------------+----------+------------+
```

**Explanation:**

Keyboard was ordered twice on 2020-08-01, so both these orders are considered as the most recent.

Mouse was most recently ordered on 2020-08-03.

Screen was most recently ordered on 2020-08-29.

Hard disk was never ordered and hence does not appear in the result.

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
