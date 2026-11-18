# [Node Classification](https://takeuforward.org/practice/sql/node-classification?category=ctes-and-hierarchies&source=sql---75-frequently-asked-interview-questions&sidebar=0)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Hierarchical structures like file systems, organizational charts, or comment threads in a forum often need to differentiate between root, inner, and leaf nodes. Proper classification helps in rendering or processing the hierarchy efficiently.

You are given a table **Tree** :

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║     id      ║   int    ║
║─────────────┼──────────║
║    p_id     ║   int    ║
╚═════════════╩══════════╝
```

- **id:** The unique ID of a node (Primary Key).
- **p_id:** The ID of the parent node for this node.
- A node where p_id IS NULL represents the root of the tree (since it has no parent).
- The table forms a valid tree (i.e., it is connected and acyclic with one root).

Each node can be classified as:

```
╔═══════╦═════════════════════════════════════════════════════════════════╗
║ Type  ║                           Description                           ║
╠═══════╬═════════════════════════════════════════════════════════════════╣
║ Root  ║ If p_id IS NULL (i.e., no parent)                               ║
║───────┼─────────────────────────────────────────────────────────────────║
║ Leaf  ║ If the node does not appear as a parent of any other node       ║
║───────┼─────────────────────────────────────────────────────────────────║
║ Inner ║ If the node has a parent (p_id is not NULL) and is also a       ║
║       ║ parent to at least one other node                               ║
╚═══════╩═════════════════════════════════════════════════════════════════╝
```

Write a query to determine the type of each node in a tree structure. Each node should be labeled as one of the following:

- **'Root':** if it has no parent
- **'Leaf':** if it has no children
- **'Inner':** if it has both a parent and children

The output can be in any order.

### Example 1:

**Input:**

```
╔════╦══════╗
║ id ║ p_id ║
╠════╬══════╣
║ 10 ║ null ║
╚════╩══════╝
```

**Expected Output:**

```
╔════╦══════╗
║ id ║ type ║
╠════╬══════╣
║ 10 ║ Root ║
╚════╩══════╝
```

**Explanation:**

Node 10: p_id is null = Root

### Example 2:

**Input:**

```
╔════╦══════╗
║ id ║ p_id ║
╠════╬══════╣
║ 1  ║ null ║
║────┼──────║
║ 2  ║  1   ║
║────┼──────║
║ 3  ║  1   ║
║────┼──────║
║ 4  ║  2   ║
║────┼──────║
║ 5  ║  2   ║
╚════╩══════╝
```

**Expected Output:**

```
╔════╦═══════╗
║ id ║ type  ║
╠════╬═══════╣
║ 1  ║ Root  ║
║────┼───────║
║ 2  ║ Inner ║
║────┼───────║
║ 3  ║ Leaf  ║
║────┼───────║
║ 4  ║ Leaf  ║
║────┼───────║
║ 5  ║ Leaf  ║
╚════╩═══════╝
```

**Explanation:**

- Node 1: p_id is null → Root
- Node 2: Has a parent (1) and children (4,5) → Inner
- Node 3: Has a parent (1) but no children → Leaf
- Node 4 & 5: Have parents (2) but no children → Leaf

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
