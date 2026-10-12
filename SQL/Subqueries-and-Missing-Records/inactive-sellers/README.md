# [Inactive Sellers](https://takeuforward.org/practice/sql/inactive-sellers?category=subqueries-and-missing-records&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

You run a web store and want to identify sellers who were inactive in 2020. These sellers had no sales during the year, and may need to be contacted for re-engagement or deactivation.

You are given the following tables:

Customer:

```
╔═══════════════╦══════════╗
║  Column Name  ║   Type   ║
╠═══════════════╬══════════╣
║  cutomer_id   ║   int    ║
║───────────────┼──────────║
║ customer_name ║ varchar  ║
╚═══════════════╩══════════╝
```

- customer_id: A unique number assigned to each customer. It's the primary key, meaning it uniquely identifies every row.&nbsp;
- customer_name: The name of the customer, stored as text.

Orders:

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║  order_id   ║   int    ║
║─────────────┼──────────║
║  sale_date  ║   date   ║
║─────────────┼──────────║
║ order_cost  ║   int    ║
║─────────────┼──────────║
║ customer_id ║   int    ║
║─────────────┼──────────║
║  seller_id  ║   int    ║
╚═════════════╩══════════╝
```

- order_id: Unique ID for each order. This is the primary key.
- sale_date: The date when the order was placed
- order_cost: The total cost of the order, stored as an integer
- customer_id: The ID of the customer who made the purchase. Refers to the customer_id in the Customer table.
- seller_id: The ID of the seller who sold the product. It links to a Seller table.

Seller:

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║  seller_id  ║   int    ║
║─────────────┼──────────║
║ seller_name ║ varchar  ║
╚═════════════╩══════════╝
```

- seller_id: A unique identifier for each seller. It’s the primary key of this table.
- seller_name: The name of the seller, stored as text.

Write a query to get the names of all sellers who made no sales during the year 2020. The result should be sorted by seller_name in ascending order.

### Example 1:

Example:

Input:

Customer:

```
╔═════════════╦═══════════════╗
║ customer_id ║ customer_name ║
╠═════════════╬═══════════════╣
║     101     ║     Alice     ║
║─────────────┼───────────────║
║     102     ║      Bob      ║
║─────────────┼───────────────║
║     103     ║    Charlie    ║
╚═════════════╩═══════════════╝
```

Orders:

```
╔══════════╦════════════╦════════════╦═════════════╦═══════════╗
║ order_id ║ sale_date  ║ order_cost ║ customer_id ║ seller_id ║
╠══════════╬════════════╬════════════╬═════════════╬═══════════╣
║    1     ║ 2020-03-01 ║    1500    ║     101     ║     1     ║
║──────────┼────────────┼────────────┼─────────────┼───────────║
║    2     ║ 2020-05-25 ║    2400    ║     102     ║     2     ║
║──────────┼────────────┼────────────┼─────────────┼───────────║
║    3     ║ 2019-05-25 ║    800     ║     101     ║     3     ║
║──────────┼────────────┼────────────┼─────────────┼───────────║
║    4     ║ 2020-09-13 ║    1000    ║     103     ║     2     ║
║──────────┼────────────┼────────────┼─────────────┼───────────║
║    5     ║ 2019-02-11 ║    700     ║     101     ║     2     ║
╚══════════╩════════════╩════════════╩═════════════╩═══════════╝
```

Seller:

```
╔═══════════╦═════════════╗
║ seller_id ║ seller_name ║
╠═══════════╬═════════════╣
║     1     ║   Daniel    ║
║───────────┼─────────────║
║     2     ║  Elizabeth  ║
║───────────┼─────────────║
║     3     ║    Frank    ║
╚═══════════╩═════════════╝
```

Output:

```
╔═════════════╗
║ seller_name ║
╠═════════════╣
║    Frank    ║
╚═════════════╝
```

Explanation:

- Daniel (ID 1): Sold on 2020-03-01 (Excluded)
- Elizabeth (ID 2): Sold on 2020-05-25 and 2020-09-13 (Excluded)
- Frank (ID 3): Only sold in 2019 (Included)

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
