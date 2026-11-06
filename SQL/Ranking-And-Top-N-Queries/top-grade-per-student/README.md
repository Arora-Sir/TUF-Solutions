# [Top Grade per Student](https://takeuforward.org/practice/sql/top-grade-per-student?category=ranking-and-top-n-queries&source=sql---75-frequently-asked-interview-questions&sidebar=0)

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-eab308?style=for-the-badge)

---

## 📝 Problem Statement

You are analyzing student performance data and want to identify, for each student highest grade they received, the course in which they received it, which can be useful for reporting academic strengths or awarding student honors.

You are given a table Enrollments with:

```
╔═════════════╦══════════╗
║ Column Name ║   Type   ║
╠═════════════╬══════════╣
║ student_id  ║   int    ║
║─────────────┼──────────║
║  course_id  ║   int    ║
║─────────────┼──────────║
║    grade    ║   int    ║
╚═════════════╩══════════╝
```

- *student_id* : The ID of the student.
- *course_id* : The ID of the course the student is enrolled in.
- *grade* : The grade received in that course.
- ( *student_id,course_id* ) is the primary key (combination of columns).

Write a query to retrieve each student's highest grade along with the corresponding course. If there is a tie in grades, select the course with the smallest course_id. The final result should be sorted in ascending order by student_id.

### Example 1:

Example:

Input:

Enrollments:

```
╔════════════╦═══════════╦══════════╗
║ student_id ║ course_id ║  grade   ║
╠════════════╬═══════════╬══════════╣
║     2      ║     2     ║    95    ║
║────────────┼───────────┼──────────║
║     2      ║     3     ║    95    ║
║────────────┼───────────┼──────────║
║     1      ║     1     ║    90    ║
║────────────┼───────────┼──────────║
║     1      ║     2     ║    99    ║
║────────────┼───────────┼──────────║
║     3      ║     1     ║    80    ║
║────────────┼───────────┼──────────║
║     3      ║     2     ║    75    ║
║────────────┼───────────┼──────────║
║     3      ║     3     ║    82    ║
╚════════════╩═══════════╩══════════╝
```

Output:

```
╔════════════╦═══════════╦══════════╗
║ student_id ║ course_id ║  grade   ║
╠════════════╬═══════════╬══════════╣
║     1      ║     2     ║    99    ║
║────────────┼───────────┼──────────║
║     2      ║     2     ║    95    ║
║────────────┼───────────┼──────────║
║     3      ║     3     ║    82    ║
╚════════════╩═══════════╩══════════╝
```

Explanation:

- Student 1: Highest grade = 99 (course 2)&nbsp;
- Student 2: Highest grade = 95 in both course 2 & 3 → choose course 2 (smallest ID)&nbsp;
- Student 3: Highest grade = 82 (course 3)&nbsp;

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
