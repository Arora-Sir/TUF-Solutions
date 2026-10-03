# [Suggested Pages](https://takeuforward.org/practice/sql/suggested-pages?category=self-joins-and-relationship-queries&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

In a social media platform, personalized page recommendations improve user engagement. One common strategy is to suggest pages liked by a user's friends, excluding the ones the user already follows.

### You are given Tables:

**Friendship Table**

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║  user1_id   ║   int    ║
║─────────────┼──────────║
║  user2_id   ║   int    ║
╚═════════════╩══════════╝
```

- **user1_id:** ID of the first user in the friendship
- **user2_id:** ID of the second user in the friendship
- **Primary Key:** (user1_id, user2_id), each row indicates a mutual friendship between user1_id and user2_id.

**Likes Table**

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║   user_id   ║   int    ║
║─────────────┼──────────║
║   page_id   ║   int    ║
╚═════════════╩══════════╝
```

- **user_id:** ID of the user who liked a page
- **page_id:** ID of the page that was liked
- **Primary Key:** (user_id, page_id), this ensures that a user likes a page only once.

Write a query to recommend pages to the user with user_id = 1 by using pages liked by their friends. Do not recommend pages the user has already liked. Ensure there are no duplicates in the result, and order the result by recommended_page in ascending order.

### Example 1:

**Example:**

**Input:**

Friendship Table:

```
╔═══════════╦═══════════╗
║ user1_id  ║ user2_id  ║
╠═══════════╬═══════════╣
║     1     ║     2     ║
║───────────┼───────────║
║     1     ║     3     ║
║───────────┼───────────║
║     1     ║     4     ║
║───────────┼───────────║
║     2     ║     3     ║
║───────────┼───────────║
║     2     ║     4     ║
║───────────┼───────────║
║     2     ║     5     ║
║───────────┼───────────║
║     6     ║     1     ║
╚═══════════╩═══════════╝
```

Likes Table:

```
╔═════════╦═════════╗
║ user_id ║ page_id ║
╠═════════╬═════════╣
║    1    ║   88    ║
║─────────┼─────────║
║    2    ║   23    ║
║─────────┼─────────║
║    3    ║   24    ║
║─────────┼─────────║
║    4    ║   56    ║
║─────────┼─────────║
║    5    ║   11    ║
║─────────┼─────────║
║    6    ║   33    ║
║─────────┼─────────║
║    2    ║   77    ║
║─────────┼─────────║
║    3    ║   77    ║
║─────────┼─────────║
║    6    ║   88    ║
╚═════════╩═════════╝
```

**Expected Output:**

```
╔═════════════════╗
║ recommended_page║
╠═════════════════╣
║       23        ║
║─────────────────║
║       24        ║
║─────────────────║
║       33        ║
║─────────────────║
║       56        ║
║─────────────────║
║       77        ║
╚═════════════════╝
```

**Explanation:**

User 1's friends: **2, 3, 4, 6**

Pages they like:

- User 2 → 23, 77
- User 3 → 24, 77
- User 4 → 56
- User 6 → 33, 88

User 1 already likes: **88**

So, remove **88** and return: **23, 24, 56, 33, 77**

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
