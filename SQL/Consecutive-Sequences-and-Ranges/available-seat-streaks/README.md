# [Available Seat Streaks](https://takeuforward.org/practice/sql/available-seat-streaks?category=consecutive-sequences-and-ranges&source=sql---75-frequently-asked-interview-questions&sidebar=0)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A cinema manager wants to improve the booking experience for users who prefer sitting together.

You are given a table named **Cinema** :

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║   seat_id   ║   int    ║
║─────────────┼──────────║
║    free     ║   bool   ║
╚═════════════╩══════════╝
```

- **seat_id:** Unique identifier for the seat (auto-incremented, meaning it increases automatically by 1 for each row)
- **free:** Indicates whether the seat is free (1) or occupied (0)

Write a query to identify all seats that are part of any group of consecutive available seats. Return the result ordered by seat_id in ascending order.

The test cases are designed to ensure that there are at least three consecutive available seats.

### Example 1:

**Example:**

**Input:**

Cinema

```
╔═════════╦══════╗
║ seat_id ║ free ║
╠═════════╬══════╣
║    1    ║  1   ║
║─────────┼──────║
║    2    ║  0   ║
║─────────┼──────║
║    3    ║  1   ║
║─────────┼──────║
║    4    ║  1   ║
║─────────┼──────║
║    5    ║  1   ║
╚═════════╩══════╝
```

**Expected Output:**

```
╔═════════╗
║ seat_id ║
╠═════════╣
║    3    ║
║─────────║
║    4    ║
║─────────║
║    5    ║
╚═════════╝
```

**Explanation:**

- **Seat 1** is free but not adjacent to any other free seat.
- **Seat 3** is followed by free seat 4 → included.
- **Seat 4** is between two free seats → included.
- **Seat 5** is preceded by free seat 4 → included.

Hence, only seats 3, 4, and 5 qualify.

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
