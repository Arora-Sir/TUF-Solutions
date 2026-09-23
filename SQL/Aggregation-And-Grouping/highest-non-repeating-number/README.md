# [Highest Non-Repeating Number](https://takeuforward.org/practice/sql/highest-non-repeating-number?category=aggregation-and-grouping&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

In a data analytics task, you're given a list of integers that may contain duplicates.

You're given a table MyNumbers with one column:

╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ num ║ int ║
╚═════════════╩══════════╝

- num: an integer (may be repeated across rows).

Write an SQL query to find the largest number that occurs only once in the MyNumbers table. If no such number exists, return NULL.

### Example 1:

Example 1:

MyNumbers Table:
╔═════╗
║ num ║
╠═════╣
║ 8 ║
║ 8 ║
║ 3 ║
║ 3 ║
║ 1 ║
║ 4 ║
║ 5 ║
║ 6 ║
╚═════╝

Output:

╔═════╗
║ num ║
╠═════╣
║ 6 ║
╚═════╝

Explanation: Numbers that appear once: 1, 4, 5, 6. Largest = 6.

### Example 2:

Example 2:

MyNumbers Table:
╔═════╗
║ num ║
╠═════╣
║ 8 ║
║ 8 ║
║ 7 ║
║ 7 ║
║ 3 ║
║ 3 ║
║ 3 ║
╚═════╝

Output:

╔══════╗
║ num ║
╠══════╣
║ null ║
╚══════╝

Explanation: Every number appears more than once => result is NULL.

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
