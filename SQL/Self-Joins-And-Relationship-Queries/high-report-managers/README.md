# [High-Report Managers](https://takeuforward.org/practice/sql/high-report-managers?category=self-joins-and-relationship-queries&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

A company’s HR system keeps track of employees and their reporting structure. The management wants to identify managers who have at least 5 employees directly reporting to them.

The company maintains an **Employee** table that stores:

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║     id      ║   int    ║
║─────────────┼──────────║
║    name     ║ varchar  ║
║─────────────┼──────────║
║ department  ║ varchar  ║
║─────────────┼──────────║
║  managerld  ║   int    ║
╚═════════════╩══════════╝
```

- *id:* A unique identifier (primary key) for each employee.
- *name* : The name of the employee.
- *department* : The department in which the employee works.
- *managerId:* The id of the employee’s direct manager (NULL if the employee has no manager).

Your task is to find all managers who have 5 or more employees directly reporting to them.

The result should be returned in any order.

The sample output format is in the following example.

### Example 1:

Input:

**Employee Table**

```
╔══════════╦══════════╦════════════╦═══════════╗
║   Id     ║   name   ║ department ║ managerId ║
╠══════════╬══════════╬════════════╬═══════════╣
║   101    ║   Emily  ║     A      ║   Null    ║
║──────────┼──────────┼────────────┼───────────║
║   102    ║   Jak    ║     A      ║    101    ║
║──────────┼──────────┼────────────┼───────────║
║   103    ║  Olive   ║     A      ║    101    ║
║──────────┼──────────┼────────────┼───────────║
║   104    ║   Emy    ║     A      ║    101    ║
║──────────┼──────────┼────────────┼───────────║
║   105    ║   Liam   ║     A      ║    101    ║
║──────────┼──────────┼────────────┼───────────║
║   106    ║   Lie    ║     B      ║    101    ║
╚══════════╩══════════╩════════════╩═══════════╝
```

<strong style="color:rgb(229, 231, 235)">Output:</strong>

```
╔══════════╗
║   name   ║
╠══════════╣
║  Emily   ║
╚══════════╝
```

**Explanation:**

- Emily (id = 101) - Has 5 direct reports (102, 10^3, 10^4, 10^5, 10^6), so he is included.
- Jak (id = 102), Olive (id = 10^3), Emy (id = 10^4), Liam (id = 10^5), Lie (id = 10^6) - None of them have 5 or more reports, so they are excluded.

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
