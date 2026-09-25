# [Apples vs Oranges](https://takeuforward.org/practice/sql/apples-vs-oranges?category=conditional-logic-and-calculations&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

In a fruit sales business, it is important to track the sales of different fruits like apples and oranges. Understanding the sales difference between these fruits each day can help in inventory management, pricing strategies, and promotional activities.

You are given a table named **Sales** :

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║  sale_date  ║   date   ║
║─────────────┼──────────║
║    fruit    ║   enum   ║
║─────────────┼──────────║
║  sold_num   ║   int    ║
╚═════════════╩══════════╝
```

- **sale_date:** The date of the sale.
- **fruit:** The type of fruit.
- **sold_num:** The number of fruits sold.
- Primary Key: **(sale_date, fruit)** .

Write a query to calculate the difference between the number of apples and oranges sold for each day. The result should be sorted by sale_date.

### Example 1:

**Example:**

**Input:**

Sales Table

```
╔════════════╦═════════╦══════════╗
║ sale_date  ║  fruit  ║ sold_num ║
╠════════════╬═════════╬══════════╣
║ 2020-05-01 ║ apples  ║    10    ║
║────────────┼─────────┼──────────║
║ 2020-05-01 ║ oranges ║    8     ║
║────────────┼─────────┼──────────║
║ 2020-05-02 ║ apples  ║    15    ║
║────────────┼─────────┼──────────║
║ 2020-05-02 ║ oranges ║    15    ║
║────────────┼─────────┼──────────║
║ 2020-05-03 ║ apples  ║    20    ║
║────────────┼─────────┼──────────║
║ 2020-05-03 ║ oranges ║    0     ║
║────────────┼─────────┼──────────║
║ 2020-05-04 ║ apples  ║    15    ║
║────────────┼─────────┼──────────║
║ 2020-05-04 ║ oranges ║    16    ║
╚════════════╩═════════╩══════════╝
```

**Expected Output:**

```
╔════════════╦══════╗
║ sale_date  ║ diff ║
╠════════════╬══════╣
║ 2020-05-01 ║  2   ║
║────────────┼──────║
║ 2020-05-02 ║  0   ║
║────────────┼──────║
║ 2020-05-03 ║  20  ║
║────────────┼──────║
║ 2020-05-04 ║  -1  ║
╚════════════╩══════╝
```

**Explanation:**

- On 2020-05-01, 10 apples and 8 oranges were sold, so the difference is 10 - 8 = 2.
- On 2020-05-02, 15 apples and 15 oranges were sold, so the difference is 15 - 15 = 0.
- On 2020-05-03, 20 apples and 0 oranges were sold, so the difference is 20 - 0 = 20.
- On 2020-05-04, 15 apples and 16 oranges were sold, so the difference is 15 - 16 = -1.

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
