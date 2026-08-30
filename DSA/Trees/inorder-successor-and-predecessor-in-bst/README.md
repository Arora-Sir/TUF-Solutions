# [Inorder successor and predecessor in BST](https://takeuforward.org/plus/dsa/problems/inorder-successor-and-predecessor-in-bst?subject=dsa&approach=optimal&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given the root node of a binary search tree (BST) and an integer key. Return the **Inorder predecessor** and **successor** of the given key from the provided BST.

**Note:** key will always present in given BST.

If predecessor or successor is missing then return -1.

### Example 1

<p>

**Input:** root = [5, 2, 10, 1, 4, 7, 12] , key = 10</p><p>

**Output:** [7, 12]</p><p>

**Explanation:** </p><img src="https://static.takeuforward.org/content/ProblemSetter-8D_p20dq">

### Example 2

<p>

**Input:** root = [5, 2, 10, 1, 4, 7, 12] , key = 12</p><p>

**Output:** [10, -1]</p><p>

**Explanation:** </p><img src="https://static.takeuforward.org/content/ProblemSetter-copgO0cS">

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
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
