# [Top 3 Salaries per Department](https://takeuforward.org/practice/sql/top-3-salaries-per-department?category=ranking-and-top-n-queries&source=sql---75-frequently-asked-interview-questions&sidebar=0)

![Difficulty: Pro](https://img.shields.io/badge/Difficulty-Pro-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

In a company, the executives are interested in knowing the top three highest earners in each department. This information helps in understanding the top performers in each department based on salary. Given two tables:

**Employee**

```
╔══════════════╦══════════╗
║ Column Name  ║   Type   ║
╠══════════════╬══════════╣
║      id      ║   int    ║
║──────────────┼──────────║
║     name     ║  archer  ║
║──────────────┼──────────║
║    salary    ║   int    ║
║──────────────┼──────────║
║ departmentid ║   int    ║
╚══════════════╩══════════╝
```

- Contains employee information such as id, name, salary, and departmentid.
- id is the primary key and departmentid is a foreign key.

**Department**

```
╔═════════════╦══════════╗
║ Column name ║   Type   ║
╠═════════════╬══════════╣
║     id      ║   int    ║
║─────────────┼──────────║
║    name     ║  varchar ║
╚═════════════╩══════════╝
```

- Contains department information such as id and name.
- Here, id is the primary key of department table.

Write an SQL query to find the employees earning the top three unique salaries in each department.

The result should be ordered by name in ascending order, salary in descending order, and employee in ascending order.

### Example 1:

**Input:**

Employee Table:

```
╔══════════╦══════════╦══════════╦══════════════╗
║    id    ║   name   ║  salary  ║ departmentId ║
╠══════════╬══════════╬══════════╬══════════════╣
║    1     ║   Joe    ║  85000   ║      1       ║
║──────────┼──────────┼──────────┼──────────────║
║    2     ║  Henry   ║  80000   ║      2       ║
║──────────┼──────────┼──────────┼──────────────║
║    3     ║   Sam    ║  60000   ║      2       ║
║──────────┼──────────┼──────────┼──────────────║
║    4     ║   Max    ║  90000   ║      1       ║
║──────────┼──────────┼──────────┼──────────────║
║    5     ║  Janet   ║  69000   ║      1       ║
║──────────┼──────────┼──────────┼──────────────║
║    6     ║  Randy   ║  85000   ║      1       ║
║──────────┼──────────┼──────────┼──────────────║
║    7     ║   Will   ║  70000   ║      1       ║
╚══════════╩══════════╩══════════╩══════════════╝
```

Department Table:

```
╔══════════╦══════════╗
║    id    ║   name   ║
╠══════════╬══════════╣
║    1     ║    IT    ║
║──────────┼──────────║
║    2     ║  Sales   ║
╚══════════╩══════════╝
```

**Output:**

```
╔════════════╦══════════╦══════════╗
║ Department ║ Employee ║  salary  ║
╠════════════╬══════════╬══════════╣
║     IT     ║   Max    ║  90000   ║
║────────────┼──────────┼──────────║
║     IT     ║   Joe    ║  85000   ║
║────────────┼──────────┼──────────║
║     IT     ║  Randy   ║  85000   ║
║────────────┼──────────┼──────────║
║     IT     ║   Will   ║  70000   ║
║────────────┼──────────┼──────────║
║   Sales    ║  Henry   ║  80000   ║
║────────────┼──────────┼──────────║
║   Sales    ║   Sam    ║  60000   ║
╚════════════╩══════════╩══════════╝
```

**Explanation:**

- **IT Department** :
- Max earns the highest unique salary (90000).
- Joe and Randy earn the second-highest unique salary (85000).
- Will earns the third-highest unique salary (70000).

- **Sales Department** :
- Henry earns the highest salary (80000).
- Sam earns the second-highest salary (60000).
- Since there are only two employees in this department, there is no third-highest salary.

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
