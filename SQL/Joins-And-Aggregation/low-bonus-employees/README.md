# [Low Bonus Employees](https://takeuforward.org/practice/sql/low-bonus-employees?category=joins-and-aggregation&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A company maintains an employee database where each employee may receive a performance bonus.

The company wants to identify employees whose bonus is less than a particular amount or those who have not received any bonus at all. Your task is to fetch the employee names and their respective bonuses from the system. The company maintains two tables:

**Employee** table, which contains:

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║    empId    ║   int    ║
║─────────────┼──────────║
║    name     ║ varchar  ║
║─────────────┼──────────║
║ supervisor  ║   int    ║
║─────────────┼──────────║
║   salary    ║   int    ║
╚═════════════╩══════════╝
```

- *empId* : A unique identifier (primary key) for each employee.
- *name* : The employee’s name.
- *supervisor* : The ID of their manager.
- *salary* : The employee's salary.

**Bonus** table, which contains:

```
╔═════════════╦══════════╗
║ Column name ║   Type   ║
╠═════════════╬══════════╣
║    empId    ║   int    ║
║─────────────┼──────────║
║    bonus    ║   int    ║
╚═════════════╩══════════╝
```

- *empId* : A reference (foreign key) to the empId in the Employee table.
- *bonus* : The bonus amount the employee received.

Some employees may not have received a bonus, meaning they do not have a corresponding entry in the Bonus table.

Write an SQL query to retrieve the name of each employee along with their bonus amount. If an employee has not received a bonus, display NULL for the bonus.

Only include employees whose bonus is less than 1000 or who have not received any bonus.

The result should be returned in **any order** .

### Example 1:

Example:

Input:

Employee Table:

```
╔══════════╦══════════╦════════════╦══════════╗
║  empId   ║   name   ║ supervisor ║  salary  ║
╠══════════╬══════════╬════════════╬══════════╣
║    3     ║  Ethan   ║    Null    ║   4000   ║
║──────────┼──────────┼────────────┼──────────║
║    1     ║ Sophia   ║     3      ║   1000   ║
║──────────┼──────────┼────────────┼──────────║
║    2     ║   Liam   ║     3      ║   2000   ║
║──────────┼──────────┼────────────┼──────────║
║    4     ║  Olivia  ║     3      ║   3000   ║
╚══════════╩══════════╩════════════╩══════════╝
```

Bonus Table:

```
╔══════════╦══════════╗
║  empId   ║  bonus   ║
╠══════════╬══════════╣
║    2     ║   500    ║
║──────────┼──────────║
║    4     ║   2000   ║
╚══════════╩══════════╝
```

Output:

```
╔══════════╦══════════╗
║   name   ║  bonus   ║
╠══════════╬══════════╣
║  Ethan   ║   Null   ║
║──────────┼──────────║
║  Sophia  ║   Null   ║
║──────────┼──────────║
║   Liam   ║   500    ║
╚══════════╩══════════╝
```

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
