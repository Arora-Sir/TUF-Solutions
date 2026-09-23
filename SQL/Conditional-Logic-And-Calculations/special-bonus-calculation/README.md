# [Special Bonus Calculation](https://takeuforward.org/practice/sql/special-bonus-calculation?category=conditional-logic-and-calculations&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A company wants to reward certain employees with a 100% bonus based on some conditions.

You are given an Employees table with:

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║ employee_id ║   int    ║
║─────────────┼──────────║
║    name     ║ varchar  ║
║─────────────┼──────────║
║   salary    ║   int    ║
╚═════════════╩══════════╝
```

- *employee_id* : Unique identifier (primary key) of each employee.
- *name* : Name of the employee.
- *salary* : Monthly salary of the employee.

Write an SQL query to return each employee_id and the bonus they receive based on the following conditions:

- The employee's ID must be odd, and
- The employee's name must not start with 'M'.
- All other employees will receive a bonus of 0.

### Example 1:

Example:

Input:

Employees:

```
╔═════════════╦══════════╦══════════╗
║ employee_id ║   name   ║  salary  ║
╠═════════════╬══════════╬══════════╣
║      2      ║   Meir   ║   3000   ║
║─────────────┼──────────┼──────────║
║      3      ║ Michael  ║   3800   ║
║─────────────┼──────────┼──────────║
║      7      ║ Addilyn  ║   7400   ║
║─────────────┼──────────┼──────────║
║      8      ║   Juan   ║   6100   ║
║─────────────┼──────────┼──────────║
║      9      ║  Kannon  ║   7700   ║
╚═════════════╩══════════╩══════════╝
```

Expected Output:

```
╔═════════════╦══════════╗
║ employee_id ║  bonus   ║
╠═════════════╬══════════╣
║      2      ║    0     ║
║─────────────┼──────────║
║      3      ║    0     ║
║─────────────┼──────────║
║      7      ║   7400   ║
║─────────────┼──────────║
║      8      ║    0     ║
║─────────────┼──────────║
║      9      ║   7700   ║
╚═════════════╩══════════╝
```

Explanation:

- ID 2 (even) = no
- ID 3 (odd) but name starts with 'M' = no
- ID 7 (odd, name = Addilyn), Bonus = 7400
- ID 8 (even) = no
- ID 9 (odd, name = Kannon), Bonus = 7700

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
