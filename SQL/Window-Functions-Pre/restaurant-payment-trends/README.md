# [Restaurant Payment Trends](https://takeuforward.org/practice/sql/restaurant-payment-trends?category=window-functions-pre&source=sql---75-frequently-asked-interview-questions&sidebar=0)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

As the owner of a restaurant, you're interested in tracking how much your customers are spending on average over the past 7 days. This moving average will help you analyze customer behavior and plan for possible restaurant expansion.

You are given a **Customer** table with:

```
╔═════════════╦═════════╗
║ Column Name ║  Type   ║
╠═════════════╬═════════╣
║ customer_id ║   int   ║
║─────────────┼─────────║
║    name     ║ varchar ║
║─────────────┼─────────║
║ visited_on  ║  date   ║
║─────────────┼─────────║
║   amount    ║   int   ║
╚═════════════╩═════════╝
```

- **customer_id** : Unique ID of the customer.
- **name** : Name of the customer.
- **visited_on** : The date the customer visited the restaurant.
- **amount** : The amount spent by the customer on that day.
- (customer_id, visited_on) is the primary key.

You need to calculate the moving average for each customer's spending, considering the total amount paid in the last 7 days, including the current day.

The moving average should be rounded to two decimal places.

### Example 1:

**Example:**

**Input:**

Customer Table

```
╔═════════════╦═════════╦════════════╦════════╗
║ customer_id ║  name   ║ visited_on ║ amount ║
╠═════════════╬═════════╬════════════╬════════╣
║      1      ║  Jhon   ║ 2019-01-01 ║  100   ║
║─────────────┼─────────┼────────────┼────────║
║      2      ║ Daniel  ║ 2019-01-02 ║  110   ║
║─────────────┼─────────┼────────────┼────────║
║      3      ║  Jade   ║ 2019-01-03 ║  120   ║
║─────────────┼─────────┼────────────┼────────║
║      4      ║ Khaled  ║ 2019-01-04 ║  130   ║
║─────────────┼─────────┼────────────┼────────║
║      5      ║ Winston ║ 2019-01-05 ║  110   ║
║─────────────┼─────────┼────────────┼────────║
║      6      ║  Elvis  ║ 2019-01-06 ║  140   ║
║─────────────┼─────────┼────────────┼────────║
║      7      ║  Anna   ║ 2019-01-07 ║  150   ║
║─────────────┼─────────┼────────────┼────────║
║      8      ║ Maria   ║ 2019-01-08 ║   80   ║
║─────────────┼─────────┼────────────┼────────║
║      9      ║  Jaze   ║ 2019-01-09 ║  110   ║
║─────────────┼─────────┼────────────┼────────║
║      1      ║  Jhon   ║ 2019-01-10 ║  130   ║
║─────────────┼─────────┼────────────┼────────║
║      3      ║  Jade   ║ 2019-01-10 ║  150   ║
╚═════════════╩═════════╩════════════╩════════╝
```

**Expected Output:**

```
╔════════════╦════════╦════════════════╗
║ visited_on ║ amount ║ average_amount ║
╠════════════╬════════╬════════════════╣
║ 2019-01-07 ║  860   ║    122.86      ║
║────────────┼────────┼────────────────║
║ 2019-01-08 ║  840   ║    120.00      ║
║────────────┼────────┼────────────────║
║ 2019-01-09 ║  840   ║    120.00      ║
║────────────┼────────┼────────────────║
║ 2019-01-10 ║ 1000   ║    142.86      ║
╚════════════╩════════╩════════════════╝
```

**Explanation:**

- **First moving average (2019-01-01 to 2019-01-07):** (100 + 110 + 120 + 130 + 110 + 140 + 150) / 7 = 122.86
- **Second moving average (2019-01-02 to 2019-01-08):** (110 + 120 + 130 + 110 + 140 + 150 + 80) / 7 = 120.00
- **Third moving average (2019-01-03 to 2019-01-09):** (120 + 130 + 110 + 140 + 150 + 80 + 110) / 7 = 120.00
- **Fourth moving average (2019-01-04 to 2019-01-10):** (130 + 110 + 140 + 150 + 80 + 110 + 130 + 150) / 7 = 142.86

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
