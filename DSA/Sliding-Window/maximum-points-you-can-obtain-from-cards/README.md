# [Maximum Points You Can Obtain from Cards](https://takeuforward.org/plus/dsa/problems/maximum-points-you-can-obtain-from-cards-?subject=dsa&approach=number-of-subarrays-substrings&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given N cards arranged in a row, each card has an associated score denoted by the cardScore array.

Choose exactly k cards. In each step, a card can be chosen either from the beginning or the end of the row.

The score is the sum of the scores of the chosen cards.

Return the **maximum score** that can be obtained.

### Example 1

<p>

**Input:** cardScore = [1, 2, 3, 4, 5, 6] , k = 3</p><p>

**Output:** 15</p><p>

**Explanation:** Choosing the rightmost cards will maximize your total score. So optimal cards chosen are the rightmost three cards 4 , 5 , 6.</p>Th score is 4 + 5 + 6 => 15.

### Example 2

<p>

**Input:** cardScore = [5, 4, 1, 8, 7, 1, 3 ] , k = 3</p><p>

**Output:** 12</p><p>

**Explanation:** In first step we will choose card from beginning with score of 5.</p>In second step we will choose the card from beginning again with score of 4.

In third step we will choose the card from end with score of 3.

The total score is 5 + 4 + 3 => 12

### Constraints

- 1 <= cardScore.length <= 10^5
- 1 <= cardScore[i] <=10^4
- 1 <= k <= cardScore.length

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
