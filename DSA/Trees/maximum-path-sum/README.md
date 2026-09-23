# [Maximum path sum](https://takeuforward.org/practice/dsa/maximum-path-sum-)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

In a binary tree, a path is a list of nodes where there is an edge between every pair of neighbouring nodes. A node may only make a single appearance in the sequence.

The total of each node's values along a path is its **path sum** . Return the **largest** path sum of all non-empty paths given the root of a binary tree.

**Note:** The path does not have to go via the root.

### Example 1:

**Input:** root = [20, 9, -10, null, null, 15, 7]

**Output:** 34

**Explanation:** The path from node 15 to node 9 has maximum path sum.

The path is 15 -> -10 -> 20 -> 9.

<img src="https://static.takeuforward.org/content/ProblemSetter-gLEBhSXO">

### Example 2:

**Input:** root = [-10, 9, 20, null, null, 15, 7]

**Output:** 42

**Explanation:** The path from node 15 to node 7 has maximum path sum.

The path is 15 -> 20 -> 7.

<img src="https://static.takeuforward.org/content/ProblemSetter-BBBySXwH">

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= Number of Nodes <= 3*10^4
- -10^3 <= Node.val <= 10^3

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
