# [Reshape Products Data](https://takeuforward.org/practice/sql/reshape-products-data?source=sql---75-frequently-asked-interview-questions&category=set-operations-and-combined-results)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

Imagine you're managing a multi-store inventory system where product pricing is tracked per store. Currently, the pricing data is stored in wide format (each store in a separate column). To generate reports or feed into dashboards, the data must be converted to a particular format.

You are given a **Products** table:

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║ product_id  ║   int    ║
║─────────────┼──────────║
║   store1    ║   int    ║
║─────────────┼──────────║
║   store2    ║   int    ║
║─────────────┼──────────║
║   store3    ║   int    ║
╚═════════════╩══════════╝
```

- **product_id:** Unique ID of the product (Primary Key)
- **store1:** Price of the product in Store 1 (nullable)
- **store2:** Price of the product in Store 2 (nullable)
- **store3:** Price of the product in Store 3 (nullable)
- A price of NULL means the product is not available in that store.

Write a query to transform the Products table so that each row contains the product_id, the store name, and its corresponding price. If a product is not available in a store (i.e., the price is NULL), exclude that row from the result.

Return the result ordered by product_id, store, and price in ascending order.

### Example 1:

**Example:**

**Input:**

Products table:

```
╔════════════╦════════╦════════╦════════╗
║ product_id ║ store1 ║ store2 ║ store3 ║
╠════════════╬════════╬════════╬════════╣
║     0      ║   95   ║  100   ║  105   ║
║────────────┼────────┼────────┼────────║
║     1      ║   70   ║  NULL  ║   80   ║
╚════════════╩════════╩════════╩════════╝
```

**Expected Output:**

```
╔════════════╦════════╦═══════╗
║ product_id ║ store  ║ price ║
╠════════════╬════════╬═══════╣
║     0      ║ store1 ║  95   ║
║────────────┼────────┼───────║
║     0      ║ store2 ║  100  ║
║────────────┼────────┼───────║
║     0      ║ store3 ║  105  ║
║────────────┼────────┼───────║
║     1      ║ store1 ║  70   ║
║────────────┼────────┼───────║
║     1      ║ store3 ║  80   ║
╚════════════╩════════╩═══════╝
```

**Explanation:**

- **Product 0:** Available in all stores, all rows included.
- **Product 1:** Available only in store1 and store3, store2 excluded due to NULL.

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
