# [Find Quiet Students in All Exams](https://takeuforward.org/practice/sql/find-quiet-students-in-all-exams?category=subqueries-and-missing-records&source=sql---75-frequently-asked-interview-questions)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

We have two tables: **Student** and **Exam** .

**Table: Student**

```
+---------------------+---------+
| Column Name         | Type    |
+---------------------+---------+
| student_id          | int     |
| student_name        | varchar |
+---------------------+---------+
```

- **student_id** is the primary key and contains unique values for this table.
- **student_name** is the name of the student.

**Table: Exam**

```
+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| exam_id       | int     |
| student_id    | int     |
| score         | int     |
+---------------+---------+
```

- **(exam_id, student_id)** is the primary key for this table.
- Each row in this table indicates that the student with **student_id** scored **score** in the exam with **exam_id** .

**Task:**

Write a query to report the students ( **student_id** , **student_name** ) who are considered "quiet" in all exams. A quiet student is defined as a student who took at least one exam and did not score the highest or the lowest score in any exam they participated in.

Return the result table ordered by **student_id** .

### Example 1:

**Example:**

**Input:**

Student table:

```
+-------------+---------------+
| student_id  | student_name  |
+-------------+---------------+
| 1           | Daniel        |
| 2           | Jade          |
| 3           | Stella        |
| 4           | Jonathan      |
| 5           | Will          |
+-------------+---------------+
```

Exam table:

```
+------------+--------------+-----------+
| exam_id    | student_id   | score     |
+------------+--------------+-----------+
| 10         |     1        |    70     |
| 10         |     2        |    80     |
| 10         |     3        |    90     |
| 20         |     1        |    80     |
| 30         |     1        |    70     |
| 30         |     3        |    80     |
| 30         |     4        |    90     |
| 40         |     1        |    60     |
| 40         |     2        |    70     |
| 40         |     4        |    80     |
+------------+--------------+-----------+
```

**Output:**

```
+-------------+---------------+
| student_id  | student_name  |
+-------------+---------------+
| 2           | Jade          |
+-------------+---------------+
```

**Explanation:**

- For exam 10, student 1 scored the lowest (70) and student 3 scored the highest (90).
- For exam 20, student 1 scored both the highest and the lowest score.
- For exam 30 and exam 40, student 1 and student 4 scored the highest and lowest respectively.
- Student 2 (Jade) did not have the highest or lowest score in any of the exams they took, so she is included in the result.
- Student 5 (Will) did not take any exams, so they are excluded from the result.

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
