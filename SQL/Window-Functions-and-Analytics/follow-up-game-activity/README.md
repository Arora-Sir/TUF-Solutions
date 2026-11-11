# [Follow-up Game Activity](https://takeuforward.org/practice/sql/follow-up-game-activity?category=window-functions-pre&source=sql---75-frequently-asked-interview-questions&sidebar=0)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

In gaming platforms, tracking a player's cumulative gameplay history over time helps in understanding player engagement, rewarding loyalty, and analyzing user growth patterns.

You are given a table **Activity** :

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║  player_id  ║   int    ║
║─────────────┼──────────║
║  device_id  ║   int    ║
║─────────────┼──────────║
║ event_date  ║   date   ║
║─────────────┼──────────║
║games_played ║   int    ║
╚═════════════╩══════════╝
```

- **player_id** : ID of the player (who played the games)
- **device_id** : ID of the device used by the player
- **event_date** : Date when the player logged in and played
- **games_played** : Number of games played by the player on that date (could be 0)

**Primary Key** : (player_id, event_date), meaning one record per player per day and a player can have only one entry per day.

Write a query to report, for each player and each date, the total number of games the player has played up to and including that date. The result can be returned in any order.

### Example 1:

**Example:**

**Input:**

```
╔═══════════╦═══════════╦════════════╦══════════════╗
║ player_id ║ device_id ║ event_date ║ games_played ║
╠═══════════╬═══════════╬════════════╬══════════════╣
║     1     ║     2     ║ 2016-03-01 ║      5       ║
║───────────┼───────────┼────────────┼──────────────║
║     1     ║     2     ║ 2016-05-02 ║      6       ║
║───────────┼───────────┼────────────┼──────────────║
║     1     ║     3     ║ 2017-06-25 ║      1       ║
║───────────┼───────────┼────────────┼──────────────║
║     3     ║     1     ║ 2016-03-02 ║      0       ║
║───────────┼───────────┼────────────┼──────────────║
║     3     ║     4     ║ 2018-07-03 ║      5       ║
╚═══════════╩═══════════╩════════════╩══════════════╝
```

**Expected Output:**

```
╔═══════════╦════════════╦════════════════════╗
║ player_id ║ event_date ║ games_played_so_far ║
╠═══════════╬════════════╬════════════════════╣
║     1     ║ 2016-03-01 ║         5          ║
║───────────┼────────────┼────────────────────║
║     1     ║ 2016-05-02 ║        11          ║
║───────────┼────────────┼────────────────────║
║     1     ║ 2017-06-25 ║        12          ║
║───────────┼────────────┼────────────────────║
║     3     ║ 2016-03-02 ║         0          ║
║───────────┼────────────┼────────────────────║
║     3     ║ 2018-07-03 ║         5          ║
╚═══════════╩════════════╩════════════════════╝
```

**Explanation:**

For player 1:

- On 2016-03-01 - 5 games
- On 2016-05-02 - 5 + 6 = 11 games
- On 2017-06-25 - 11 + 1 = 12 games

For player 3:

- On 2016-03-02 - 0 games
- On 2018-07-03 - 0 + 5 = 5 games

Thus, for each player, we sum up all games played from the beginning till the given date.

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
