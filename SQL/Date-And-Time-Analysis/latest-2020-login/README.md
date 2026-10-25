# [Latest 2020 Login](https://takeuforward.org/practice/sql/latest-2020-login?category=date-and-time-analysis&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

You are building a user activity dashboard and want to **identify the most recent login for each user.**

You are given a **Logins** table.

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║   user_id   ║   int    ║
║─────────────┼──────────║
║ time_stamp  ║ datetime ║
╚═════════════╩══════════╝
```

- **user_id:** The ID of the user who logged in
- **time_stamp:** The exact date and time the user logged in
- The **combination** of (user_id, time_stamp) acts as the **primary key** .
- A user can have multiple logins. No two login entries for the **same user** will have the **same timestamp** .

Write a query to find the most recent login date in the year 2020 for each user. Exclude users who didn't log in during 2020. The result can be returned in any order.

### Example 1:

**Example:**

**Input:**

Logins Table

```
╔═════════╦═════════════════════╗
║ user_id ║     time_stamp      ║
╠═════════╬═════════════════════╣
║    6    ║ 2020-06-30 15:06:07 ║
║─────────┼─────────────────────║
║    6    ║ 2021-04-21 14:06:06 ║
║─────────┼─────────────────────║
║    6    ║ 2019-03-07 00:18:15 ║
║─────────┼─────────────────────║
║    8    ║ 2020-02-01 05:10:53 ║
║─────────┼─────────────────────║
║    8    ║ 2020-12-30 00:46:50 ║
║─────────┼─────────────────────║
║    2    ║ 2020-01-16 02:49:50 ║
║─────────┼─────────────────────║
║    2    ║ 2019-08-25 07:59:08 ║
║─────────┼─────────────────────║
║   14    ║ 2019-07-14 09:00:00 ║
║─────────┼─────────────────────║
║   14    ║ 2021-01-06 11:59:59 ║
╚═════════╩═════════════════════╝
```

**Expected Output:**

```
╔═════════╦═════════════════════╗
║ user_id ║     last_stamp      ║
╠═════════╬═════════════════════╣
║    2    ║ 2020-01-16 02:49:50 ║
║─────────┼─────────────────────║
║    6    ║ 2020-06-30 15:06:07 ║
║─────────┼─────────────────────║
║    8    ║ 2020-12-30 00:46:50 ║
╚═════════╩═════════════════════╝
```

**Explanation:**

We only consider logins from **2020** and pick the **latest** one for each user:

- **User 6** → Latest in 2020: 2020-06-30
- **User 8** → Latest in 2020: 2020-12-30
- **User 2** → Only 2020 login: 2020-01-16
- **User 14** → No 2020 login (Excluded)

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
