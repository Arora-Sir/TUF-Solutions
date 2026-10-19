# [Tennis Grand Slam Winners](https://takeuforward.org/practice/sql/tennis-grand-slam-winners?category=set-operations-and-combined-results&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

In professional tennis, tracking player success across Grand Slam tournaments helps organizations rank players, reward top performers, and generate valuable insights for fans and analysts.

You are given two tables:

**Players**

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║  player_id  ║   int    ║
║─────────────┼──────────║
║ player_name ║ varchar  ║
╚═════════════╩══════════╝
```

- **player_id** : Unique ID assigned to each tennis player (Primary Key)
- **player_name** : Name of the tennis player

**Championships**

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║    year     ║   int    ║
║─────────────┼──────────║
║  Wimbledon  ║   int    ║
║─────────────┼──────────║
║   Fr_open   ║   int    ║
║─────────────┼──────────║
║   US_open   ║   int    ║
║─────────────┼──────────║
║   Au_open   ║   int    ║
╚═════════════╩══════════╝
```

- **year** : The year of the championship events (Primary Key)
- **Wimbledon** : player_id of the winner of Wimbledon that year
- **Fr_open** : player_id of the winner of French Open that year
- **US_open** : player_id of the winner of US Open that year
- **Au_open** : player_id of the winner of Australian Open that year

Write a query to find the number of Grand Slam tournaments won by each player. Exclude players who have not won any tournament.

Return the result ordered by the number of Grand Slam tournaments won in descending order. If two or more players have the same number of wins, order them by player_id in ascending order.

### Example 1:

**Example:**

**Input:**

**Players Table**

```
╔═══════════╦═════════════╗
║ player_id ║ player_name ║
╠═══════════╬═════════════╣
║     1     ║    Neel     ║
║───────────┼─────────────║
║     2     ║    Feder    ║
║───────────┼─────────────║
║     3     ║    Nova     ║
╚═══════════╩═════════════╝
```

**Championships Table**

```
╔══════╦═══════════╦═════════╦═════════╦═════════╗
║ year ║ Wimbledon ║ Fr_open ║ US_open ║ Au_open ║
╠══════╬═══════════╬═════════╬═════════╬═════════╣
║ 2018 ║     1     ║    1    ║    1    ║    1    ║
║──────┼───────────┼─────────┼─────────┼─────────║
║ 2019 ║     1     ║    1    ║    2    ║    2    ║
║──────┼───────────┼─────────┼─────────┼─────────║
║ 2020 ║     2     ║    1    ║    2    ║    2    ║
╚══════╩═══════════╩═════════╩═════════╩═════════╝
```

**Expected Output:**

```
╔═══════════╦═════════════╦═══════════════════╗
║ player_id ║ player_name ║ grand_slams_count ║
╠═══════════╬═════════════╬═══════════════════╣
║     1     ║    Neel     ║        7          ║
║───────────┼─────────────┼───────────────────║
║     2     ║    Feder    ║        5          ║
╚═══════════╩═════════════╩═══════════════════╝
```

**Explanation:**

**Neel (player_id 1):**

- Wimbledon titles: 2018, 2019 = 2 titles
- French Open titles: 2018, 2019, 2020 = 3 titles
- US Open titles: 2018 = 1 title
- Australian Open titles: 2018 = 1 title
- Total: 7 titles

**Feder (player_id 2):**

- Wimbledon title: 2020 = 1 title
- US Open titles: 2019, 2020 = 2 titles
- Australian Open titles: 2019, 2020 = 2 titles
- Total: 5 titles

**Nova (player_id 3):**

- No titles won = Not included.

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
