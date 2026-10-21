# [Safe Investment Countries](https://takeuforward.org/practice/sql/safe-investment-countries?category=set-operations-and-combined-results&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

A global telecommunications company wants to expand operations and is analyzing call behavior. They plan to invest in countries where users engage in longer conversations, assuming longer calls indicate higher user engagement and potential revenue.

You're provided with three tables:

**Person**

```
╔═══════════════╦══════════╗
║ Column Name   ║   Type   ║
╠═══════════════╬══════════╣
║      id       ║   int    ║
║───────────────┼──────────║
║     name      ║ varchar  ║
║───────────────┼──────────║
║ phone_number  ║ varchar  ║
╚═══════════════╩══════════╝
```

- **id:** Unique identifier (primary key) for each person
- **name:** Name of the person
- **phone_number:** Phone number in the format 'xxx-yyyyyyy' where xxx is the country code and yyyyyyy is the 7-digit local number.

**Country**

```
╔═══════════════╦══════════╗
║ Column Name   ║   Type   ║
╠═══════════════╬══════════╣
║     name      ║ varchar  ║
║───────────────┼──────────║
║ country_code  ║ varchar  ║
╚═══════════════╩══════════╝
```

- **name:** Name of the country
- **country_code:** 3-digit country code (e.g., '001', '044'), it is the primary key.

**Calls**

```
╔═══════════════╦══════════╗
║ Column Name   ║   Type   ║
╠═══════════════╬══════════╣
║   caller_id   ║   int    ║
║───────────────┼──────────║
║   callee_id   ║   int    ║
║───────────────┼──────────║
║   duration    ║   int    ║
╚═══════════════╩══════════╝
```

- **caller_id:** ID of the caller (foreign key to Person.id)
- **callee_id:** ID of the person being called (foreign key to Person.id)
- **duration:** Duration of the call in minutes
- There is no primary key, and rows can be duplicated (i.e., multiple calls between the same people) and caller_id not equal to callee_id.

A telecommunications company is seeking to invest in countries where the average call duration is strictly greater than the global average call duration. Write a query to return the list of such countries. The result can be in any order.

### Example 1:

**Example:**

**Input:**

Person Table

```
╔════╦══════════╦═════════════╗
║ id ║   name   ║phone_number ║
╠════╬══════════╬═════════════╣
║ 3  ║ Jonathan ║ 051-1234567 ║
║────┼──────────┼─────────────║
║ 12 ║  Elvis   ║ 051-7654321 ║
║────┼──────────┼─────────────║
║ 1  ║  Moncef  ║ 212-1234567 ║
║────┼──────────┼─────────────║
║ 2  ║  Maroua  ║ 212-6523651 ║
║────┼──────────┼─────────────║
║ 7  ║   Meir   ║ 972-1234567 ║
║────┼──────────┼─────────────║
║ 9  ║  Rachel  ║ 972-0011100 ║
╚════╩══════════╩═════════════╝
```

Country Table

```
╔══════════╦══════════════╗
║   name   ║ country_code ║
╠══════════╬══════════════╣
║   Peru   ║     051      ║
║──────────┼──────────────║
║  Israel  ║     972      ║
║──────────┼──────────────║
║ Morocco  ║     212      ║
║──────────┼──────────────║
║ Germany  ║     049      ║
║──────────┼──────────────║
║ Ethiopia ║     251      ║
╚══════════╩══════════════╝
```

Calls Table

```
╔═══════════╦═══════════╦══════════╗
║ caller_id ║ callee_id ║ duration ║
╠═══════════╬═══════════╬══════════╣
║     1     ║     9     ║    33    ║
║───────────┼───────────┼──────────║
║     2     ║     9     ║    4     ║
║───────────┼───────────┼──────────║
║     1     ║     2     ║    59    ║
║───────────┼───────────┼──────────║
║     3     ║    12     ║   102    ║
║───────────┼───────────┼──────────║
║     3     ║    12     ║   330    ║
║───────────┼───────────┼──────────║
║    12     ║     3     ║    5     ║
║───────────┼───────────┼──────────║
║     7     ║     9     ║    13    ║
║───────────┼───────────┼──────────║
║     7     ║     1     ║    3     ║
║───────────┼───────────┼──────────║
║     9     ║     7     ║    1     ║
║───────────┼───────────┼──────────║
║     1     ║     7     ║    7     ║
╚═══════════╩═══════════╩══════════╝
```

**Expected Output:**

```
╔═════════╗
║ country ║
╠═════════╣
║  Peru   ║
╚═════════╝
```

**Explanation:**

The average call duration for Peru is:

(102 + 102 + 330 + 330 + 5 + 5) / 6 = 145.67

The average call duration for Israel is:

(33 + 4 + 13 + 13 + 3 + 1 + 1 + 7) / 8 = 9.38

The average call duration for Morocco is:

(33 + 4 + 59 + 59 + 3 + 7) / 6 = 27.50

Global call duration average =

(2 × (33 + 4 + 59 + 102 + 330 + 5 + 13 + 3 + 1 + 7)) / 20 = 55.70

Since Peru is the only country with an average call duration greater than the global average, it is the only country recommended for investment.

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
