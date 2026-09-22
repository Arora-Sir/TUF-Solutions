# [Longest Repeating Character Replacement](https://takeuforward.org/practice/dsa/longest-repeating-character-replacement?category=longest-and-smallest-window-problems&source=strivers-a2z-dsa-sheet)

![Difficulty: Pro](https://img.shields.io/badge/Difficulty-Pro-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

Given an integer k and a string s, any character in the string can be selected and changed to any other uppercase English character. This operation can be performed up to **k** times. After completing these steps, return the **length** of the longest substring that contains the same letter.

### Example 1:

**Input:** s = "BAABAABBBAAA" , k = 2

**Output:** 6

**Explanation:** we can change the B present at index 0 , 3 (0 base indexing) to A.

The new string is "<u>A</u>AA<u>A</u>AABBBAAA".

The substring "AAAAAA" is the longest substring having same letter with length 6.

### Example 2:

**Input:** s = "AABABBA" , k = 1

**Output:** 4

**Explanation:** The underlined characters are changed in the new string obtained.

The new string is "AAB<u>B</u>BBA". The substring "BBBB" is the answer.

There are other ways to achieve this answer.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= s.length <= 10^5
- 0 <= k <= s.length
- s contains only English uppercase letters.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
