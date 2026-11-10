# [Find Team Size for Each Employee](https://takeuforward.org/practice/sql/find-team-size-for-each-employee?category=window-functions-pre&source=sql---75-frequently-asked-interview-questions&sidebar=0)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

We have a table named **Employee** that contains the information about employees and their respective teams.

**Table: Employee**

```
+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| employee_id   | int     |
| team_id       | int     |
+---------------+---------+
```

- employee_id is the primary key (a unique column) for this table.
- Each row in this table contains the employee_id of an employee and their team_id.

**Task:**

Your task is to write a query that returns the employee_id and their respective team size (number of employees in the same team).

Return the result table in ascending order by employee_id.

### Example 1:

**Example:**

**Input:**

Employee Table:

```
+-------------+------------+
| employee_id | team_id    |
+-------------+------------+
|     1       |     8      |
|     2       |     8      |
|     3       |     8      |
|     4       |     7      |
|     5       |     9      |
|     6       |     9      |
+-------------+------------+
```

**Output:**

```
+-------------+------------+
| employee_id | team_size  |
+-------------+------------+
|     1       |     3      |
|     2       |     3      |
|     3       |     3      |
|     4       |     1      |
|     5       |     2      |
|     6       |     2      |
+-------------+------------+
```

**Explanation:**

- Employees with IDs 1, 2, and 3 belong to the same team (team_id = 8) and hence their team size is 3.
- Employee with ID 4 belongs to a team with team_id = 7, so their team size is 1.
- Employees with IDs 5 and 6 belong to the same team (team_id = 9), so their team size is 2.

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
