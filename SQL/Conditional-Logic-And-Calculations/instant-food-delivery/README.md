# [Instant Food Delivery](https://takeuforward.org/practice/sql/instant-food-delivery?category=conditional-logic-and-calculations&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

As a restaurant owner, you want to understand how many orders are being processed immediately (on the same day the order is placed) compared to scheduled orders (set for a later day). This is useful for improving delivery logistics and understanding customer expectations.

You are given a **Delivery** table where each record contains:

```
╔════════════════════════════╦══════════╗
║       Column Name          ║   Type   ║
╠════════════════════════════╬══════════╣
║       delivery_id          ║   int    ║
║────────────────────────────┼──────────║
║       customer_id          ║   int    ║
║────────────────────────────┼──────────║
║       order_date           ║   date   ║
║────────────────────────────┼──────────║
║customer_pref_delivery_date ║   date   ║
╚════════════════════════════╩══════════╝
```

- **delivery_id:** Unique identifier for each delivery.
- **customer_id:** Identifier for the customer.
- **order_date:** Date the customer places the order.
- **customer_pref_delivery_date:** The preferred delivery date of the customer.

An order is considered **immediate** if the customer's preferred delivery date is the same as the order date; otherwise, it is considered **scheduled** .

Write a query to calculate the **percentage of immediate orders** from the Delivery table. Round the result to **2 decimal places** .

### Example 1:

**Example:**

**Input:**

Delivery Table

```
╔═════════════╦═════════════╦════════════╦══════════════════════════╗
║ delivery_id ║ customer_id ║ order_date ║customer_pref_delivery_date║
╠═════════════╬═════════════╬════════════╬══════════════════════════╣
║      1      ║      1      ║ 2019-08-01 ║       2019-08-02         ║
║─────────────┼─────────────┼────────────┼──────────────────────────║
║      2      ║      5      ║ 2019-08-02 ║       2019-08-02         ║
║─────────────┼─────────────┼────────────┼──────────────────────────║
║      3      ║      1      ║ 2019-08-11 ║       2019-08-11         ║
║─────────────┼─────────────┼────────────┼──────────────────────────║
║      4      ║      3      ║ 2019-08-24 ║       2019-08-26         ║
║─────────────┼─────────────┼────────────┼──────────────────────────║
║      5      ║      4      ║ 2019-08-21 ║       2019-08-22         ║
║─────────────┼─────────────┼────────────┼──────────────────────────║
║      6      ║      2      ║ 2019-08-11 ║       2019-08-13         ║
╚═════════════╩═════════════╩════════════╩══════════════════════════╝
```

**Expected Output:**

```
╔═════════════════════╗
║ immediate_percentage║
╠═════════════════════╣
║       33.33         ║
╚═════════════════════╝
```

**Explanation:**

- There are **6 total orders** .
- Of these, **2 orders** are immediate (delivery_ids 2 and 3).
- So the percentage of immediate orders is: (2 / 6) * 100 = 33.33%

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
