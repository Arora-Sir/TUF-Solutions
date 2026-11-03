# [Most Experienced Employees in Each Project](https://takeuforward.org/practice/sql/most-experienced-employees-in-each-project?category=ranking-and-top-n-queries&source=sql---75-frequently-asked-interview-questions&sidebar=0)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

We have two tables: **Project** and **Employee** .

**Table: Project**

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| project_id  | int     |
| employee_id | int     |
+-------------+---------+
```

- (project_id, employee_id) is the primary key for this table.
- employee_id is a foreign key that references the Employee table.
- Each row of this table indicates that the employee with employee_id is working on the project with project_id.

**Table: Employee**

```
+------------------+---------+
| Column Name      | Type    |
+------------------+---------+
| employee_id      | int     |
| name             | varchar |
| experience_years | int     |
+------------------+---------+
```

- employee_id is the primary key for this table.
- Each row of this table contains information about one employee, including their employee_id, name, and the experience_years they have.

Write a query to find the most experienced employees for each project. In case of a tie, report all employees with the maximum number of experience years for that project.

Return the result ordered by project_id in ascending order. If multiple employees are returned for the same project, order them by employee_id in ascending order.

### Example 1:

**Example:**

**Input:**

Project table:

```
+-------------+-------------+
| project_id  | employee_id |
+-------------+-------------+
| 1           | 1           |
| 1           | 2           |
| 1           | 3           |
| 2           | 1           |
| 2           | 4           |
+-------------+-------------+
```

Employee table:

```
+-------------+--------+------------------+
| employee_id | name   | experience_years |
+-------------+--------+------------------+
| 1           | Khaled | 3                |
| 2           | Ali    | 2                |
| 3           | John   | 3                |
| 4           | Doe    | 2                |
+-------------+--------+------------------+
```

**Output:**

```
+-------------+---------------+
| project_id  | employee_id   |
+-------------+---------------+
| 1           | 1             |
| 1           | 3             |
| 2           | 1             |
+-------------+---------------+
```

**Explanation:**

For project 1, employees with IDs 1 and 3 have the most experience (3 years), so both are included in the result.

For project 2, employee 1 has the most experience (3 years), so only employee 1 is included in the result.

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
