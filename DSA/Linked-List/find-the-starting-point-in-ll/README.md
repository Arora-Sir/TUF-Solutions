# [Find the starting point in LL](https://takeuforward.org/plus/dsa/problems/find-the-starting-point-in-ll?subject=dsa&category=linked-list&subcategory=faqs--medium&approach=optimal&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given the head of a singly linked list, the task is to find the starting point of a loop in the linked list if it exists. Return the starting node if a loop exists; otherwise, return null.

A loop exists in a linked list if some node in the list can be reached again by continuously following the next pointer. Internally, pos denotes the index (0-based) of the node from where the loop starts.

Note that pos is not passed as a parameter.

### Example 1

<img src="https://static.takeuforward.org/content/ProblemSetter-9CeYMulT">

<p>

**Input:** head -> 1 -> 2 -> 3 -> 4 -> 5, pos = 1</p><p>

**Output:** (value of the returned node is displayed): 2</p> **Expla﻿nation** : The tail of the linked list connects to the node at 1st index.

### Example 2

<img src="https://static.takeuforward.org/content/ProblemSetter-VIieMjlM">

<p>

**Input:** head -> 1 -> 3 -> 7 -> 4, pos = -1</p><p>

**Output:** (value of the returned node is displayed): null</p><p>

**Explanation:** No loop is present in the linked list.</p>

### Constraints

- 0 <= number of nodes in the cycle <= 10^5
- 0 <= ListNode.val <= 10^4
- pos is -1 or a valid index in the linked list

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
