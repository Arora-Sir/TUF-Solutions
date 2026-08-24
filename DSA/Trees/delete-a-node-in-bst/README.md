# [Delete a node in BST](https://takeuforward.org/plus/dsa/problems/delete-a-node-in-bst?subject=dsa&approach=ceiling&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given the **root** node of a binary search tree (BST) and a value key. Return the root node of the BST after the **deletion** of the node with the given key value.

Note: As there can be many correct answers, the compiler returns true if the answer is correct, otherwise false.

### Example 1

<p>

**Input:** root = [5, 3, 6, 2, 4, null, 7] , key = 3</p><p>

**Output:** [5, 4, 6, 2, null, null, 7]</p><p>

**Explanation:** </p>Below is image of the original BST

<img src="https://static.takeuforward.org/content/ProblemSetter-PcCLLBxP">

Below is image where the node 3 is deleted

<img src="https://static.takeuforward.org/content/ProblemSetter-kSeVvzcS">

### Example 2

<p>

**Input:** root = [5, 3, 6, 2, 4, null, 7] , key = 0</p><p>

**Output:** [5, 3, 6, 2, 4, null, 7]</p><p>

**Explanation:** </p>The tree does not have node with value 0.

### Constraints

- 1 <= Number of nodes <= 10^4
- -10^8 <= Node.val <= 10^8
- All values in tree are **unique** .
- -10^8 <= key <= 10^8

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
