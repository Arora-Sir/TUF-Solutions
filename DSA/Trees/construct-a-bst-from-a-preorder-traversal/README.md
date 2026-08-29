# [Construct a BST from a preorder traversal](https://takeuforward.org/plus/dsa/problems/construct-a-bst-from-a-preorder-traversal?subject=dsa&approach=optimal&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given an array of integers **preorder** , which represents the preorder traversal of a BST (i.e., binary search tree), construct the tree and return its root.

It is guaranteed that it is always possible to find a binary search tree with the given requirements for the given test cases.

**Note** : As there can be many possible correct answers, the compiler outputs true if the solution is correct, else false.

### Example 1

<p>

**Input:** preorder = [8, 5, 1, 7, 10, 12]</p><p>

**Output:** [8, 5, 10, 1, 7, null, 12]</p><p>

**Explanation:** </p>Below is the BST image

<img src="https://static.takeuforward.org/content/ProblemSetter-R4qDfEe_">

### Example 2

<p>

**Input:** preorder = [1, 3]</p><p>

**Output:** [1, null, 3]</p><p>

**Explanation:** </p>Below is the BST image

<img src="https://static.takeuforward.org/content/ProblemSetter-VKY7IQpU">

### Constraints

- 1 <= preorder.length <= 100
- 1 <= preorder[i] <= 1000
- All the values of preorder are unique.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
