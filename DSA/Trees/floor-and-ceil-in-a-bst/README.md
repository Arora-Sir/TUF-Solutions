# [Floor and Ceil in a BST](https://takeuforward.org/plus/dsa/problems/floor-and-ceil-in-a-bst?subject=dsa&approach=ceiling&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

Given a **root** of binary search tree and a **key** (node) value, find the floor and ceil value for that particular key value.

- **Floor** Value Node: Node with the greatest data lesser than or equal to the key value.&nbsp;

- **Ceil** Value Node: Node with the smallest data larger than or equal to the key value.

If a particular floor or ceil value is not present then output -1.

### Example 1

<p>

**Input:** root = [8, 4, 12, 2, 6, 10, 14] , key = 11</p><p>

**Output:** [10, 12]</p><p>

**Explanation:** </p><img src="https://static.takeuforward.org/content/ProblemSetter-eDbjy9Um">

### Example 2

<p>

**Input:** root = [8, 4, 12, 2, 6, 10, 14] , key = 15</p><p>

**Output:** [14, -1]</p><p>

**Explanation:** </p><img src="https://static.takeuforward.org/content/ProblemSetter-D00IL4KV">

### Constraints

- 1 <= Number of Nodes <= 5000
- 1 <= Node.val <= 10^7
- 1 <= key <= 10^7

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
