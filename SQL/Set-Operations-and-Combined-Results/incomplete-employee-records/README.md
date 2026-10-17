# [Incomplete Employee Records](https://takeuforward.org/practice/sql/incomplete-employee-records?category=set-operations-and-combined-results&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

In an HR system, maintaining complete employee records is critical. Sometimes, data may be incomplete due to errors in syncing databases. It's important to identify employees whose records are **partially missing** , so it can be corrected promptly.

You're given two tables:

**Employees**

```
╔═══════════════╦══════════╗
║ Column Name   ║   Type   ║
╠═══════════════╬══════════╣
║ employee_id   ║   int    ║
║───────────────┼──────────║
║     name      ║ varchar  ║
╚═══════════════╩══════════╝
```

- **employee_id:** Unique ID for each employee (Primary Key)
- **name:** Name of the employee

**Salaries**

```
╔═══════════════╦══════════╗
║ Column Name   ║   Type   ║
╠═══════════════╬══════════╣
║ employee_id   ║   int    ║
║───────────────┼──────────║
║    salary     ║   int    ║
╚═══════════════╩══════════╝
```

- **employee_id:** ID of the employee (Primary Key), links to Employees.employee_id
- **salary:** Salary of the employee

Write a query to find the employee_id of all employees whose record is missing from either the Employees table or the Salaries table. Return the result sorted by employee_id in ascending order.

### Example 1:

**Example:**

**Input:**

Employees Table:

```
╔═════════════╦══════════╗
║ employee_id ║   name   ║
╠═════════════╬══════════╣
║      2      ║   Crew   ║
║─────────────┼──────────║
║      4      ║  Haven   ║
║─────────────┼──────────║
║      5      ║ Kristian ║
╚═════════════╩══════════╝
```

Salaries Table:

```
╔═════════════╦════════╗
║ employee_id ║ salary ║
╠═════════════╬════════╣
║      5      ║ 76071  ║
║─────────────┼────────║
║      1      ║ 22517  ║
║─────────────┼────────║
║      4      ║ 63539  ║
╚═════════════╩════════╝
```

**Expected Output:**

```
╔═════════════╗
║ employee_id ║
╠═════════════╣
║      1      ║
║─────────────║
║      2      ║
╚═════════════╝
```

**Explanation:**

- **Employee 1** has salary but no name → missing from Employees.
- **Employee 2** has name but no salary → missing from Salaries.
- **Employee 4 and 5** are present in both → complete information.

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
