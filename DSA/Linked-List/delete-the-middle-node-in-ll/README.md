# [Delete the middle node in LL](https://takeuforward.org/practice/dsa/delete-the-middle-node-in-ll)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given the head of a non-empty singly linked list containing integers, **delete** the middle node of the linked list. Return the head of the modified linked list.

The middle node of a linked list of size n is the **(⌊n / 2⌋ + 1)** ^ **th** **** node from the start using 1-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.

### Example 1:

**Input:** head -> 1 -> 2 -> 3 -> 4 -> 5

**Output:** head -> 1 -> 2 -> 4 -> 5

**Explanation:** n = 5.

⌊n / 2⌋ + 1 = 3, therefore middle node has index 3 and so the node with value 3 was deleted.

### Example 2:

**Input:** head -> 7 -> 6 -> 5 -> 4

**Output:** head -> 7 -> 6 -> 4

**Expl﻿anation** : n = 4.

⌊n / 2⌋ + 1 = 3, therefore middle node has index 3 and so the node with value 5 was deleted.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= number of nodes in the Linked List <= 10^5
- 0 <= ListNode.val <= 10^4

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
