# [Big Countries](https://takeuforward.org/practice/sql/big-countries?category=querying-and-filtering&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A global research organisation is analysing big countries based on either their land area or population size.&nbsp;

Your task is to identify and retrieve big countries based on some criteria. The company maintains a table named **World** , which stores data about different countries.

```
╔═════════════╦══════════╗
║ Column name ║   Type   ║
╠═════════════╬══════════╣
║    name     ║ varchar  ║
║─────────────┼──────────║
║  continent  ║ varchar  ║
║─────────────┼──────────║
║    area     ║   int    ║
║─────────────┼──────────║
║ population  ║   int    ║
║─────────────┼──────────║
║     gdp     ║  bigint  ║
╚═════════════╩══════════╝
```

- name: The name of the country, which is the primary key.
- continent: The continent to which the country belongs.
- area: The total land area of the country (in square kilometers).
- population: The total population of the country.
- gdp: The gross domestic product (GDP) of the country.&nbsp;

A country is classified as big countries/ large nations if:

- It has an area of at least 3,000,000 km², OR
- It has a population of at least 25,000,000.

You need to return the name, population, and area of these big countries. The result can be returned in any order.

### Example 1:

Example:

Input: World Table

```
╔═══════════╦════════════════╦══════════╦════════════╦══════════════╗
║   name    ║   continent    ║   area   ║ population ║     gdp      ║
╠═══════════╬════════════════╬══════════╬════════════╬══════════════╣
║ Greenland ║ North America  ║  652230  ║  25500100  ║ 20343000000  ║
║───────────┼────────────────┼──────────┼────────────┼──────────────║
║  Iceland  ║     Europe     ║  28748   ║  2831741   ║ 12960000000  ║
║───────────┼────────────────┼──────────┼────────────┼──────────────║
║  Brazil   ║ South America  ║ 2381741  ║  37100000  ║ 188681000000 ║
║───────────┼────────────────┼──────────┼────────────┼──────────────║
║   Fiji    ║    Oceania     ║   468    ║   78115    ║  3712000000  ║
║───────────┼────────────────┼──────────┼────────────┼──────────────║
║   Nepal   ║      Asia      ║ 1246700  ║  20609294  ║ 100990000000 ║
╚═══════════╩════════════════╩══════════╩════════════╩══════════════╝
```

Output:

```
╔═══════════╦════════════╦══════════╗
║   name    ║ population ║   area   ║
╠═══════════╬════════════╬══════════╣
║ Greenland ║  25500100  ║  652230  ║
║───────────┼────────────┼──────────║
║   Brazil  ║  37100000  ║ 2381741  ║
╚═══════════╩════════════╩══════════╝
```

Explanation:

Greenland - Has a population of 25,500,100 (≥ 25M), so it's included.

Brazil - Has a population of 37,100,000 (≥ 25M), so it's included.

Iceland - Has area = 28,748 km² and population = 2,831,741, so it's excluded.

Fiji - Has area = 468 km² and population = 78,115, so it's excluded.

Nepal - Has area = 1,246,700 km² and population = 20,609,294 (both less than required), so it's excluded.

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
