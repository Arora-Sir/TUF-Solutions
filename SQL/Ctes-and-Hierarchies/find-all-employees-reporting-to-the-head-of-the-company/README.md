# [Find All Employees Reporting to the Head of the Company](https://takeuforward.org/practice/sql/find-all-employees-reporting-to-the-head-of-the-company?category=ctes-and-hierarchies&source=sql---75-frequently-asked-interview-questions&sidebar=0)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

We have a table named **Employees** that contains information about employees and their managers.

**Table: Employees**

```
+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| employee_id   | int     |
| employee_name | varchar |
| manager_id    | int     |
+---------------+---------+
```

- **employee_id** is the primary key for this table and contains unique values for each employee.
- Each row in this table represents an employee who reports to a direct manager identified by **manager_id** .
- The head of the company is the employee with **employee_id = 1** .

**Task:**

Write a query to find the **employee_id** of all employees that directly or indirectly report their work to the head of the company. Order the result by employee_id in ascending order.

### Example 1:

**Example:**

**Input:**

Employees table:

```
+-------------+---------------+------------+
| employee_id | employee_name | manager_id |
+-------------+---------------+------------+
| 1           | Boss          | 1          |
| 3           | Alice         | 3          |
| 2           | Bob           | 1          |
| 4           | Daniel        | 2          |
| 7           | Luis          | 4          |
| 8           | Jhon          | 3          |
| 9           | Angela        | 8          |
| 77          | Robert        | 1          |
+-------------+---------------+------------+
```

**Output:**

```
+-------------+
| employee_id |
+-------------+
| 2           |
| 4           |
| 7           |
| 77          |
+-------------+
```

**Explanation:**

- The head of the company is the employee with **employee_id = 1** .
- Employees with **employee_id 2** and **77** report directly to the head of the company.
- Employee **4** reports indirectly to the head of the company through **4 → 2 → 1** .
- Employee **7** reports indirectly to the head of the company through **7 → 4 → 2 → 1** .
- Employees with **employee_id 3, 8, and 9** do not report directly or indirectly to the head of the company.

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
