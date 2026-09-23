# [Inorder successor and predecessor in BST](https://takeuforward.org/practice/dsa/inorder-successor-and-predecessor-in-bst)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given the root node of a binary search tree (BST) and an integer key. Return the **Inorder predecessor** and **successor** of the given key from the provided BST.

**Note:** key will always present in given BST.

If predecessor or successor is missing then return -1.

### Example 1:

**Input:** root = [5, 2, 10, 1, 4, 7, 12] , key = 10

**Output:** [7, 12]

**Explanation:**

<img src="https://static.takeuforward.org/content/1789455597_eGJ022iZ.webp">

### Example 2:

**Input:** root = [5, 2, 10, 1, 4, 7, 12] , key = 12

**Output:** [10, -1]

**Explanation:**

<img src="https://static.takeuforward.org/content/1789455615_WHPH-jqY.webp">

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= Number of Nodes <= 10^4
- 1 <= Node.val <= 10^5
- All the values Node.val are **unique** .

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
