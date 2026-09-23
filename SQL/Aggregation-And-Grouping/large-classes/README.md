# [Large Classes](https://takeuforward.org/practice/sql/large-classes?category=aggregation-and-grouping&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A school wants to identify popular classes that have at least 5 students enrolled. This helps the administration in allocating resources, such as assigning larger classrooms or more teaching assistants.

You are given a **Courses** table with two columns:

```
╔═════════════╦══════════╗
║ Column name ║   Type   ║
╠═════════════╬══════════╣
║   student   ║ varchar  ║
║─────────────┼──────────║
║    class    ║ varchar  ║
╚═════════════╩══════════╝
```

- **student** : The name of a student.
- **class** : The name of the class the student is enrolled in.

Each (student, class) pair is unique. Write an SQL query to find the names of classes where the number of enrolled students is **at least 5** . Return the result ordered by class in ascending order.

### Example 1:

**Example:**

**Input:**

**Courses Table:**

```
╔══════════╦══════════╗
║ student  ║ class    ║
╠══════════╬══════════╣
║ A        ║ Math     ║
║ B        ║ English  ║
║ C        ║ Math     ║
║ D        ║ Biology  ║
║ E        ║ Math     ║
║ F        ║ Computer ║
║ G        ║ Math     ║
║ H        ║ Math     ║
║ I        ║ Math     ║
╚══════════╩══════════╝
```

**Output:**

```
╔════════╗
║ class  ║
╠════════╣
║ Math   ║
╚════════╝
```

**Explanation:**

- Math has 6 students enrolled.
- English, Biology, and Computer each have only 1 student.

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
