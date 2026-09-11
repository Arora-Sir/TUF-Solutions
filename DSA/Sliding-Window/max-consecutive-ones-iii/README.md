# [Max Consecutive Ones III](https://takeuforward.org/plus/dsa/problems/max-consecutive-ones-iii?subject=dsa&approach=optimal&sidebar=open&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given a binary array **nums** and an integer **k** , flip at most k 0's.

Return the **maximum** number of **consecutive 1's** after performing the flipping operation.

### Example 1

<p>

**Input:** nums = [1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0] , k = 3</p><p>

**Output:** 10</p><p>

**Explanation:** The maximum number of consecutive 1's are obtained only if we flip the 0's present at position 3, 4, 5 (0 base indexing).</p>The array after flipping becomes [1, 1, 1, <u>1</u>, <u>1</u>, <u>1</u>, 1, 1, 1, 1, 0].

The number of consecutive 1's is 10.

### Example 2

<p>

**Input:** nums = [0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1] , k = 3</p><p>

**Output:** 9</p><p>

**Explanation:** The underlines 1's are obtained by flipping 0's in the new array.</p>[<u>1</u>, <u>1</u>, 1, 1, 1, <u>1</u>, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1].

The number of consecutive 1's is 9.

### Constraints

- 1 <= nums.length <= 10^5
- 0 <= nums[i] <= 1
- 0 <= k <= nums.length

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
