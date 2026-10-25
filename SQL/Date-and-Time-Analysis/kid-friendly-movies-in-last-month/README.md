# [Kid-Friendly Movies in Last Month](https://takeuforward.org/practice/sql/kid-friendly-movies-in-last-month?category=date-and-time-analysis&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

Media streaming companies want to analyze how much kid-friendly movie content was broadcast during a specific month to optimize children's programming. This helps in planning future programming schedules and tracking engagement among the young audience.

You are given two tables:

**TVProgram**

```
╔═══════════════╦══════════╗
║ Column Name   ║   Type   ║
╠═══════════════╬══════════╣
║ program_date  ║   date   ║
║───────────────┼──────────║
║  content_id   ║   int    ║
║───────────────┼──────────║
║    channel    ║ varchar  ║
╚═══════════════╩══════════╝
```

- **program_date:** The date the content was aired
- **content_id:** The ID of the content aired (links to Content.content_id)
- **channel:** The channel where the content was broadcasted
- **Primary Key:** (program_date, content_id) this ensures each content can appear once per day per channel, uniquely identified.

**Content**

```
╔═══════════════╦══════════════════╗
║ Column Name   ║      Type        ║
╠═══════════════╬══════════════════╣
║  content_id   ║     varchar      ║
║───────────────┼──────────────────║
║     title     ║     varchar      ║
║───────────────┼──────────────────║
║ Kids_content  ║ enum('Y','N')    ║
║───────────────┼──────────────────║
║ content_type  ║     varchar      ║
╚═══════════════╩══════════════════╝
```

- **content_id:** Unique identifier for the content (Primary Key)
- **title:** Title of the content
- **Kids_content:** 'Y' if it is suitable for kids, 'N' otherwise
- **content_type:** Type of content: e.g., 'movie', 'series', 'documentary', etc.

Write a query to return the **distinct titles** of **kid-friendly movies** that were **streamed in June 2020** . The result can be in any order.

### Example 1:

**Example:**

**Input:**

TVProgram Table

```
╔═══════════════════╦═══════════╦═══════════╗
║   program_date    ║content_id ║  channel  ║
╠═══════════════════╬═══════════╬═══════════╣
║ 2020-06-10 08:00  ║     1     ║VC-Channel ║
║───────────────────┼───────────┼───────────║
║ 2020-05-11 12:00  ║     2     ║VC-Channel ║
║───────────────────┼───────────┼───────────║
║ 2020-06-12 12:00  ║     3     ║VC-Channel ║
║───────────────────┼───────────┼───────────║
║ 2020-05-13 14:00  ║     4     ║ Disney Ch ║
║───────────────────┼───────────┼───────────║
║ 2020-06-18 14:00  ║     4     ║ Disney Ch ║
║───────────────────┼───────────┼───────────║
║ 2020-07-15 16:00  ║     5     ║ Disney Ch ║
╚═══════════════════╩═══════════╩═══════════╝
```

Content Table

```
╔═══════════╦════════════════╦══════════════╦══════════════╗
║content_id ║     title      ║Kids_content  ║content_type  ║
╠═══════════╬════════════════╬══════════════╬══════════════╣
║     1     ║ Cheatcode Movie║      N       ║    Movies    ║
║───────────┼────────────────┼──────────────┼──────────────║
║     2     ║ Alg. for Kids  ║      Y       ║    Series    ║
║───────────┼────────────────┼──────────────┼──────────────║
║     3     ║ Database Sols  ║      N       ║    Series    ║
║───────────┼────────────────┼──────────────┼──────────────║
║     4     ║    Aladdin     ║      Y       ║    Movies    ║
║───────────┼────────────────┼──────────────┼──────────────║
║     5     ║   Cinderella   ║      Y       ║    Movies    ║
╚═══════════╩════════════════╩══════════════╩══════════════╝
```

**Expected Output:**

```
╔═════════╗
║  title  ║
╠═════════╣
║ Aladdin ║
╚═════════╝
```

**Explanation:**

- **Aladdin:** Kid-friendly (Y), movie, and streamed on 2020-06-18 (included)
- **Cinderella:** Kid-friendly, movie, but streamed in July, not June (excluded)
- **Alg. for Kids:** Kid-friendly, but is a series, not movie (excluded)
- **Cheatcode Movie:** A movie, but not for kids (excluded)

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
