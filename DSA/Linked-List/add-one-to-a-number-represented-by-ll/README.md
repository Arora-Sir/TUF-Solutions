# [Add one to a number represented by LL](https://takeuforward.org/plus/dsa/problems/add-one-to-a-number-represented-by-ll?subject=dsa&approach=brute&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given the **head** of a singly linked list representing a positive **integer** number. **Each** node of the linked list represents a **digit** of the number, with the 1st node containing the leftmost digit of the number and so on. The task is to **add one** to the value represented by the linked list and **return** the head of a linked list containing the final value.

The number will contain **no** leading zeroes except when the value represented is **zero** itself.

### Example 1

<p>

**Input:** head -> 1 -> 2 -> 3</p><p>

**Output:** head -> 1 -> 2 -> 4</p><p>

**Explanation:** The number represented by the linked list = 123.</p>123 + 1 = 124.

### Example 2

<p>

**Input:** head -> 9 -> 9</p><p>

**Output:** head -> 1 -> 0 -> 0</p><p>

**Explanation:** The number represented by the linked list = 99.</p>99 + 1 = 100.

### Example 3

<p>

**Input:** head -> 9</p>Output:

head -> 1 -> 0

### Constraints

- 0 <= number of nodes in the Linked List <= 10^5
- 0 <= ListNode.val <= 9
- No leading zeroes in the value represented.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> using <a href="https://github.com/Arora-Sir/TUFHub">TUFHub</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub</a>
</p>
