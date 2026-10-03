# [Boolean Expression Evaluator](https://takeuforward.org/practice/sql/boolean-expression-evaluator?category=self-joins-and-relationship-queries&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

In systems that evaluate formulas or logical expressions dynamically (e.g., calculators, interpreters, or automation systems), it's common to **store expressions as symbols** and **look up values** to compute truth values. You are given two tables:

**Variables**

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║    name     ║ varchar  ║
║─────────────┼──────────║
║    value    ║   int    ║
╚═════════════╩══════════╝
```

- **name:** The name of the variable (acts as the Primary Key).
- **value:** The integer value assigned to the variable.

**Expressions**

```
╔══════════════╦══════════╗
║ Column Name  ║   Type   ║
╠══════════════╬══════════╣
║ left_operand ║ varchar  ║
║──────────────┼──────────║
║   operator   ║   enum   ║
║──────────────┼──────────║
║right_operand ║ varchar  ║
╚══════════════╩══════════╝
```

- **left_operand:** Name of the left variable in the expression
- **operator:** Comparison operator (<, >, =)
- **right_operand:** Name of the right variable in the expression

Write a query to evaluate each boolean expression in the Expressions table and return the results. The order of the output does not matter.

### Example 1:

**Example:**

**Input:**

Variables

```
╔══════╦═══════╗
║ name ║ value ║
╠══════╬═══════╣
║  x   ║  66   ║
║──────┼───────║
║  y   ║  77   ║
╚══════╩═══════╝
```

Expressions

```
╔══════════════╦══════════╦══════════════╗
║ left_operand ║ operator ║right_operand ║
╠══════════════╬══════════╬══════════════╣
║      x       ║    >     ║      y       ║
║──────────────┼──────────┼──────────────║
║      x       ║    <     ║      y       ║
║──────────────┼──────────┼──────────────║
║      x       ║    =     ║      y       ║
║──────────────┼──────────┼──────────────║
║      y       ║    >     ║      x       ║
║──────────────┼──────────┼──────────────║
║      y       ║    <     ║      x       ║
║──────────────┼──────────┼──────────────║
║      x       ║    =     ║      x       ║
╚══════════════╩══════════╩══════════════╝
```

**Expected Output:**

```
╔══════════════╦══════════╦══════════════╦═══════╗
║ left_operand ║ operator ║right_operand ║ value ║
╠══════════════╬══════════╬══════════════╬═══════╣
║      x       ║    >     ║      y       ║ false ║
║──────────────┼──────────┼──────────────┼───────║
║      x       ║    <     ║      y       ║ true  ║
║──────────────┼──────────┼──────────────┼───────║
║      x       ║    =     ║      y       ║ false ║
║──────────────┼──────────┼──────────────┼───────║
║      y       ║    >     ║      x       ║ true  ║
║──────────────┼──────────┼──────────────┼───────║
║      y       ║    <     ║      x       ║ false ║
║──────────────┼──────────┼──────────────┼───────║
║      x       ║    =     ║      x       ║ true  ║
╚══════════════╩══════════╩══════════════╩═══════╝
```

**Explanation:**

x = 66, y = 77

- x > y = 66 > 77 → False
- x < y = 66 < 77 → True
- x = y = 66 = 77 → False
- y > x = 77 > 66 → True
- y < x = 77 < 66 → False
- x = x = 66 = 66 → True

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
