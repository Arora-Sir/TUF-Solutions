# [Warmer Days](https://takeuforward.org/practice/sql/warmer-days?category=date-and-time-analysis&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

A weather monitoring system tracks daily temperatures in a database.

The meteorological team wants to identify days when the temperature was higher than the specific day.

Your task is to find all dates where the temperature was higher than the day before.

The company maintains a table named **Weather** with the following schema:

```
Table: Weather
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║     id      ║   int    ║
║─────────────┼──────────║
║ recordDate  ║   date   ║
║─────────────┼──────────║
║ temperature ║   int    ║
╚═════════════╩══════════╝
```

- id: A unique identifier (primary key) for each record.
- recordDate: The date when the temperature was recorded.
- temperature: The temperature recorded on that date.

Note - No two rows have the same recordDate.

You need to find the id of all dates where the temperature was higher than the previous day's temperature. The result can be returned in any order.

### Example 1:

**Example:**

**Input:**

```
╔══════════╦════════════╦═════════════╗
║    id    ║ recordDate ║ temperature ║
╠══════════╬════════════╬═════════════╣
║    1     ║ 2023-06-01 ║     18      ║
║──────────┼────────────┼─────────────║
║    2     ║ 2023-06-02 ║     22      ║
║──────────┼────────────┼─────────────║
║    3     ║ 2023-06-03 ║     20      ║
║──────────┼────────────┼─────────────║
║    4     ║ 2023-06-04 ║     28      ║
╚══════════╩════════════╩═════════════╝
```

**Output:**

```
╔══════════╗
║    id    ║
╠══════════╣
║    2     ║
║──────────║
║    4     ║
╚══════════╝
```

**Explanation:**

- June 2 (id = 2) - 22°C is higher than June 1’s 18°C.
- June 3 (id = 3) - 20°C is not higher than June 2’s 22°C.
- June 4 (id = 4) - 28°C is higher than June 3’s 20°C.

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
