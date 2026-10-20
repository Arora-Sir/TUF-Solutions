# [Football Team Scores](https://takeuforward.org/practice/sql/football-team-scores?category=set-operations-and-combined-results&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

In a football tournament, you want to compute total points earned by each team based on match outcomes. This scoring will determine rankings on the leaderboard.

You're given two tables:

**Teams**

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║   team_id   ║   int    ║
║─────────────┼──────────║
║  team_name  ║ varchar  ║
╚═════════════╩══════════╝
```

- **team_id:** Unique identifier for each team (Primary Key)
- **team_name:** Name of the football team

**Matches**

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║   match_id  ║   int    ║
║─────────────┼──────────║
║  host_team  ║   int    ║
║─────────────┼──────────║
║ guest_team  ║   int    ║
║─────────────┼──────────║
║ host_goals  ║   int    ║
║─────────────┼──────────║
║guest_goals  ║   int    ║
╚═════════════╩══════════╝
```

- **match_id:** Unique ID for the match (Primary Key)
- **host_team:** ID of the team that hosted the match (foreign key to Teams.team_id)
- **guest_team:** ID of the team that played as a guest (foreign key to Teams.team_id)
- **host_goals:** Number of goals scored by the host team
- **guest_goals:** Number of goals scored by the guest team

Write a query to calculate the total points of each team after all matches.

- A team gets **3 points** for a win,
- **1 point** for a draw, and
- **0 points** for a loss.

Return the **team_id** , **team_name** , and **num_points** for each team, ordered by **num_points** in descending order. If two teams have the same points, order them by **team_id** in ascending order.

### Example 1:

**Example:**

**Input:**

Teams Table

```
╔═════════╦════════════╗
║ team_id ║ team_name  ║
╠═════════╬════════════╣
║   10    ║ Yocode FC  ║
║─────────┼────────────║
║   20    ║ NewYork FC ║
║─────────┼────────────║
║   30    ║ Atlanta FC ║
║─────────┼────────────║
║   40    ║ Chicago FC ║
║─────────┼────────────║
║   50    ║ Toronto FC ║
╚═════════╩════════════╝
```

Matches Table

```
╔══════════╦═══════════╦════════════╦════════════╦═════════════╗
║ match_id ║ host_team ║ guest_team ║ host_goals ║ guest_goals ║
╠══════════╬═══════════╬════════════╬════════════╬═════════════╣
║    1     ║    10     ║     20     ║     3      ║      0      ║
║──────────┼───────────┼────────────┼────────────┼─────────────║
║    2     ║    30     ║     10     ║     2      ║      2      ║
║──────────┼───────────┼────────────┼────────────┼─────────────║
║    3     ║    10     ║     50     ║     5      ║      1      ║
║──────────┼───────────┼────────────┼────────────┼─────────────║
║    4     ║    20     ║     30     ║     1      ║      0      ║
║──────────┼───────────┼────────────┼────────────┼─────────────║
║    5     ║    50     ║     30     ║     1      ║      0      ║
╚══════════╩═══════════╩════════════╩════════════╩═════════════╝
```

**Expected Output:**

```
╔═════════╦════════════╦════════════╗
║ team_id ║ team_name  ║ num_points ║
╠═════════╬════════════╬════════════╣
║   10    ║ Yocode FC  ║     7      ║
║─────────┼────────────┼────────────║
║   20    ║ NewYork FC ║     3      ║
║─────────┼────────────┼────────────║
║   50    ║ Toronto FC ║     3      ║
║─────────┼────────────┼────────────║
║   30    ║ Atlanta FC ║     1      ║
║─────────┼────────────┼────────────║
║   40    ║ Chicago FC ║     0      ║
╚═════════╩════════════╩════════════╝
```

**Explanation:**

- **Yocode FC (10):**
- Win vs 20 = +3
- Draw vs 30 = +1
- Win vs 50 = +3
- Total = 7
- **NewYork FC (20):**
- Loss vs 10 = 0
- Win vs 30 = +3
- Total = 3
- **Toronto FC (50):**
- Loss vs 10 = 0
- Win vs 30 = +3
- Total = 3
- **Atlanta FC (30):**
- Draw vs 10 = +1
- Loss vs 20 = 0
- Loss vs 50 = 0
- Total = 1
- **Chicago FC (40):**
- No matches = 0

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
