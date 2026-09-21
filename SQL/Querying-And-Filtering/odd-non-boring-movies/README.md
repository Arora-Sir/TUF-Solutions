# [Odd Non-Boring Movies](https://takeuforward.org/practice/sql/odd-non-boring-movies?category=querying-and-filtering&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

A movie streaming platform maintains a database of movies. The content curation team wants to feature movies that are more engaging and unique.

The company maintains a **Cinema** table that contains:

╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ id ║ int ║
║─────────────┼──────────║
║ movie ║ varchar ║
║─────────────┼──────────║
║ description ║ varchar ║
║─────────────┼──────────║
║ rating ║ float ║
╚═════════════╩══════════╝

- id: A unique (primary key) integer representing each movie.
- movie: The title of the movie.
- description: A short summary or keyword describing the movie.
- rating: A float (2 decimal places) from 0 to 10 indicating the movie's rating.

The task is to:

- Filter movies where the id is an odd number.
- Exclude any movie where the description is exactly 'boring'.
- Sort the results by rating in descending order.

The sample output format is in the following example.

### Example 1:

**Input:**

Cinema Table:

╔══════════╦══════════════╦═════════════╦══════════╗
║ id ║ movie ║ description ║ rating ║
╠══════════╬══════════════╬═════════════╬══════════╣
║ 1 ║ Galaxy Raid ║ great 3D ║ 8.9 ║
║──────────┼──────────────┼─────────────┼──────────║
║ 2 ║ Future Code ║ fiction ║ 8.5 ║
║──────────┼──────────────┼─────────────┼──────────║
║ 3 ║ Old Times ║ boring ║ 6.2 ║
║──────────┼──────────────┼─────────────┼──────────║
║ 4 ║ Winter Dream ║ Fantacy ║ 8.6 ║
║──────────┼──────────────┼─────────────┼──────────║
║ 5 ║ Silent Echo ║ Interesting ║ 9.1 ║
╚══════════╩══════════════╩═════════════╩══════════╝

**Output:**

╔══════════╦═════════════╦═════════════╦══════════╗
║ id ║ movie ║ description ║ rating ║
╠══════════╬═════════════╬═════════════╬══════════╣
║ 5 ║ Silent Echo ║ Interesting ║ 9.1 ║
║──────────┼─────────────┼─────────────┼──────────║
║ 1 ║ Galaxy Raid ║ great 3D ║ 8.9 ║
╚══════════╩═════════════╩═════════════╩══════════╝

**Explanation:**

- ID 1 (Galaxy Raid) - Odd ID, description is not 'boring' → Included
- ID 3 (Old Times) - Odd ID, but description is 'boring' → Excluded
- ID 5 (Silent Echo) - Odd ID, description is not 'boring' → Included
- ID 2, 4 - Even IDs → Excluded

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
