# [Exceeding Tweet Length](https://takeuforward.org/practice/sql/exceeding-tweet-length)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A social media platform enforces a strict character limit for tweets. Any tweet with a content length greater than specific number of characters is considered invalid. Your task is to identify invalid tweets that exceed a particular limit. The company maintains a table named **Tweet** to store all posts on the platform.

```
╔═════════════╦══════════╗
║ Column name ║   Type   ║
╠═════════════╬══════════╣
║  tweet_id   ║   int    ║
║─────────────┼──────────║
║   content   ║  varchar ║
╚═════════════╩══════════╝
```

- tweet_id: A unique identifier (primary key) for the tweet table.
- content: The text of the tweet, which can only contain alphanumeric characters, spaces (' '), and exclamation marks ('!'), no other special characters.

A tweet is invalid if its content length is strictly greater than 15 characters. You need to return the tweet_id of invalid tweets.&nbsp;The result can be returned in any order.

### Example 1:

Example:

Input:

Tweet

```
╔══════════╦══════════════════════════════════════════════╗
║ tweet_id ║                   content                    ║
╠══════════╬══════════════════════════════════════════════╣
║    1     ║                 Hello World!                 ║
║──────────┼──────────────────────────────────────────────║
║    2     ║ This tweet has more than fifteen characters! ║
╚══════════╩══════════════════════════════════════════════╝
```

Output:

```
╔══════════╗
║ tweet_id ║
╠══════════╣
║    2     ║
╚══════════╝
```

Explanation:

Tweet 1 (tweet_id = 1) Has 12 characters, It is a valid tweet.

Tweet 2 (tweet_id = 2) Has 44 characters, It is a invalid tweet.

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
