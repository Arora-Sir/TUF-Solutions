# [Non-Referred Customers](https://takeuforward.org/practice/sql/non-referred-customers?category=querying-and-filtering&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A company has a customer referral program, where existing customers can refer new customers to the platform. Each customer record includes the referee_id, which indicates who referred them.

The company maintains a table named **Customer** to store customer details.

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║     id      ║   int    ║
║─────────────┼──────────║
║    name     ║  varchar ║
║─────────────┼──────────║
║ referee_id  ║   int    ║
╚═════════════╩══════════╝
```

- *id:* A unique identifier (primary key) for the customer table.
- *name:* The name of the customer.
- *referee_id:* The id of the customer who referred them (can be NULL if they were not referred).

You need to retrieve the names of customers who were **NOT** referred by customer **id = 2** . The output can be in any order.

The sample output format is in the following example.

### Example 1:

Customer Table:

```
╔══════════╦══════════╦════════════╗
║    id    ║   name   ║ referee_id ║
╠══════════╬══════════╬════════════╣
║    1     ║  Alice   ║    NULL    ║
║──────────┼──────────┼────────────║
║    2     ║  Daniel  ║    NULL    ║
║──────────┼──────────┼────────────║
║    3     ║  James   ║     2      ║
║──────────┼──────────┼────────────║
║    4     ║  Sarah   ║    NULL    ║
║──────────┼──────────┼────────────║
║    5     ║  Kevin   ║     1      ║
║──────────┼──────────┼────────────║
║    6     ║  Robert  ║     2      ║
╚══════════╩══════════╩════════════╝
```

Output:

```
╔══════════╗
║   name   ║
╠══════════╣
║  Alice   ║
║──────────║
║  Daniel  ║
║──────────║
║  Sarah   ║
║──────────║
║  Kevin   ║
╚══════════╝
```

**Explanation:**

- Alice,&nbsp;Daniel,&nbsp;Sarah, and&nbsp;Kevin&nbsp;are included in the output because they were&nbsp;not referred by customer&nbsp;id = 2.
- James&nbsp;and&nbsp;Robert&nbsp;are excluded because they were referred by customer&nbsp;id = 2.

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
