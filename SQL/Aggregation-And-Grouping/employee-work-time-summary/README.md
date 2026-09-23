# [Employee Work Time Summary](https://takeuforward.org/practice/sql/employee-work-time-summary?category=aggregation-and-grouping&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

In a workplace with flexible entry and exit times, employees may clock in and out multiple times a day. As an HR analyst, you need to calculate how long each employee actually spent in the office each day. This helps in attendance tracking, overtime calculations, and productivity monitoring.

You are given an **Employees** table.

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║   emp_id    ║   int    ║
║─────────────┼──────────║
║ event_day   ║   date   ║
║─────────────┼──────────║
║  in_time    ║   int    ║
║─────────────┼──────────║
║  out_time   ║   int    ║
╚═════════════╩══════════╝
```

- **emp_id:** The unique identifier for the employee.
- **event_day:** The day the entry/exit occurred.
- **in_time:** Time (in minutes from 00:00) when the employee entered.
- **out_time:** Time (in minutes from 00:00) when the employee exited.
- Primary Key: **(emp_id, event_day, in_time)** , this ensures that each entry and exit record for an employee on a particular day is unique.
- **in_time < out_time** , so the entry time is always earlier than the exit time.

Write a query to calculate the total time (in minutes) spent by each employee at the office on each day.

Return the result ordered by event_day and emp_id in ascending order.

**Note:** An employee can enter and leave the office multiple times in one day, and the time spent during each entry is the difference between out_time and in_time.

### Example 1:

**Example:**

**Input:**

Employees table

```
╔════════╦════════════╦═════════╦══════════╗
║ emp_id ║ event_day  ║ in_time ║ out_time ║
╠════════╬════════════╬═════════╬══════════╣
║   1    ║ 2020-11-28 ║    4    ║    32    ║
║────────┼────────────┼─────────┼──────────║
║   1    ║ 2020-11-28 ║   55    ║   200    ║
║────────┼────────────┼─────────┼──────────║
║   1    ║ 2020-12-03 ║    1    ║    42    ║
║────────┼────────────┼─────────┼──────────║
║   2    ║ 2020-11-28 ║    3    ║    33    ║
║────────┼────────────┼─────────┼──────────║
║   2    ║ 2020-12-09 ║   47    ║    74    ║
╚════════╩════════════╩═════════╩══════════╝
```

**Expected Output:**

```
╔════════════╦════════╦════════════╗
║    day     ║ emp_id ║ total_time ║
╠════════════╬════════╬════════════╣
║ 2020-11-28 ║   1    ║    173     ║
║────────────┼────────┼────────────║
║ 2020-11-28 ║   2    ║    30      ║
║────────────┼────────┼────────────║
║ 2020-12-03 ║   1    ║    41      ║
║────────────┼────────┼────────────║
║ 2020-12-09 ║   2    ║    27      ║
╚════════════╩════════╩════════════╝
```

**Explanation:**

- For emp_id = 1 on 2020-11-28: (32 - 4) + (200 - 55) = 28 + 145 = 173
- For emp_id = 2 on 2020-11-28: 33 - 3 = 30
- For emp_id = 1 on 2020-12-03: 42 - 1 = 41
- For emp_id = 2 on 2020-12-09: 74 - 47 = 27

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
