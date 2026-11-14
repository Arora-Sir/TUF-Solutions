# [Find Continuous Ranges in Logs](https://takeuforward.org/practice/sql/find-continuous-ranges-in-logs?category=consecutive-sequences-and-ranges&source=sql---75-frequently-asked-interview-questions&sidebar=0)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

We have a table named **Logs** that contains log IDs.

**Table: Logs**

```
╔═══════════════╦═════════╗
║ Column Name   ║  Type   ║
╠═══════════════╬═════════╣
║    log_id     ║   int   ║
╚═══════════════╩═════════╝
```

**log_id** is the primary key and contains unique values for this table.

Each row in this table represents a log with a unique log_id.

**Task:**

Write a query to find the start and end number of continuous ranges in the Logs table.

Return the result table ordered by **start_id** .

### Example 1:

**Example**

**Input:**

**Logs table:**

```
╔════════════╗
║   log_id   ║
╠════════════╣
║     1      ║
║────────────║
║     2      ║
║────────────║
║     3      ║
║────────────║
║     7      ║
║────────────║
║     8      ║
║────────────║
║    10      ║
╚════════════╝
```

**Output:**

```
╔════════════╦══════════════╗
║  start_id  ║    end_id    ║
╠════════════╬══════════════╣
║     1      ║      3       ║
║────────────┼──────────────║
║     7      ║      8       ║
║────────────┼──────────────║
║    10      ║     10       ║
╚════════════╩══════════════╝
```

**Explanation:**

The range from 1 to 3 is continuous in the table.

The range from 7 to 8 is continuous in the table.

The number 10 is a single value and thus forms its own range.

Numbers from 4 to 6 and 9 are missing in the table, so they are not included.

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
