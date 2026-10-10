# [All-Product Buyers](https://takeuforward.org/practice/sql/all-product-buyers?source=sql---75-frequently-asked-interview-questions&category=subqueries-and-missing-records)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

A company wants to identify customers who have purchased all available products in their catalog. This helps the company target promotions and understand customer engagement.

You are given two tables:

**Customer Table**

```
╔═════════════╦══════════╗
║ Column name ║   Type   ║
╠═════════════╬══════════╣
║ customer_id ║   int    ║
║─────────────┼──────────║
║ product_key ║   int    ║
╚═════════════╩══════════╝
```

**Product Table**

```
╔═════════════╦══════════╗
║ Column name ║   Type   ║
╠═════════════╬══════════╣
║ product_key ║   int    ║
╚═════════════╩══════════╝
```

- **customer_id** : Unique ID of the customer.
- **product_key** : The ID of the product purchased by the customer or listed in the catalog.

**Note:** There may be duplicate rows in the Customer table.

Write an SQL query to find the customer_ids of customers who have bought **all** products from the Product table. The result should be returned in ascending order of customer_id.

### Example 1:

**Example:**

**Input:**

```
Customer Table:
╔══════════════╦═════════════╗
║ customer_id  ║ product_key ║
╠══════════════╬═════════════╣
║ 1            ║ 5           ║
║ 2            ║ 6           ║
║ 3            ║ 5           ║
║ 3            ║ 6           ║
║ 1            ║ 6           ║
╚══════════════╩═════════════╝

Product Table:
╔═════════════╗
║ product_key ║
╠═════════════╣
║ 5           ║
║ 6           ║
╚═════════════╝
```

**Output:**

```
╔═════════════╗
║ customer_id ║
╠═════════════╣
║ 1           ║
║ 3           ║
╚═════════════╝
```

**Explanation:**

- Customer 1 bought products 5 and 6 → **Included** .
- Customer 2 only bought product 6 → **Excluded** .
- Customer 3 bought products 5 and 6 → **Included** .

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
