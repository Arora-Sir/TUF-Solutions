# [Product Selling Price Report](https://takeuforward.org/practice/sql/product-selling-price-report?category=date-and-time-analysis&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

A retail system maintains price history for products over defined time periods and tracks sales by date. Management wants to calculate the average price at which each product was sold, using actual units sold and corresponding prices.

There are two tables:

**Prices Table**

```
╔═════════════╦══════════╗
║ Column Name ║ Type     ║
╠═════════════╬══════════╣
║ product_id  ║ int      ║
║ start_date  ║ date     ║
║ end_date    ║ date     ║
║ price       ║ int      ║
╚═════════════╩══════════╝
```

- product_id: ID of the product.
- start_date: The date when this price period begins.
- end_date: The date when this price period ends.
- price: The product price during this date range.

**UnitsSold Table**

```
╔═══════════════╦══════════╗
║ Column Name   ║ Type     ║
╠═══════════════╬══════════╣
║ product_id    ║ int      ║
║ purchase_date ║ date     ║
║ units         ║ int      ║
╚═══════════════╩══════════╝
```

- product_id: ID of the product sold.
- purchase_date: Date the product was purchased.
- units: Number of units sold on that day.

Write an SQL query to return the product_id and average_price for each product. Round average_price to 2 decimal places. Return 0 for average_price if the product has no sales.

The result can be returned in any order.

### Example 1:

**Example:**

**Input:**

```
Prices Table:

product_id | start_date  | end_date   | price
-----------|-------------|------------|------
1          | 2019-02-17  | 2019-02-28 | 5
1          | 2019-03-01  | 2019-03-22 | 20
2          | 2019-02-01  | 2019-02-20 | 15
2          | 2019-02-21  | 2019-03-31 | 30


UnitsSold Table:

product_id | purchase_date | units
-----------|----------------|------
1          | 2019-02-25     | 100
1          | 2019-03-01     | 15
2          | 2019-02-10     | 200
2          | 2019-03-22     | 30
```

**Output:**

```
product_id | average_price
-----------|---------------
1          | 6.96
2          | 16.96
```

**Explanation:**

- **Product 1** : 100 units @ $5 = $500, 15 units @ $20 = $300. Total = $800 / 115 units = 6.96
- **Product 2** : 200 units @ $15 = $3000, 30 units @ $30 = $900. Total = $3900 / 230 units = 16.96

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
