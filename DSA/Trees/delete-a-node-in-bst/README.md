# [Delete a node in BST](https://takeuforward.org/practice/dsa/delete-a-node-in-bst)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given the **root** node of a binary search tree (BST) and a value key. Return the root node of the BST after the **deletion** of the node with the given key value.

Note: As there can be many correct answers, the compiler returns true if the answer is correct, otherwise false.

### Example 1:

**Input:** root = [5, 3, 6, 2, 4, null, 7] , key = 3

**Output:** [5, 4, 6, 2, null, null, 7]

**Explanation:**

Below is image of the original BST

<img src="https://static.takeuforward.org/content/1789455701_RaqPsdZu.webp">

Below is image where the node 3 is deleted

<img src="https://static.takeuforward.org/content/1789455712_HmjlbJAc.webp">

### Example 2:

**Input:** root = [5, 3, 6, 2, 4, null, 7] , key = 0

**Output:** [5, 3, 6, 2, 4, null, 7]

**Explanation:**

The tree does not have node with value 0.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

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
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
