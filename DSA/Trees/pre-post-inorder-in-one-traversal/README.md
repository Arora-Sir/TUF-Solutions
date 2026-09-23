# [Pre, Post, Inorder in one traversal](https://takeuforward.org/practice/dsa/pre,-post,-inorder-in-one-traversal)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

Given a binary tree with root node. Return the **In-order** , **Pre-order** and **Post-order** traversal of the binary tree.

### Example 1:

**Input:** root = [1, 3, 4, 5, 2, 7, 6 ]

**Output:** [ [5, 3, 2, 1, 7, 4, 6] , [1, 3, 5, 2, 4, 7, 6] , [5, 2, 3, 7, 6, 4, 1] ]

**Explanation:** The In-order traversal is [5, 3, 2, 1, 7, 4, 6].

The Pre-order traversal is [1, 3, 5, 2, 4, 7, 6].

The Post-order traversal is [5, 2, 3, 7, 6, 4, 1].

<img src="https://static.takeuforward.org/content/1789470588_Y4HtXCgY.webp">

### Example 2:

**Input:** root = [1, 2, 3, null, null, null, 6 ]

**Output:** [ [2, 1, 3, 6] , [1, 2, 3, 6] , [2, 6, 3, 1] ]

**Explanation:** The In-order traversal is [2, 1, 3, 6].

The Pre-order traversal is [1, 2, 3, 6].

The Post-order traversal is [2, 6, 3, 1].

<img src="https://static.takeuforward.org/content/1789470599_e7iYvsXK.webp">

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= Number of Nodes <= 10^5
- 0 <= Node.val <= 10^5

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
