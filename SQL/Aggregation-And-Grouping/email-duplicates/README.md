# [Email Duplicates](https://takeuforward.org/practice/sql/email-duplicates?category=aggregation-and-grouping&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

In user account systems, duplicate email registrations can lead to confusion, security issues, or data corruption. Detecting these duplicates is essential for maintaining data integrity, ensuring unique logins, and preventing fraudulent registrations.

You are given a **Person** table:

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║     id      ║   int    ║
║─────────────┼──────────║
║    email    ║ varchar  ║
╚═════════════╩══════════╝
```

- **id** : A unique identifier for the user.
- **email** : The email address registered. The emails will not contain uppercase letters.

Write a query to find all duplicate email addresses from the table. It is guaranteed that the email field is never NULL. The result can be returned in any order.

### Example 1:

**Example:**

**Input:**

Person Table:

```
╔════╦═════════╗
║ id ║  email  ║
╠════╬═════════╣
║ 1  ║ a@b.com ║
║────┼─────────║
║ 2  ║ c@d.com ║
║────┼─────────║
║ 3  ║ a@b.com ║
╚════╩═════════╝
```

**Output:**

```
╔═════════╗
║  email  ║
╠═════════╣
║ a@b.com ║
╚═════════╝
```

**Explanation:**

- **a@b.com** appears **twice** , which qualifies it as a duplicate.
- **c@d.com** appears only once, so it's excluded.

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
