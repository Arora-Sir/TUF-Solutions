# [Query Quality Analysis](https://takeuforward.org/practice/sql/query-quality-analysis?category=conditional-logic-and-calculations&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A search engine system logs query data including results, position in the search, and user ratings. Analysts want to evaluate query performance.

Given a **Queries** table with:

```
╔═════════════╦══════════╦══════════╦═════════╗
║ query_name  ║ result   ║ position ║ rating  ║
╠═════════════╬══════════╬══════════╬═════════╣
║ varchar     ║ varchar  ║ int      ║ int     ║
╚═════════════╩══════════╩══════════╩═════════╝
```

- query_name: The name of the search query.
- result: The search result returned.
- position: The rank of the result (1 to 500).
- rating: A rating score from 1 to 5 ( **rating < 3** is considered poor).

This table might contain duplicate rows.

You are required to calculate:

- **Query Quality** : This is calculated as the average of (query rating / query position).
- **Poor Query Percentage** : This is the percentage of queries where the rating is less than 3.

The result should display:

- query_name
- quality (rounded to 2 decimal places)
- poor_query_percentage (rounded to 2 decimal places)

The result can be returned in any order.

### Example 1:

**Input:**

```
Queries Table

╔═════════════╦════════════════════╦══════════╦═════════╗
║ query_name  ║ result             ║ position ║ rating  ║
╠═════════════╬════════════════════╬══════════╬═════════╣
║ Dog         ║ Golden Retriever   ║ 1        ║ 5       ║
║ Dog         ║ German Shepherd    ║ 2        ║ 5       ║
║ Dog         ║ Mule               ║ 200      ║ 1       ║
║ Cat         ║ Shirazi            ║ 5        ║ 2       ║
║ Cat         ║ Siamese            ║ 3        ║ 3       ║
║ Cat         ║ Sphynx             ║ 7        ║ 4       ║
╚═════════════╩════════════════════╩══════════╩═════════╝
```

**Output:**

```
╔════════════╦════════╦═══════════════════===═╗
║ query_name ║ quality║ poor_query_percentage ║
╠════════════╬════════╬═════════════════===═══╣
║ Dog        ║ 2.50   ║ 33.33                 ║
║ Cat        ║ 0.66   ║ 33.33                 ║
╚════════════╩════════╩══════════════════===══╝
```

**Explanation:**

- **Dog quality** - (5/1 + 5/2 + 1/200) / 3 = (5 + 2.5 + 0.005) / 3 ≈ 2.50
- **Dog poor %** - 1 poor result (1 rating) / 3 total = (1/3) × 100 = 33.33%
- **Cat quality** - (2/5 + 3/3 + 4/7) / 3 = (0.4 + 1 + 0.5714) / 3 ≈ 0.66
- **Cat poor %** - 1 poor result / 3 total = (1/3) × 100 = 33.33%

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
