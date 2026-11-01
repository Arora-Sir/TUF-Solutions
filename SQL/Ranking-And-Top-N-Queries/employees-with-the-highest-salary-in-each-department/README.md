# [Employees with the Highest Salary in Each Department](https://takeuforward.org/practice/sql/employees-with-the-highest-salary-in-each-department?category=ranking-and-top-n-queries&source=sql---75-frequently-asked-interview-questions&sidebar=0)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

We have two tables: **Employee** and **Department** .

**Table: Employee**

```
╔══════════════╦═════════╗
║ Column Name  ║  Type   ║
╠══════════════╬═════════╣
║      id      ║   int   ║
║──────────────┼─────────║
║     name     ║ varchar ║
║──────────────┼─────────║
║    salary    ║   int   ║
║──────────────┼─────────║
║ departmentId ║   int   ║
╚══════════════╩═════════╝
```

- **id** is the primary key for the Employee table.
- **departmentId** is a foreign key that references the id of the Department table.
- Each row in this table represents an employee's id, name, salary, and the id of the department they belong to.

**Table: Department**

```
╔═════════════╦═════════╗
║ Column Name ║  Type   ║
╠═════════════╬═════════╣
║     id      ║   int   ║
║─────────────┼─────────║
║    name     ║ varchar ║
╚═════════════╩═════════╝
```

- **id** is the primary key for the Department table. It is guaranteed that the department name is not NULL.
- Each row in this table contains the id and name of a department.

**Task:**

Your task is to find the employees who have the highest salary in each department. The result should be ordered by salary in descending order. If two or more employees have the same salary, order them by employee name in ascending order.

### Example 1:

**Example**

**Input:**

**Employee table:**

```
╔════╦═══════╦════════╦══════════════╗
║ id ║ name  ║ salary ║ departmentId ║
╠════╬═══════╬════════╬══════════════╣
║ 1  ║  Joe  ║ 70000  ║      1       ║
║────┼───────┼────────┼──────────────║
║ 2  ║  Jim  ║ 90000  ║      1       ║
║────┼───────┼────────┼──────────────║
║ 3  ║ Henry ║ 80000  ║      2       ║
║────┼───────┼────────┼──────────────║
║ 4  ║  Sam  ║ 60000  ║      2       ║
║────┼───────┼────────┼──────────────║
║ 5  ║  Max  ║ 90000  ║      1       ║
╚════╩═══════╩════════╩══════════════╝
```

**Department table:**

```
╔════╦═══════╗
║ id ║ name  ║
╠════╬═══════╣
║ 1  ║  IT   ║
║────┼───────║
║ 2  ║ Sales ║
╚════╩═══════╝
```

**Output:**

```
╔════════════╦══════════╦════════╗
║ Department ║ Employee ║ Salary ║
╠════════════╬══════════╬════════╣
║     IT     ║   Jim    ║ 90000  ║
║────────────┼──────────┼────────║
║     IT     ║   Max    ║ 90000  ║
║────────────┼──────────┼────────║
║   Sales    ║  Henry   ║ 80000  ║
╚════════════╩══════════╩════════╝
```

**Explanation:**

For the IT department, both Jim and Max have the highest salary of 90000.

For the Sales department, Henry has the highest salary of 80000.

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
