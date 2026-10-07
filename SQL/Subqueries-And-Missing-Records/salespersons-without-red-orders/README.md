# [Salespersons Without RED Orders](https://takeuforward.org/practice/sql/salespersons-without-red-orders?category=subqueries-and-missing-records&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

You are managing a sales analytics system and want to identify salespeople who have never sold to a specific company.&nbsp;

You are given 3 tables:

SalesPerson:

```
╔═════════════════╦══════════╗
║   Column Name   ║   Type   ║
╠═════════════════╬══════════╣
║    sales_id     ║   int    ║
║─────────────────┼──────────║
║      name       ║ varchar  ║
║─────────────────┼──────────║
║     salary      ║   int    ║
║─────────────────┼──────────║
║ commission_rate ║   int    ║
╚═════════════════╩══════════╝
```

- sales_id: Unique ID for each salesperson (Primary Key)&nbsp;
- name: Name of the salesperson&nbsp;
- salary: Base salary of the salesperson&nbsp;
- commission_rate: Commission rate&nbsp;

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║   com_id    ║   int    ║
║─────────────┼──────────║
║    name     ║ varchar  ║
╚═════════════╩══════════╝
```

- com_id: Unique ID for each company (Primary Key)&nbsp;
- name: Company name&nbsp;

Orders:

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║  order_id   ║   int    ║
║─────────────┼──────────║
║ order_date  ║   date   ║
║─────────────┼──────────║
║   com_id    ║   int    ║
║─────────────┼──────────║
║  sales_id   ║   int    ║
║─────────────┼──────────║
║   amount    ║   int    ║
╚═════════════╩══════════╝
```

- order_id: Unique ID for each order (Primary Key)&nbsp;
- order_date: The date the order was placed&nbsp;
- com_id: Foreign key to Company.com_id (who placed the order)&nbsp;
- sales_id: Foreign key to SalesPerson.sales_id (who handled the order)&nbsp;
- amount: Value of the order in currency

Write a query to list the names of all salespersons who have not handled any orders for the company named 'RED'. The result can be returned in any order.

### Example 1:

Example:

Input:

SalesPerson:

```
╔══════════╦══════════╦══════════╦═════════════════╗
║ sales_id ║   name   ║  salary  ║ commission_rate ║
╠══════════╬══════════╬══════════╬═════════════════╣
║    1     ║   John   ║  20000   ║       23        ║
║──────────┼──────────┼──────────┼─────────────────║
║    2     ║   Amy    ║  13000   ║       21        ║
║──────────┼──────────┼──────────┼─────────────────║
║    3     ║   Mark   ║  63000   ║       10        ║
║──────────┼──────────┼──────────┼─────────────────║
║    4     ║   Pam    ║  20000   ║       12        ║
║──────────┼──────────┼──────────┼─────────────────║
║    5     ║   Alex   ║  50000   ║       20        ║
╚══════════╩══════════╩══════════╩═════════════════╝
```

```
╔══════════╦══════════╗
║  com_id  ║   name   ║
╠══════════╬══════════╣
║    1     ║   RED    ║
║──────────┼──────────║
║    2     ║  ORANGE  ║
║──────────┼──────────║
║    3     ║  YELLOW  ║
║──────────┼──────────║
║    4     ║  GREEN   ║
╚══════════╩══════════╝
```

Orders:

```
╔══════════╦════════════╦══════════╦══════════╦══════════╗
║ order_id ║ order_date ║  com_id  ║ sales_id ║  amount  ║
╠══════════╬════════════╬══════════╬══════════╬══════════╣
║    1     ║  1-1-2025  ║    3     ║    4     ║  80000   ║
║──────────┼────────────┼──────────┼──────────┼──────────║
║    2     ║  2-1-2025  ║    4     ║    5     ║   500    ║
║──────────┼────────────┼──────────┼──────────┼──────────║
║    3     ║  3-1-2025  ║    1     ║    1     ║   4000   ║
║──────────┼────────────┼──────────┼──────────┼──────────║
║    4     ║  4-1-2025  ║    1     ║    4     ║  34000   ║
╚══════════╩════════════╩══════════╩══════════╩══════════╝
```

Output:

```
╔══════════╗
║   name   ║
╠══════════╣
║   Amy    ║
║──────────║
║   Mark   ║
║──────────║
║   Alex   ║
╚══════════╝
```

Explanation:

- John (ID 1) = Sold to RED (Excluded)
- Pam (ID 4) = Sold to RED (Excluded)
- Amy (ID 2) = No orders to RED (Included)
- Mark (ID 3) = No orders to RED (Included)
- Alex (ID 5) = Only sold to GREEN (Included)

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
