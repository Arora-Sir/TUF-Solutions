# [Average Experience by Project](https://takeuforward.org/practice/sql/average-experience-by-project?category=joins-and-aggregation&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A company tracks which employees are assigned to which projects and stores details about each employee, including their years of experience. The project managers want to analyze the average experience level of the employees assigned to each project to ensure a healthy skill mix.

There are two tables:

**Project**

```
╔═════════════╦══════════════╗
║ Column Name ║ Type         ║
╠═════════════╬══════════════╣
║ project_id  ║ int          ║
║ employee_id ║ int          ║
╚═════════════╩══════════════╝
```

- project_id: The ID of the project.
- employee_id: The ID of the employee working on the project.
- Here, (project_id, employee_id) is the primary key.

**Employee**

```
╔══════════════════╦══════════════╗
║ Column Name      ║ Type         ║
╠══════════════════╬══════════════╣
║ employee_id      ║ int          ║
║ name             ║ varchar      ║
║ experience_years ║ int          ║
╚══════════════════╩══════════════╝
```

- employee_id: A unique ID (primary key) for each employee.
- name: The employee’s name.
- experience_years: Number of years the employee has worked (never NULL).

Write an SQL query to report the project_id and the average number of experience years (average_years) of all employees working on that project. Round the result to 2 decimal places.

The result should be returned in ascending order of project_id.

### Example 1:

**Input:**

```
Project Table:

╔════════════╦═════════════╗
║ project_id ║ employee_id ║
╠════════════╬═════════════╣
║ 1          ║ 1           ║
║ 1          ║ 2           ║
║ 1          ║ 3           ║
║ 2          ║ 1           ║
║ 2          ║ 4           ║
╚════════════╩═════════════╝


Employee Table:

╔═════════════╦════════╦══════════════════╗
║ employee_id ║ name   ║ experience_years ║
╠═════════════╬════════╬══════════════════╣
║ 1           ║ Khaled ║ 3                ║
║ 2           ║ Ali    ║ 2                ║
║ 3           ║ John   ║ 1                ║
║ 4           ║ Doe    ║ 2                ║
╚═════════════╩════════╩══════════════════╝
```

**Output:**

```
╔════════════╦══════════════╗
║ project_id ║ average_years║
╠════════════╬══════════════╣
║ 1          ║ 2.00         ║
║ 2          ║ 2.50         ║
╚════════════╩══════════════╝
```

**Explanation:**

- Project 1 - Employees 1, 2, 3 → (3 + 2 + 1) / 3 = 2.00
- Project 2 - Employees 1, 4 → (3 + 2) / 2 = 2.50

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
