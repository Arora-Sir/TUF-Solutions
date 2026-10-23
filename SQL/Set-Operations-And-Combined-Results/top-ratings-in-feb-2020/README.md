# [Top Ratings in Feb 2020](https://takeuforward.org/practice/sql/top-ratings-in-feb-2020?source=sql---75-frequently-asked-interview-questions&category=set-operations-and-combined-results)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

You run a movie review system where users submit ratings for movies.

You are given three tables:

```
Movies Table:
╔══════════╦════════════╗
║ Column   ║ Type       ║
╠══════════╬════════════╣
║ movie_id ║ int        ║
║ title    ║ varchar    ║
╚══════════╩════════════╝
```

```
Users Table:
╔══════════╦════════════╗
║ Column   ║ Type       ║
╠══════════╬════════════╣
║ user_id  ║ int        ║
║ name     ║ varchar    ║
╚══════════╩════════════╝
```

```
MovieRating Table:
╔════════════╦══════════╗
║   Column   ║   Type   ║
╠════════════╬══════════╣
║  movie_id  ║   int    ║
║────────────┼──────────║
║  user_id   ║   int    ║
║────────────┼──────────║
║   rating   ║   int    ║
║────────────┼──────────║
║ created_at ║   date   ║
╚════════════╩══════════╝
```

The task is to:

- **Return the name of the user who rated the most movies.** Break ties by lexicographically smallest name.
- **Return the title of the movie with the highest average rating in February 2020.** Break ties by lexicographically smallest title.

### Example 1:

**Example Input:**

```
Movies Table:
╔══════════╦════════════╗
║ movie_id ║ title      ║
╠══════════╬════════════╣
║ 1        ║ Avengers   ║
║ 2        ║ Frozen 2   ║
║ 3        ║ Joker      ║
╚══════════╩════════════╝

Users Table:
╔══════════╦════════════╗
║ user_id  ║ name       ║
╠══════════╬════════════╣
║ 1        ║ Daniel     ║
║ 2        ║ Monica     ║
║ 3        ║ Maria      ║
║ 4        ║ James      ║
╚══════════╩════════════╝

MovieRating Table:
╔══════════╦══════════╦══════════╦══════════════╗
║ movie_id ║ user_id  ║ rating   ║ created_at   ║
╠══════════╬══════════╬══════════╬══════════════╣
║ 1        ║ 1        ║ 3        ║ 2020-01-12   ║
║ 1        ║ 2        ║ 4        ║ 2020-02-11   ║
║ 1        ║ 3        ║ 2        ║ 2020-02-12   ║
║ 1        ║ 4        ║ 1        ║ 2020-01-01   ║
║ 2        ║ 1        ║ 5        ║ 2020-02-17   ║
║ 2        ║ 2        ║ 2        ║ 2020-02-01   ║
║ 2        ║ 3        ║ 2        ║ 2020-03-01   ║
║ 3        ║ 1        ║ 3        ║ 2020-02-22   ║
║ 3        ║ 2        ║ 4        ║ 2020-02-25   ║
╚══════════╩══════════╩══════════╩══════════════╝
```

**Expected Output:**

```
╔══════════╗
║ results  ║
╠══════════╣
║ Daniel   ║
║ Frozen 2 ║
╚══════════╝
```

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
