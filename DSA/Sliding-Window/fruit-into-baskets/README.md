# [Fruit Into Baskets](https://takeuforward.org/plus/dsa/problems/fruit-into-baskets?subject=dsa&approach=optimal&sidebar=open&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

There is only one row of fruit trees on the farm, oriented left to right. An integer array called fruits represents the trees, where fruits[i] denotes the kind of fruit produced by the ith tree.

The goal is to gather as much fruit as possible, adhering to the owner's stringent rules:

1) There are two baskets available, and each basket can only contain **one** kind of fruit. The quantity of fruit each basket can contain is unlimited.

2) Start at any tree, but as you proceed to the right, select exactly one fruit from each tree, including the starting tree. One of the baskets must hold the harvested fruits.

3) Once reaching a tree with fruit that cannot fit into any basket, stop.

Return the **maximum** number of fruits that can be picked.

### Example 1

<p>

**Input:** fruits = [1, 2, 1]</p><p>

**Output:** 3</p><p>

**Explanation:** We will start from first tree.</p>The first tree produces the fruit of kind '1' and we will put that in the first basket.

The second tree produces the fruit of kind '2' and we will put that in the second basket.

The third tree produces the fruit of kind '1' and we have first basket that is already holding fruit of kind '1'. So we will put it in first basket.

Hence we were able to collect total of 3 fruits.

### Example 2

<p>

**Input:** fruits = [1, 2, 3, 2, 2]</p><p>

**Output:** 4</p><p>

**Explanation:** we will start from second tree.</p>The first basket contains fruits from second , fourth and fifth.

The second basket will contain fruit from third tree.

Hence we collected total of 4 fruits.

### Constraints

- 1 <= fruits.length <= 10^5
- 0 <= fruits[i] < fruits.length

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
