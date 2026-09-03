# [Minimum number of bracket reversals to make an expression balanced](https://takeuforward.org/plus/dsa/problems/minimum-number-of-bracket-reversals-to-make-an-expression-balanced?subject=dsa&approach=optimal-approach&tab=submissions)

![Difficulty: Hard](https://img.shields.io/badge/Difficulty-Hard-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

Given a string s consisting of only opening and closing&nbsp;brackets '(' and ')', find out the **minimum** number of **reversals** required to convert the string into a balanced expression.

If it is not possible to make the brackets balanced, return -1. A reversal means changing '(' to ')' or vice-versa.

A balanced expression is a string where:

- It is empty, or
- Every opening bracket '(' has exactly one corresponding closing bracket ')'
- Every closing bracket ')' has exactly one corresponding opening bracket '('
- Brackets are properly nested, meaning every opened bracket is closed before any outer bracket is closed

### Example 1

Input: s = ")(())((("

Output: 3

Explanation: One way to balance is:

"((())())". There is no balanced sequence

that can be formed in lesser reversals.

### Example 2

Input: s = "(()((()(())(("

Output: -1

Explanation: There's no way we can balance

this sequence of braces.

### Constraints

- 1 <= s.length <= 10^4

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
