# [Insert a given node in BST](https://takeuforward.org/plus/dsa/problems/insert-a-given-node-in-bst?subject=dsa&approach=ceiling&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given the **root** node of a binary search tree (BST) and a value **val** to insert into the tree. Return the **root** node **** of the BST after the insertion.

It is guaranteed that the new value does not exist in the original BST. Note that the compiler output shows true if the node is added correctly, else false.

### Example 1

<p>

**Input:** root = [4, 2, 7, 1, 3] , val = 5</p><p>

**Output:** [4, 2, 7, 1, 3, 5]</p><p>

**Explanation:** </p>Below is image where the node 5 is inserted

<img src="https://static.takeuforward.org/content/ProblemSetter-E1RInkjk">

There is another way to insert the given val as shown below.

<img src="https://static.takeuforward.org/content/ProblemSetter-d5Zymok1">

### Example 2

<p>

**Input:** root = [40, 20, 60, 10, 30, 50, 70] , val = 25</p><p>

**Output:** [40, 20, 60, 10, 30, 50, 70, null, null, 25]</p><p>

**Explanation:** </p>Below is image where the node 25 is inserted

<img src="https://static.takeuforward.org/content/1771685441_usJdEhTO.png">

### Constraints

- 1 <= Number of nodes <= 10^4
- -10^8 <= Node.val <= 10^8
- All values in tree are **unique** .
- -10^8 <= val <= 10^8
- It is guaranteed that the val does not exists in original BST.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
