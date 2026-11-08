# [Most Frequently Ordered Product(s) for Each Customer](https://takeuforward.org/practice/sql/most-frequently-ordered-product(s)-for-each-customer?category=ranking-and-top-n-queries&source=sql---75-frequently-asked-interview-questions&sidebar=0)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

We have three tables: **Clients** , **Purchases** , and **Items** .

**Table: Clients**

```
╔═════════════╦════════╗
║ Column Name ║  Type  ║
╠═════════════╬════════╣
║  client_id  ║  int   ║
║─────────────┼────────║
║    name     ║varchar ║
╚═════════════╩════════╝
```

- client_id is the primary key for the Clients table and contains unique values.
- Each row in this table represents a client's information.

**Table: Purchases**

```
╔═════════════╦══════════════╗
║   Column    ║     Type     ║           
╠═════════════╬══════════════╣
║ purchase_id ║     int      ║           
║─────────────┼──────────────║
║purchase_date║     date     ║          
║─────────────┼──────────────║
║  client_id  ║     int      ║          
║─────────────┼──────────────║
║   item_id   ║     int      ║     
╚═════════════╩══════════════╝
```

- purchase_id is the primary key for the Purchases table.
- client_id references the client who made the purchase.
- item_id references the purchased item.

**Table: Items**

```
╔════════════╦══════════════╦═══════╗
║   Column   ║     Type     ║       ║
╠════════════╬══════════════╬═══════╣
║  item_id   ║     int      ║       ║
║────────────┼──────────────┼───────║
║ item_name  ║   varchar    ║       ║
║────────────┼──────────────┼───────║
║   price    ║     int      ║       ║
╚════════════╩══════════════╩═══════╝
```

- item_id is the primary key for the Items table and contains unique values.
- Each row in this table represents an item's information, including its name and price.

**Task:**

Write a query to find the most frequently ordered item(s) for each customer. If there are multiple items with the same frequency for a customer, return all of them.

Return the result table ordered by client_id in ascending order and then by item_id in ascending order.

### Example 1:

**Example:**

**Input:**

Clients table:

```
╔═════════════╦════════╗
║  client_id  ║  name  ║
╠═════════════╬════════╣
║      1      ║ Andrew ║
║─────────────┼────────║
║      2      ║ Bella  ║
║─────────────┼────────║
║      3      ║ Chris  ║
║─────────────┼────────║
║      4      ║ David  ║
║─────────────┼────────║
║      5      ║  Eva   ║
╚═════════════╩════════╝
```

Purchases table:

```
╔═════════════╦══════════════╦═══════════╦═════════╗
║ purchase_id ║purchase_date ║ client_id ║ item_id ║
╠═════════════╬══════════════╬═══════════╬═════════╣
║      1      ║  2021-07-31  ║     1     ║    1    ║
║─────────────┼──────────────┼───────────┼─────────║
║      2      ║  2021-07-30  ║     2     ║    2    ║
║─────────────┼──────────────┼───────────┼─────────║
║      3      ║  2021-08-29  ║     3     ║    3    ║
║─────────────┼──────────────┼───────────┼─────────║
║      4      ║  2021-07-29  ║     4     ║    1    ║
║─────────────┼──────────────┼───────────┼─────────║
║      5      ║  2021-06-10  ║     1     ║    2    ║
║─────────────┼──────────────┼───────────┼─────────║
║      6      ║  2021-08-01  ║     2     ║    1    ║
║─────────────┼──────────────┼───────────┼─────────║
║      7      ║  2021-08-01  ║     3     ║    3    ║
║─────────────┼──────────────┼───────────┼─────────║
║      8      ║  2021-08-03  ║     1     ║    2    ║
║─────────────┼──────────────┼───────────┼─────────║
║      9      ║  2021-08-07  ║     2     ║    3    ║
║─────────────┼──────────────┼───────────┼─────────║
║     10      ║  2021-07-15  ║     1     ║    2    ║
╚═════════════╩══════════════╩═══════════╩═════════╝
```

Items table:

```
╔════════════╦══════════════╦═══════╗
║  item_id   ║  item_name   ║ price ║
╠════════════╬══════════════╬═══════╣
║     1      ║    Laptop    ║ 1200  ║
║────────────┼──────────────┼───────║
║     2      ║    Phone     ║  800  ║
║────────────┼──────────────┼───────║
║     3      ║    Tablet    ║  600  ║
║────────────┼──────────────┼───────║
║     4      ║ Headphones   ║  150  ║
╚════════════╩══════════════╩═══════╝
```

**Output:**

```
╔═════════════╦════════════╦══════════════╗
║  client_id  ║  item_id   ║  item_name   ║
╠═════════════╬════════════╬══════════════╣
║      1      ║     2      ║    Phone     ║
║─────────────┼────────────┼──────────────║
║      2      ║     1      ║    Laptop    ║
║─────────────┼────────────┼──────────────║
║      2      ║     2      ║    Phone     ║
║─────────────┼────────────┼──────────────║
║      2      ║     3      ║    Tablet    ║
║─────────────┼────────────┼──────────────║
║      3      ║     3      ║    Tablet    ║
║─────────────┼────────────┼──────────────║
║      4      ║     1      ║    Laptop    ║
╚═════════════╩════════════╩══════════════╝
```

**Explanation:**

- Andrew (client 1) ordered the Phone 3 times and the Laptop once. So, the most frequently ordered product for him is the Phone.
- Bella (client 2) ordered the Laptop, Phone, and Tablet, all with the same frequency, so all three are included for her.
- Chris (client 3) ordered the Tablet twice, which is the most frequently ordered item for him.
- David (client 4) ordered the Laptop once, so it is the most frequently ordered item for him.
- Eva (client 5) has not made any orders, so she is not included in the result.

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
