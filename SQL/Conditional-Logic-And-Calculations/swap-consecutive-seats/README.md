# [Swap Consecutive Seats](https://takeuforward.org/practice/sql/swap-consecutive-seats?category=conditional-logic-and-calculations&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

In a classroom, students are seated in sequentially numbered seats. The administration wants to rearrange seats by swapping every two consecutive students for fun. If there is an odd number of students, the last student remains in their original seat.

You are given a **Seat** table with:

```
╔═════════════╦═════════╗
║ Column Name ║  Type   ║
╠═════════════╬═════════╣
║      id     ║   int   ║
║─────────────┼─────────║
║   student   ║ varchar ║
╚═════════════╩═════════╝
```

- **id** : Seat number (starts from 1 and increases continuously).
- **student** : Name of the student occupying the seat.

Write an SQL query to **swap every two consecutive seats** by student names, ensuring the last student (if any) remains unchanged when the total number is odd. Return the final seating **ordered by id** .

Return the table **ordered by id** in ascending order.

### Example 1:

**Example:**

**Input:**

Seat Table

```
╔═════╦═════════╗
║  id ║ student ║
╠═════╬═════════╣
║  1  ║  Abbot  ║
║─────┼─────────║
║  2  ║  Doris  ║
║─────┼─────────║
║  3  ║ Emerson ║
║─────┼─────────║
║  4  ║  Green  ║
║─────┼─────────║
║  5  ║ Jeames  ║
╚═════╩═════════╝
```

**Expected Output:**

```
╔═════╦═════════╗
║  id ║ student ║
╠═════╬═════════╣
║  1  ║  Doris  ║
║─────┼─────────║
║  2  ║  Abbot  ║
║─────┼─────────║
║  3  ║  Green  ║
║─────┼─────────║
║  4  ║ Emerson ║
║─────┼─────────║
║  5  ║ Jeames  ║
╚═════╩═════════╝
```

**Explanation:**

- 1 ↔ 2 → Abbot and Doris swap
- 3 ↔ 4 → Emerson and Green swap
- 5 → Jeames stays (no partner to swap with)

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
