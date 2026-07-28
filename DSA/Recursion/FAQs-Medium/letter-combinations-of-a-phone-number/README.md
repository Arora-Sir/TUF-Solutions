# [Letter Combinations of a Phone Number](https://takeuforward.org/plus/dsa/problems/letter-combinations-of-a-phone-number?subject=dsa&approach=recursive-solution&tab=submissions)

![Difficulty: Hard](https://img.shields.io/badge/Difficulty-Hard-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

Given a string consisting of digits from **2 to 9 (inclusive)**. Return all possible letter combinations that the number can represent.

Mapping of digits to letters is given in first example.

### Example 1

<p>
**Input:**  digits = "34"</p><p>
**Output:**  [ "dg", "dh", "di", "eg", "eh", "ei", "fg", "fh", "fi" ]</p><p>
**Explanation:**  The 3 is mapped with "def" and 4 is mapped with "ghi".</p>So all possible combination by replacing the digits with characters are shown in output.

<img src="https://static.takeuforward.org/content/ProblemSetter-WlUD68IM">

### Example 2

<p>
**Input:**  digits = "3"</p><p>
**Output:**  [ "d", "e", "f" ]</p><p>
**Explanation:**  The 3 is mapped with "def".</p>

### Example 3

<p>
**Input:**  digits = "8"</p>Output:

[ "t", "u", "v" ]

### Constraints

- 1 <= digits.length <= 4
- digts[i] contains digitd from [2,9].

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

> Auto-synced using [TUFHub](https://github.com/Arora-Sir/TUFHub) - TakeUForward (TUF+) Solutions
