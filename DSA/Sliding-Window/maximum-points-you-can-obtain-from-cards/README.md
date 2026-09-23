# [Maximum Points You Can Obtain from Cards](https://takeuforward.org/practice/dsa/maximum-points-you-can-obtain-from-cards-)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given N cards arranged in a row, each card has an associated score denoted by the cardScore array.

Choose exactly k cards. In each step, a card can be chosen either from the beginning or the end of the row.

The score is the sum of the scores of the chosen cards.

Return the **maximum score** that can be obtained.

### Example 1:

**Input:** cardScore = [1, 2, 3, 4, 5, 6] , k = 3

**Output:** 15

**Explanation:** Choosing the rightmost cards will maximize your total score. So optimal cards chosen are the rightmost three cards 4 , 5 , 6.

Th score is 4 + 5 + 6 => 15.

### Example 2:

**Input:** cardScore = [5, 4, 1, 8, 7, 1, 3 ] , k = 3

**Output:** 12

**Explanation:** In first step we will choose card from beginning with score of 5.

In second step we will choose the card from beginning again with score of 4.

In third step we will choose the card from end with score of 3.

The total score is 5 + 4 + 3 => 12

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

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
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
