# [Find the intersection point of Y LL](https://takeuforward.org/plus/dsa/problems/find-the-intersection-point-of-y-ll?subject=dsa&approach=optimal&tab=submissions)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given the heads **** of two linked lists A and B, containing positive integers. Find the node at which the two linked lists **intersect** . If they do intersect, return the node **** at which the intersection begins, otherwise return null.

The Linked List will not **** contain any cycles. The linked lists must retain **** their original **** structure, given as per the input, after **** the function returns.

**Note** : for custom input, the following parameters are required(your program is not **** provided with these parameters):

- **intersectVal** - The value of the node where the intersection occurs. This is -1 if there is no intersected node.
- **skipA** - The number of nodes to skip ahead in listA (starting from the head) to get to the intersected node( **-1** if no intersection).
- **skipB** - The number of nodes to skip ahead in listB (starting from the head) to get to the intersected node( **-1** if no intersection).
- **listA** - The first linked list.
- **listB** - The second linked list.

### Example 1

<p>

**Input:** listA: intersectVal = 4, skipA = 3, skipB = 2, head -> 1 -> 2 -> 3 -> 4 -> 5, listB: head -> 7 -> 8 -> 4 -> 5</p><img src="https://static.takeuforward.org/content/ProblemSetter-9Sg1d-Lo">

<p>

**Output:** (value at returned node is displayed): 4</p><p>

**Explanation:** The two lists have nodes with values 4 and 5 as their tails.</p>

### Example 2

<p>

**Input:** listA: intersectVal = -1, skipA = -1, skipB = -1, head -> 1 -> 2 -> 3, listB: head -> 8 -> 9</p><img src="https://static.takeuforward.org/content/ProblemSetter-p32uBGcT">

<p>

**Output:** (value at returned node is displayed): null</p><p>

**Explanation:** The two lists do not intersect.</p>

### Constraints

- m == number of nodes in listA.
- n == number of nodes in listB.
- 1 <= m, n <= 5 * 10^4
- 0 <= ListNode.val <= 10^4
- 0 <= skipA < m
- 0 <= skipB < n
- intersectVal, skipA, skipB is -1 if listA and listB do not intersect.
- intersectVal == listA[skipA] == listB[skipB] if listA and listB intersect.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
