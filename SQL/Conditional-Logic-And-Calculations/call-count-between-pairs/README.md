# [Call Count Between Pairs](https://takeuforward.org/practice/sql/call-count-between-pairs?category=conditional-logic-and-calculations&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

In a telecom company, understanding the number of calls and the total call duration between pairs of customers can provide insights into customer behavior, usage patterns, and help in generating reports for billing and customer relationship management.

You are given a **Calls** table:

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║   from_id   ║   int    ║
║─────────────┼──────────║
║    to_id    ║   int    ║
║─────────────┼──────────║
║  duration   ║   int    ║
╚═════════════╩══════════╝
```

- **from_id** : The person who initiated the call.
- **to_id** : The person who received the call.
- **duration** : The duration of the call in seconds.

**No primary key** : This table does not have a primary key, so it can have duplicate records (e.g., multiple calls between the same two individuals on different days).

**No self-calls** : The condition from_id != to_id ensures that no record represents a call where a person calls themselves.

Write a query to report the number of calls and the total call duration between each pair of distinct persons (person1, person2), where **person1 < person2** . And the final output is sorted by person1 and person2 in ascending order.

### Example 1:

**Example:**

**Input:**

Calls Table

```
╔═════════╦═══════╦══════════╗
║ from_id ║ to_id ║ duration ║
╠═════════╬═══════╬══════════╣
║    1    ║   2   ║    59    ║
║─────────┼───────┼──────────║
║    2    ║   1   ║    11    ║
║─────────┼───────┼──────────║
║    1    ║   3   ║    20    ║
║─────────┼───────┼──────────║
║    3    ║   4   ║   100    ║
║─────────┼───────┼──────────║
║    3    ║   4   ║   200    ║
║─────────┼───────┼──────────║
║    3    ║   4   ║   200    ║
║─────────┼───────┼──────────║
║    4    ║   3   ║   499    ║
╚═════════╩═══════╩══════════╝
```

**Output:**

```
╔═════════╦═════════╦════════════╦════════════════╗
║ person1 ║ person2 ║ call_count ║ total_duration ║
╠═════════╬═════════╬════════════╬════════════════╣
║    1    ║    2    ║     2      ║       70       ║
║─────────┼─────────┼────────────┼────────────────║
║    1    ║    3    ║     1      ║       20       ║
║─────────┼─────────┼────────────┼────────────────║
║    3    ║    4    ║     4      ║      999       ║
╚═════════╩═════════╩════════════╩════════════════╝
```

**Explanation:**

- For person1 = 1 and person2 = 2, there were 2 calls: one from 1 to 2 and one from 2 to 1. The total duration is 59 + 11 = 70.
- For person1 = 1 and person2 = 3, there was 1 call from 1 to 3 with a duration of 20.
- For person1 = 3 and person2 = 4, there were 4 calls from 3 to 4 with durations 100 + 200 + 200 + 499 = 999.

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
