# [Track Continuous Periods of Task Failures and Successes](https://takeuforward.org/practice/sql/track-continuous-periods-of-task-failures-and-successes?category=consecutive-sequences-and-ranges&source=sql---75-frequently-asked-interview-questions&sidebar=0)

![Difficulty: Pro](https://img.shields.io/badge/Difficulty-Pro-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

We have two tables: **Failed** and **Succeeded** , which contain the dates of failed and succeeded tasks, respectively.

**Table: Failed**

```
+--------------+---------+
| Column Name  | Type    |
+--------------+---------+
| fail_date    | date    |
+--------------+---------+
```

- **fail_date** is the primary key for this table and contains the dates when tasks failed.

**Table: Succeeded**

```
+--------------+---------+
| Column Name  | Type    |
+--------------+---------+
| success_date | date    |
+--------------+---------+
```

- **success_date** is the primary key for this table and contains the dates when tasks succeeded.

**Task:**

Write a query to report the **period_state** for each continuous interval of days from **2019-01-01** to **2019-12-31** . The **period_state** will be **failed** if all tasks in the interval failed, or **succeeded** if all tasks in the interval succeeded. The result should also include the **start_date** and **end_date** for each continuous period.

Return the result table ordered by **start_date** .

### Example 1:

**Example:**

**Input:**

Failed table:

```
+-------------------+
| fail_date         |
+-------------------+
| 2018-12-28        |
| 2018-12-29        |
| 2019-01-04        |
| 2019-01-05        |
+-------------------+
```

Succeeded table:

```
+-------------------+
| success_date      |
+-------------------+
| 2018-12-30        |
| 2018-12-31        |
| 2019-01-01        |
| 2019-01-02        |
| 2019-01-03        |
| 2019-01-06        |
+-------------------+
```

**Output:**

```
+--------------+--------------+--------------+
| period_state | start_date   | end_date     |
+--------------+--------------+--------------+
| succeeded    | 2019-01-01   | 2019-01-03   |
| failed       | 2019-01-04   | 2019-01-05   |
| succeeded    | 2019-01-06   | 2019-01-06   |
+--------------+--------------+--------------+
```

**Explanation:**

- The report ignores the system state in 2018 since we care only about the period from **2019-01-01** to **2019-12-31** .
- From **2019-01-01** to **2019-01-03** , all tasks succeeded, so the system state is **succeeded** .
- From **2019-01-04** to **2019-01-05** , all tasks failed, so the system state is **failed** .
- On **2019-01-06** , all tasks succeeded, so the system state is **succeeded** for that day.

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
