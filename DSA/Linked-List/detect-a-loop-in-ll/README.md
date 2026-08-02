# [Detect a loop in LL](https://takeuforward.org/plus/dsa/problems/detect-a-loop-in-ll?subject=dsa&approach=optimal&tab=editorial)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given the head of a singly linked list. Return true if a **loop** exists in the linked list or return false.

A loop exists in a linked list if some node in the list can be reached again by continuously following the next pointer.

Internally, pos is used to denote the index(0-based) of the node from where the loop starts. Note&nbsp;that pos is not passed as a parameter.

### Example 1

<img src="https://static.takeuforward.org/content/ProblemSetter--y2YLT69">

<p>

**Input:** head -> 1 -> 2 -> 3 -> 4 -> 5, pos = 1</p><p>

**Output:** true</p><p>

**Explanation:** The tail of the linked list connects to the node at 1st index.</p>

### Example 2

<img src="https://static.takeuforward.org/content/ProblemSetter-vodxuwjV">

<p>

**Input:** head -> 1 -> 3 -> 7 -> 4, pos = -1</p><p>

**Output:** false</p><p>

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
