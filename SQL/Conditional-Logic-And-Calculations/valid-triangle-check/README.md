# [Valid Triangle Check](https://takeuforward.org/practice/sql/valid-triangle-check?category=conditional-logic-and-calculations&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A geometry software is used to verify whether three given line segments can form a valid triangle.

You are given a **Triangle** table with columns:

╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ x ║ int ║
║─────────────┼──────────║
║ y ║ int ║
║─────────────┼──────────║
║ z ║ int ║
╚═════════════╩══════════╝

- **x, y, z** : The lengths of three line segments.
- (x, y, z) is the primary key column for this table.

Return all columns (x, y, z) and an extra column **triangle** with value:

- 'Yes' if they form a valid triangle.
- 'No' otherwise.

### Example 1:

**Example:**

**Input:**

Triangle Table

╔═════╦═════╦═════╗
║ x ║ y ║ z ║
╠═════╬═════╬═════╣
║ 13 ║ 15 ║ 30 ║
║─────┼─────┼─────║
║ 10 ║ 20 ║ 15 ║
╚═════╩═════╩═════╝

**Expected Output:**

╔═════╦═════╦═════╦═══════════╗
║ x ║ y ║ z ║ triangle ║
╠═════╬═════╬═════╬═══════════╣
║ 13 ║ 15 ║ 30 ║ No ║
║─────┼─────┼─────┼───────────║
║ 10 ║ 20 ║ 15 ║ Yes ║
╚═════╩═════╩═════╩═══════════╝

**Explanation:**

- Row 1: 13 + 15 = 28 < 30 → violates triangle inequality → Not a triangle
- Row 2: 10 + 20 = 30 > 15, 10 + 15 = 25 > 20, 15 + 20 = 35 > 10 → All conditions satisfied → Valid triangle

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
