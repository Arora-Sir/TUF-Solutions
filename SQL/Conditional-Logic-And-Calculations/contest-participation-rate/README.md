# [Contest Participation Rate](https://takeuforward.org/practice/sql/contest-participation-rate?category=conditional-logic-and-calculations&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

An online contest platform tracks user registrations for various contests. The analytics team wants to determine how popular each contest is by calculating what percentage of total users participated in each one.

Two tables are provided:

**Users:**

```
╔══════════╦════════════╗
║ Column   ║ Type       ║
╠══════════╬════════════╣
║ user_id  ║ int        ║
║ user_name║ varchar    ║
╚══════════╩════════════╝
```

- user_id: Unique identifier for each user.
- user_name: Name of the user.

**Register:**

```
╔════════════╦══════════╗
║ Column     ║ Type     ║
╠════════════╬══════════╣
║ contest_id ║ int      ║
║ user_id    ║ int      ║
╚════════════╩══════════╝
```

- contest_id: Unique identifier for each contest.
- user_id: ID of the user who registered for the contest.
- (contest_id, user_id) is the primary key (combination of columns with unique values).

Write an SQL query to report the contest_id and the percentage of users registered for each contest, rounded to 2 decimal places. Sort the result by percentage in descending order, and in case of a tie, by contest_id in ascending order.

### Example 1:

**Input:**

```
Users Table

╔══════════╦════════════╗
║ user_id  ║ user_name  ║
╠══════════╬════════════╣
║ 6        ║ Alice      ║
║ 2        ║ Bob        ║
║ 7        ║ Alex       ║
╚══════════╩════════════╝

Register Table

╔════════════╦══════════╗
║ contest_id ║ user_id  ║
╠════════════╬══════════╣
║ 215        ║ 6        ║
║ 209        ║ 2        ║
║ 208        ║ 2        ║
║ 210        ║ 6        ║
║ 208        ║ 6        ║
║ 209        ║ 7        ║
║ 209        ║ 6        ║
║ 215        ║ 7        ║
║ 208        ║ 7        ║
║ 210        ║ 2        ║
║ 207        ║ 2        ║
║ 210        ║ 7        ║
╚════════════╩══════════╝
```

**Output:**

```
╔════════════╦════════════╗
║ contest_id ║ percentage ║
╠════════════╬════════════╣
║ 208        ║ 100.0      ║
║ 209        ║ 100.0      ║
║ 210        ║ 100.0      ║
║ 215        ║ 66.67      ║
║ 207        ║ 33.33      ║
╚════════════╩════════════╝
```

**Explanation:**

- Total users = 3
- Contest 208: 3 users → (3/3) × 100 = 100.00%
- Contest 209: 3 users → (3/3) × 100 = 100.00%
- Contest 210: 3 users → (3/3) × 100 = 100.00%
- Contest 215: 2 users → (2/3) × 100 = 66.67%
- Contest 207: 1 user → (1/3) × 100 = 33.33%

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
