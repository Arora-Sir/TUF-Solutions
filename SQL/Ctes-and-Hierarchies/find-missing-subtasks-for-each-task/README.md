# [Find Missing Subtasks for Each Task](https://takeuforward.org/practice/sql/find-missing-subtasks-for-each-task?category=ctes-and-hierarchies&source=sql---75-frequently-asked-interview-questions&sidebar=0)

![Difficulty: Pro](https://img.shields.io/badge/Difficulty-Pro-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

We have two tables: **Tasks** and **Executed** .

**Table: Tasks**

```
+----------------+---------+
| Column Name    | Type    |
+----------------+---------+
| task_id        | int     |
| subtasks_count | int     |
+----------------+---------+
```

- **task_id** is the primary key for this table and contains unique values.
- **subtasks_count** is the number of subtasks assigned to each task, with values ranging from 2 to 20.

**Table: Executed**

```
+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| task_id       | int     |
| subtask_id    | int     |
+---------------+---------+
```

- **(task_id, subtask_id)** is the combination of columns with unique values in this table.
- Each row in this table represents an executed subtask for a given task.

**Task:**

Write a query to find the missing subtasks for each task in the Tasks table. A missing subtask is a subtask that has not been executed for the task.

Return the **task_id** and **subtask_id** for each missing subtask.

### Example 1:

**Example:**

**Input:**

Tasks table:

```
+---------+----------------+
| task_id | subtasks_count |
+---------+----------------+
| 1       | 3              |
| 2       | 2              |
| 3       | 4              |
+---------+----------------+
```

Executed table:

```
+---------+------------+
| task_id | subtask_id |
+---------+------------+
| 1       | 2          |
| 3       | 1          |
| 3       | 2          |
| 3       | 3          |
| 3       | 4          |
+---------+------------+
```

**Output:**

```
+---------+------------+
| task_id | subtask_id |
+---------+------------+
| 1       | 1          |
| 1       | 3          |
| 2       | 1          |
| 2       | 2          |
+---------+------------+
```

**Explanation:**

- Task 1 has 3 subtasks (1, 2, 3). Subtask 2 was executed, so subtasks 1 and 3 are missing.
- Task 2 has 2 subtasks (1, 2). No subtasks were executed, so both subtasks are missing.
- Task 3 has 4 subtasks (1, 2, 3, 4), and all subtasks were executed, so there are no missing subtasks for this task.

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
