# [Insert a given node in BST](https://takeuforward.org/practice/dsa/insert-a-given-node-in-bst)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given the **root** node of a binary search tree (BST) and a value **val** to insert into the tree. Return the **root** node **** of the BST after the insertion.

It is guaranteed that the new value does not exist in the original BST. Note that the compiler output shows true if the node is added correctly, else false.

### Example 1:

**Input:** root = [4, 2, 7, 1, 3] , val = 5

**Output:** [4, 2, 7, 1, 3, 5]

**Explanation:**

Below is image where the node 5 is inserted

<img src="https://static.takeuforward.org/content/1789455495_jIB-bKGk.webp">

There is another way to insert the given val as shown below.

<img src="https://static.takeuforward.org/content/1789455503_rYfApE4i.webp">

### Example 2:

**Input:** root = [40, 20, 60, 10, 30, 50, 70] , val = 25

**Output:** [40, 20, 60, 10, 30, 50, 70, null, null, 25]

**Explanation:**

Below is image where the node 25 is inserted

<img src="https://static.takeuforward.org/content/1789455510_kSZGKb_9.webp">

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

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
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
