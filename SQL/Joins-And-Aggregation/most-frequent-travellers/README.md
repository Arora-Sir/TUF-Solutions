# [Most Frequent Travellers](https://takeuforward.org/practice/sql/most-frequent-travellers?category=joins-and-aggregation&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A ride-sharing company wants to identify which users have traveled the most distance overall. This data can be used to reward the most frequent travellers, understand usage patterns, and improve customer retention strategies.

You're given two tables:

Users:

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║     id      ║   int    ║
║─────────────┼──────────║
║    name     ║ varchar  ║
╚═════════════╩══════════╝
```

- user_id: Unique identifier for each user (Primary Key).
- name: The name of the user, stored as a string.

Rides:

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║     id      ║   int    ║
║─────────────┼──────────║
║   user_id   ║   int    ║
║─────────────┼──────────║
║  distance   ║   int    ║
╚═════════════╩══════════╝
```

- id: Unique ID for the ride (Primary Key).
- user_id: Refers to the id of the user who took this ride.
- distance: Distance traveled during this ride.

Write a query to find the total distance traveled by each user. Sort the result by travelled_distance in descending order. If multiple users have the same distance, sort them by name in ascending order.

### Example 1:

Example:

Input:

Users:

```
╔══════════╦══════════╗
║    id    ║   name   ║
╠══════════╬══════════╣
║    1     ║  Alice   ║
║──────────┼──────────║
║    2     ║   Bob    ║
║──────────┼──────────║
║    3     ║   Alex   ║
║──────────┼──────────║
║    4     ║  Donald  ║
║──────────┼──────────║
║    7     ║   Lee    ║
║──────────┼──────────║
║    13    ║ Jonathan ║
║──────────┼──────────║
║    19    ║  Elvis   ║
╚══════════╩══════════╝
```

Rides:

```
╔══════════╦══════════╦══════════╗
║    id    ║ user_id  ║ distance ║
╠══════════╬══════════╬══════════╣
║    1     ║    1     ║   120    ║
║──────────┼──────────┼──────────║
║    2     ║    2     ║   317    ║
║──────────┼──────────┼──────────║
║    3     ║    3     ║   222    ║
║──────────┼──────────┼──────────║
║    4     ║    7     ║   100    ║
║──────────┼──────────┼──────────║
║    5     ║    13    ║   312    ║
║──────────┼──────────┼──────────║
║    6     ║    19    ║    50    ║
║──────────┼──────────┼──────────║
║    7     ║    7     ║   120    ║
║──────────┼──────────┼──────────║
║    8     ║    19    ║   400    ║
║──────────┼──────────┼──────────║
║    9     ║    7     ║   230    ║
╚══════════╩══════════╩══════════╝
```

Output:

```
╔══════════╦════════════════════╗
║   name   ║ travelled_distance ║
╠══════════╬════════════════════╣
║  Elvis   ║        450         ║
║──────────┼────────────────────║
║   Lee    ║        450         ║
║──────────┼────────────────────║
║   Bob    ║        317         ║
║──────────┼────────────────────║
║ Jonathan ║        312         ║
║──────────┼────────────────────║
║   Alex   ║        222         ║
║──────────┼────────────────────║
║  Alice   ║        120         ║
║──────────┼────────────────────║
║  Donald  ║         0          ║
╚══════════╩════════════════════╝
```

Explanation:

- Elvis: 50 (ride ID 6) + 400 (ride ID 8) = 450
- Lee: 100 (ride ID 4) + 120 (ride ID 7) + 230 (ride ID 9) = 450
- Bob: 317 (ride ID 2) = 317
- Jonathan: 312 (ride ID 5) = 312
- Alex: 222 (ride ID 3) = 222
- Alice: 120 (ride ID 1) = 120
- Donald: No rides = 0
- Sorted by distance desc, name asc in ties.

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
