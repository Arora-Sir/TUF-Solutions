# [Immediate First Orders Percentage](https://takeuforward.org/practice/sql/immediate-first-orders-percentage?category=date-and-time-analysis&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Unspecified](https://img.shields.io/badge/Difficulty-Unspecified-6b7280?style=for-the-badge)

---

## 📝 Problem Statement

A food delivery system keeps track of customer orders and their preferred delivery dates.

The company maintains a **Delivery** table that contains:

```
╔══════════════════════════════╦════════╗
║ Column Name                  ║ Type   ║
╠══════════════════════════════╬════════╣
║ delivery_id                  ║ int    ║
║ customer_id                  ║ int    ║
║ order_date                   ║ date   ║
║ customer_pref_delivery_date  ║ date   ║
╚══════════════════════════════╩════════╝
```

- delivery_id: A unique identifier for each delivery.
- customer_id: ID of the customer who placed the order.
- order_date: Date when the order was placed.
- customer_pref_delivery_date: Customer's preferred delivery date.

If a customer chooses the same date for delivery as the order date, the order is considered " **immediate** ." If the delivery date is different, it is considered " **scheduled** ."

The **first order** of a customer is the one with the earliest order date. Every customer has exactly one first order.

The task is to find the percentage of "immediate" orders among the first orders of all customers, rounded to two decimal places.

### Example 1:

**Example Input:**

```
Delivery Table
╔════════════╦═════════════╦════════════╦══════════════════════════════╗
║ delivery_id║ customer_id ║ order_date ║ customer_pref_delivery_date  ║
╠════════════╬═════════════╬════════════╬══════════════════════════════╣
║     1      ║     1       ║2019-08-01  ║2019-08-02                    ║
║     2      ║     2       ║2019-08-02  ║2019-08-02                    ║
║     3      ║     1       ║2019-08-11  ║2019-08-12                    ║
║     4      ║     3       ║2019-08-24  ║2019-08-24                    ║
║     5      ║     3       ║2019-08-21  ║2019-08-22                    ║
║     6      ║     2       ║2019-08-11  ║2019-08-13                    ║
║     7      ║     4       ║2019-08-09  ║2019-08-09                    ║
╚════════════╩═════════════╩════════════╩══════════════════════════════╝
```

**Output:**

```
╔════════════════════╗
║immediate_percentage║
╠════════════════════╣
║        50.00       ║
╚════════════════════╝
```

**Explanation:**

- **Customer 1** : First order on 2019-08-01 → Scheduled
- **Customer 2** : First order on 2019-08-02 → Immediate
- **Customer 3** : First order on 2019-08-21 → Scheduled
- **Customer 4** : First order on 2019-08-09 → Immediate

Thus, 2 out of 4 customers placed immediate first orders → (2/4) * 100 = 50.00%

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
