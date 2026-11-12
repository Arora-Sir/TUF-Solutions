# [Find the Largest Window Between User Visits](https://takeuforward.org/practice/sql/find-the-largest-window-between-user-visits?category=window-functions-pre&source=sql---75-frequently-asked-interview-questions&sidebar=0)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

We have a table named **UserVisits** that contains the records of user visits to a retailer on specific dates.

**Table: UserVisits**

```
╔═════════════╦══════╗
║ Column Name ║ Type ║
╠═════════════╬══════╣
║   user_id   ║ int  ║
║─────────────┼──────║
║ visit_date  ║ date ║
╚═════════════╩══════╝
```

- This table does not have a primary key and may contain duplicate rows.
- user_id is the identifier for the user.
- visit_date is the date when the user visited the retailer.
- Assume today's date is **'2021-01-01'** .

**Task:**

Write a query to find, for each user_id, the largest window of days between each visit and the one right after it (or today if it is the last visit).

Return the result table ordered by user_id.

### Example 1:

**Example:**

**Input:**

UserVisits table:

```
╔═════════╦════════════╗
║ user_id ║ visit_date ║
╠═════════╬════════════╣
║    1    ║ 2020-11-28 ║
║─────────┼────────────║
║    1    ║ 2020-10-20 ║
║─────────┼────────────║
║    1    ║ 2020-12-03 ║
║─────────┼────────────║
║    2    ║ 2020-10-05 ║
║─────────┼────────────║
║    2    ║ 2020-12-09 ║
║─────────┼────────────║
║    3    ║ 2020-11-11 ║
╚═════════╩════════════╝
```

**Output:**

```
╔═════════╦═══════════════╗
║ user_id ║ biggest_window║
╠═════════╬═══════════════╣
║    1    ║      39       ║
║─────────┼───────────────║
║    2    ║      65       ║
║─────────┼───────────────║
║    3    ║      51       ║
╚═════════╩═══════════════╝
```

**Explanation:**

For user 1, the windows are:

- Between 2020-10-20 and 2020-11-28, which is a total of 39 days.
- Between 2020-11-28 and 2020-12-03, which is a total of 5 days.
- Between 2020-12-03 and 2021-01-01, which is a total of 29 days.
- The largest window is **39 days** .

For user 2, the windows are:

- Between 2020-10-05 and 2020-12-09, which is a total of 65 days.
- Between 2020-12-09 and 2021-01-01, which is a total of 23 days.
- The largest window is **65 days** .

For user 3, the only window is:

- Between 2020-11-11 and 2021-01-01, which is a total of **51 days** .

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
