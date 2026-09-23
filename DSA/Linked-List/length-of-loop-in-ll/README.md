# [Length of loop in LL](https://takeuforward.org/practice/dsa/length-of-loop-in-ll)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given the head of a singly linked list, find the length of the loop in the linked list if it exists. Return the length of the loop if it exists; otherwise, return 0.

A loop exists in a linked list if some node in the list can be reached again by continuously following the next pointer. Internally, pos is used to denote the index (0-based) of the node from where the loop starts.

Note that pos is not passed as a parameter.

### Example 1:

<img src="https://static.takeuforward.org/content/ProblemSetter-50ZbpwmN">

**Input:** head -> 1 -> 2 -> 3 -> 4 -> 5, pos = 1

**Output:** 4

**Explanation:** 2 -> 3 -> 4 -> 5 - >2, length of loop = 4.

### Example 2:

<img src="https://static.takeuforward.org/content/ProblemSetter-XbyBOQuP">

**Input:** head -> 1 -> 3 -> 7 -> 4, pos = -1

**Output:** 0

**Explanation:** No loop is present in the linked list.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

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
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
