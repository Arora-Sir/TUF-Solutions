# [Check for symmetrical BTs](https://takeuforward.org/practice/dsa/check-for-symmetrical-bts)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given the root of a binary tree, check whether it is a **mirror** of itself (i.e., symmetric around its center).

### Example 1:

**Input:** root = [1, 2, 2, 3, 4, 4, 3]

**Output:** true

**Explanation:**

<img src="https://static.takeuforward.org/content/1789470034_SNSvXNRD.webp">

### Example 2:

**Input:** root = [1, 2, 2, null, 3, null, 3]

**Output:** false

**Explanation:** When a straight line is drawn through the root node and the tree is folded around it, the rightmost node 3 is overlapped with null node and the node 3 present at left of root node is overlapped with null nodes.

So both node 3 in tree does not show symmetric behaviour.

<img src="https://static.takeuforward.org/content/1789470049_sPE87eqn.webp">

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1<= Number of Nodes <= 10^4
- -100 <= Node.val <= 100

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
