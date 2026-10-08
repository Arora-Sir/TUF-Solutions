# [Orphan Employees](https://takeuforward.org/practice/sql/orphan-employees?category=subqueries-and-missing-records&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

In an employee management system, when a manager leaves the company, their record is deleted, but their direct reports still have their manager_id set to that person.

You are given the **Employees** table with the following columns:

```
╔══════════════╦════════╦════════════╦════════╗
║ employee_id  ║ name   ║ manager_id ║ salary ║
╠══════════════╬════════╬════════════╬════════╣
║ int          ║ varchar║ int        ║ int    ║
╚══════════════╩════════╩════════════╩════════╝
```

- employee_id: Unique ID of the employee
- name: Employee’s name
- manager_id: ID of the employee’s manager (can be NULL)
- salary: Salary of the employee

Write an SQL query to find the employee_ids of all employees whose salary is less than 30000 **and** whose manager left the company (i.e., manager_id not found in the list of current employee_ids). Return the result sorted by employee_id.

### Example 1:

**Example:**

```
Employees Table:
╔══════════════╦════════════╦════════════╦════════╗
║ employee_id  ║ name       ║ manager_id ║ salary ║
╠══════════════╬════════════╬════════════╬════════╣
║ 3            ║ Mila       ║ 9          ║ 60301  ║
║ 12           ║ Antonella  ║ null       ║ 31000  ║
║ 13           ║ Emery      ║ null       ║ 67084  ║
║ 1            ║ Kalel      ║ 11         ║ 21241  ║
║ 9            ║ Mikaela    ║ null       ║ 50937  ║
║ 11           ║ Joziah     ║ 6          ║ 28485  ║
╚══════════════╩════════════╩════════════╩════════╝
```

**Output:**

```
╔═════════════╗
║ employee_id ║
╠═════════════╣
║ 11          ║
╚═════════════╝
```

**Explanation:**

- Kalel (1): salary < 30000, manager_id = 11 → still exists → Excluded
- Joziah (11): salary < 30000, manager_id = 6 → does not exist → Included

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
