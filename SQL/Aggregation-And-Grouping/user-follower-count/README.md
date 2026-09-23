# [User Follower Count](https://takeuforward.org/practice/sql/user-follower-count?category=aggregation-and-grouping&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

In a social media application, users can follow other users. The system needs to track the number of followers for each user.

You are given a **Followers** table with:

╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ user_id ║ int ║
║─────────────┼──────────║
║ follower_id ║ int ║
╚═════════════╩══════════╝

- **user_id** : ID of the user being followed.
- **follower_id** : ID of the user who follows user_id.
- (user_id, follower_id) is the combination of columns with unique values for this table.

Write an SQL query to count the number of followers for each user, and return the result sorted by user_id in ascending order.

### Example 1:

**Example:**

**Input:**

Followers Table

╔═════════╦═════════════╗
║ user_id ║ follower_id ║
╠═════════╬═════════════╣
║ 0 ║ 1 ║
║─────────┼─────────────║
║ 1 ║ 0 ║
║─────────┼─────────────║
║ 2 ║ 0 ║
║─────────┼─────────────║
║ 2 ║ 1 ║
╚═════════╩═════════════╝

**Expected Output:**

╔═════════╦═════════════════╗
║ user_id ║ followers_count ║
╠═════════╬═════════════════╣
║ 0 ║ 1 ║
║─────────┼─────────────────║
║ 1 ║ 1 ║
║─────────┼─────────────────║
║ 2 ║ 2 ║
╚═════════╩═════════════════╝

**Explanation:**

- User 0 has 1 follower: {1}.
- User 1 has 1 follower: {0}.
- User 2 has 2 followers: {0, 1}.

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
