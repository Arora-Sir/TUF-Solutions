# [Palindrome partitioning](https://takeuforward.org/plus/dsa/problems/palindrome-partitioning?subject=dsa&approach=brute&tab=submissions)

![Difficulty: Hard](https://img.shields.io/badge/Difficulty-Hard-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

Given a string **s** partition string s such that every substring of partition is palindrome. Return all possible **palindrome partition** of string *s* .

### Example 1

<p>

**Input:** s = "aabaa"</p><p>

**Output:** [ [ "a", "a", "b", "a", "a"] , [ "a", "a", "b", "aa"] , [ "a", "aba", "a"] , [ "aa", "b", "a", "a"] , [ "aa", "b", "aa" ] , [ "aabaa" ] ]</p><p>

**Explanation:** Above all are the possible ways in which the string can be partitioned so that each substring is a palindrome.</p>

### Example 2

<p>

**Input:** s = "baa"</p><p>

**Output:** [ [ "b", "a", "a"] , [ "b", "aa" ] ]</p><p>

**Explanation:** Above all are the possible ways in which the string can be partitioned so that each substring is a palindrome.</p>

### Example 3

<p>

**Input:** s = "ab"</p>Output:

[ [ 'a'] , [ 'b'] ]

### Constraints

- 1<= s.length <= 16
- **s** contains only lowercase English letters.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

> Generated with ❤️ by [Mohit Arora](https://github.com/Arora-Sir) using [TUFHub](https://github.com/Arora-Sir/TUFHub) - TakeUForward (TUF+) Solutions
