# [Minimum Distance Between Points](https://takeuforward.org/practice/sql/minimum-distance-between-points?category=self-joins-and-relationship-queries&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

Imagine you're building a mapping or sensor system that tracks positions along a straight line (like the X-axis). For optimization or collision detection, you need to find the **closest two data points** in terms of distance. This is a common operation in spatial analysis and robotics path planning.

You are given a table **Point** :

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║      x      ║   int    ║
╚═════════════╩══════════╝
```

- **x:** X-coordinate of a point on the X-axis. It is the primary key, so all values are unique.

Write a query to find the **shortest distance** between any two points listed in the Point table.

### Example 1:

**Example:**

**Input:**

Point Table

```
╔═════╗
║  x  ║
╠═════╣
║ -1  ║
║─────║
║  0  ║
║─────║
║  2  ║
╚═════╝
```

**Expected Output:**

```
╔═══════════╗
║ shortest  ║
╠═══════════╣
║     1     ║
╚═══════════╝
```

**Explanation:**

- **Distances:** |(-1) - 0| = 1, |(-1) - 2| = 3, |0 - 2| = 2
- The minimum distance is 1.

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
