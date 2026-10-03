# [Suspended Accounts](https://takeuforward.org/practice/sql/suspended-accounts?category=self-joins-and-relationship-queries&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

A company needs to detect fraudulent behavior by banning accounts that were simultaneously active from multiple IP addresses, indicating potential account sharing or hacking.

You are given **LogInfo** Table:

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║ account_id  ║   int    ║
║─────────────┼──────────║
║ ip_address  ║   int    ║
║─────────────┼──────────║
║   login     ║ datetime ║
║─────────────┼──────────║
║   logout    ║ datetime ║
╚═════════════╩══════════╝
```

- **account_id** : ID of the user/account logging in
- **ip_address** : IP address from which the account was logged in
- **login** : The timestamp when the user logged in
- **logout** : The timestamp when the user logged out

- The table **may contain duplicate rows** (same account_id, ip_address, login, and logout).
- It's **confirmed** that for every row, logout always happens after login.

Write a query to find the account_id of accounts that should be banned. An account should be banned if it has logged in **at any moment** from **two different IP addresses** . Return the result in any order.

### Example 1:

**Example:**

**Input:**

```
╔════════════╦════════════╦═════════════════════╦═════════════════════╗
║ account_id ║ ip_address ║       login         ║       logout        ║
╠════════════╬════════════╬═════════════════════╬═════════════════════╣
║     1      ║     1      ║ 2021-02-01 09:00:00 ║ 2021-02-01 09:30:00 ║
║────────────┼────────────┼─────────────────────┼─────────────────────║
║     1      ║     2      ║ 2021-02-01 08:00:00 ║ 2021-02-01 11:30:00 ║
║────────────┼────────────┼─────────────────────┼─────────────────────║
║     2      ║     6      ║ 2021-02-01 20:30:00 ║ 2021-02-01 22:00:00 ║
║────────────┼────────────┼─────────────────────┼─────────────────────║
║     2      ║     7      ║ 2021-02-02 20:30:00 ║ 2021-02-02 22:00:00 ║
║────────────┼────────────┼─────────────────────┼─────────────────────║
║     3      ║     9      ║ 2021-02-01 16:00:00 ║ 2021-02-01 16:59:59 ║
║────────────┼────────────┼─────────────────────┼─────────────────────║
║     3      ║    13      ║ 2021-02-01 17:00:00 ║ 2021-02-01 17:59:59 ║
║────────────┼────────────┼─────────────────────┼─────────────────────║
║     4      ║    10      ║ 2021-02-01 16:00:00 ║ 2021-02-01 17:00:00 ║
║────────────┼────────────┼─────────────────────┼─────────────────────║
║     4      ║    11      ║ 2021-02-01 17:00:00 ║ 2021-02-01 17:59:59 ║
╚════════════╩════════════╩═════════════════════╩═════════════════════╝
```

**Expected Output:**

```
╔════════════╗
║ account_id ║
╠════════════╣
║     1      ║
║────────────║
║     4      ║
╚════════════╝
```

**Explanation:**

**Account 1:**

- Logged in from IP 1 (9:00–9:30) and IP 2 (8:00–11:30) **overlapping** = **Ban** .

**Account 2:**

- Different IPs, but sessions are on **different days** = **Not banned** .

**Account 3:**

- Different IPs, but **no overlapping sessions** = **Not banned** .

**Account 4:**

- Logged in from IP 10 (16:00–17:00) and IP 11 (17:00–17:59) with exact match at 17:00 **Overlap** = **Ban** .

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
