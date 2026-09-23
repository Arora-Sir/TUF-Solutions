# [Check if a tree is a BST or not](https://takeuforward.org/practice/dsa/check-if-a-tree-is-a-bst-or-not)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given the **root** node of a binary tree. Return **true** if the given binary tree is a binary search tree(BST) else **false** .

A **valid** **BST** is defined as follows:

- The left&nbsp;subtree of a node contains only nodes with key **strictly** less than the node's key.

- The right subtree of a node contains only nodes with key **strictly** greater than the node's key.

- Both the left and right subtrees must also be binary search trees.

### Example 1:

**Input:** root = [5, 3, 6, 2, 4, null, 7]

**Output:** true

**Explanation:**

Below is image of the given tree.

<img src="https://static.takeuforward.org/content/1789455869_d2r4ik0J.webp">

### Example 2:

**Input:** root = [5, 3, 6, 4, 2, null, 7]

**Output:** false

**Explanation:**

**** Below is image of the given tree.

The node 4 and node 2 violates the BST rule of smaller to left and larger to right.

<img src="https://static.takeuforward.org/content/1789455881_XZG_6KxM.webp">

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= Number of Nodes <= 10^4
- -2^31 <= Node.val <= 2^31 - 1

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
