# [Big Countries](https://takeuforward.org/practice/sql/big-countries?category=querying-and-filtering&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A global research organisation is analysing big countries based on either their land area or population size.&nbsp;

Your task is to identify and retrieve big countries based on some criteria. The company maintains a table named **World** , which stores data about different countries.

╔═════════════╦══════════╗
║ Column name ║ &nbsp; Type &nbsp; ║
╠═════════════╬══════════╣
║ &nbsp; &nbsp;name &nbsp; &nbsp; ║ varchar &nbsp;║
║─────────────┼──────────║
║ &nbsp;continent &nbsp;║ varchar &nbsp;║
║─────────────┼──────────║
║ &nbsp; &nbsp;area &nbsp; &nbsp; ║ &nbsp; int &nbsp; &nbsp;║
║─────────────┼──────────║
║ population &nbsp;║ &nbsp; int &nbsp; &nbsp;║
║─────────────┼──────────║
║ &nbsp; &nbsp; gdp &nbsp; &nbsp; ║ &nbsp;bigint &nbsp;║
╚═════════════╩══════════╝
</pre>
- name: The name of the country, which is the primary key.
- continent: The continent to which the country belongs.
- area: The total land area of the country (in square kilometers).
- population: The total population of the country.
- gdp: The gross domestic product (GDP) of the country.&nbsp;

<p>A country is classified as big countries/ large nations if:

- It has an area of at least 3,000,000 km², OR
- It has a population of at least 25,000,000.

You need to return the name, population, and area of these big countries. The result can be returned in any order.

### Example 1:

Example:

Input: World Table

╔═══════════╦════════════════╦══════════╦════════════╦══════════════╗
║ &nbsp; name &nbsp; &nbsp;║ &nbsp; continent &nbsp; &nbsp;║ &nbsp; area &nbsp; ║ population ║ &nbsp; &nbsp; gdp &nbsp; &nbsp; &nbsp;║
╠═══════════╬════════════════╬══════════╬════════════╬══════════════╣
║ Greenland ║ North America &nbsp;║ &nbsp;652230 &nbsp;║ &nbsp;25500100 &nbsp;║ 20343000000 &nbsp;║
║───────────┼────────────────┼──────────┼────────────┼──────────────║
║ &nbsp;Iceland &nbsp;║ &nbsp; &nbsp; Europe &nbsp; &nbsp; ║ &nbsp;28748 &nbsp; ║ &nbsp;2831741 &nbsp; ║ 12960000000 &nbsp;║
║───────────┼────────────────┼──────────┼────────────┼──────────────║
║ &nbsp;Brazil &nbsp; ║ South America &nbsp;║ 2381741 &nbsp;║ &nbsp;37100000 &nbsp;║ 188681000000 ║
║───────────┼────────────────┼──────────┼────────────┼──────────────║
║ &nbsp; Fiji &nbsp; &nbsp;║ &nbsp; &nbsp;Oceania &nbsp; &nbsp; ║ &nbsp; 468 &nbsp; &nbsp;║ &nbsp; 78115 &nbsp; &nbsp;║ &nbsp;3712000000 &nbsp;║
║───────────┼────────────────┼──────────┼────────────┼──────────────║
║ &nbsp; Nepal &nbsp; ║ &nbsp; &nbsp; &nbsp;Asia &nbsp; &nbsp; &nbsp;║ 1246700 &nbsp;║ &nbsp;20609294 &nbsp;║ 100990000000 ║
╚═══════════╩════════════════╩══════════╩════════════╩══════════════╝
</pre><p>Output:

╔═══════════╦════════════╦══════════╗
║ &nbsp; name &nbsp; &nbsp;║ population ║ &nbsp; area &nbsp; ║
╠═══════════╬════════════╬══════════╣
║ Greenland ║ &nbsp;25500100 &nbsp;║ &nbsp;652230 &nbsp;║
║───────────┼────────────┼──────────║
║ &nbsp; Brazil &nbsp;║ &nbsp;37100000 &nbsp;║ 2381741 &nbsp;║
╚═══════════╩════════════╩══════════╝
</pre><p>Explanation:

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
