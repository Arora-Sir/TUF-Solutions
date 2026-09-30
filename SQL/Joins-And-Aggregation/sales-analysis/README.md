# [Sales Analysis](https://takeuforward.org/practice/sql/sales-analysis?category=joins-and-aggregation&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A company tracks product sales over different years. Each sale record includes the product ID, year of sale, quantity sold, and price per unit, the company wants to analyze yearly sales trends.

Your task is to generate this sales report by joining product names with sales data.

The company maintains two tables:

**Sales** table, which contains:

```
╔═════════════╦══════════╗
║ Column name ║   Type   ║
╠═════════════╬══════════╣
║   sale_id   ║   int    ║
║─────────────┼──────────║
║ product_id  ║   int    ║
║─────────────┼──────────║
║    year     ║   int    ║
║─────────────┼──────────║
║  quantity   ║   int    ║
║─────────────┼──────────║
║    price    ║   int    ║
╚═════════════╩══════════╝
```

- sale_id: A unique identifier for each sale transaction.
- product_id: The ID (foreign key) of the product being sold.
- year: The year in which the sale occurred.
- quantity: The number of units sold.
- price: The price per unit at the time of the sale.

Here, (sale_id, year) is the primary key (combination of columns with unique values) of this table.

**Product** table, which contains:

```
╔══════════════╦═══════════╗
║ Column name  ║   Type    ║
╠══════════════╬═══════════╣
║  product_id  ║    int    ║
║──────────────┼───────────║
║ product_name ║  varchar  ║
╚══════════════╩═══════════╝
```

- product_id: The unique ID (primary key) of each product.
- product_name: The name of the product.

Your task is to **retrieve the product name, year of sale, and price per unit** for each sale.

The result should be returned **in any order** .

### Example 1:

Input:

Sales Table:

```
╔══════════╦════════════╦══════════╦══════════╦══════════╗
║ sale_id  ║ product_id ║   year   ║ quantity ║  price   ║
╠══════════╬════════════╬══════════╬══════════╬══════════╣
║    1     ║    101     ║   2008   ║    10    ║   5000   ║
║──────────┼────────────┼──────────┼──────────┼──────────║
║    2     ║    101     ║   2009   ║    12    ║   5000   ║
║──────────┼────────────┼──────────┼──────────┼──────────║
║    3     ║    202     ║   2011   ║    15    ║   9000   ║
╚══════════╩════════════╩══════════╩══════════╩══════════╝
```

Product Table:

```
╔════════════╦══════════════╗
║ product_id ║ product_name ║
╠════════════╬══════════════╣
║    101     ║     Sony     ║
║────────────┼──────────────║
║    202     ║    Lenovo    ║
║────────────┼──────────────║
║    303     ║     Dell     ║
╚════════════╩══════════════╝
```

Output:

```
╔══════════════╦══════════╦══════════╗
║ product_name ║   year   ║  price   ║
╠══════════════╬══════════╬══════════╣
║     Sony     ║   2008   ║   5000   ║
║──────────────┼──────────┼──────────║
║     Sony     ║   2009   ║   5000   ║
║──────────────┼──────────┼──────────║
║    Lenovo    ║   2011   ║   9000   ║
╚══════════════╩══════════╩══════════╝
```

Explanation:

- Sony (product_id = 101) - Sold for 5000 in 2008 and 5000 in 2009.
- Lenovo (product_id = 202) - Sold for 9000 in 2011.
- Dell (product_id = 303) - No matching sale in Sales table, so it's excluded.

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
