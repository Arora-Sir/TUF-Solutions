# [Implement Queue using Arrays](https://takeuforward.org/plus/dsa/problems/implement-queue-using-arrays?subject=dsa&approach=optimal&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

Implement a First-In-First-Out (FIFO) queue using an array. The implemented queue should support the following operations: push, peek, pop, and isEmpty.

Implement the ArrayQueue class:

void push(int x): Adds element x to the end of the queue.

int pop(): Removes and returns the front element of the queue.

int peek(): Returns the front element of the queue without removing it.

boolean isEmpty(): Returns true if the queue is empty, false otherwise.

### Example 1

Input:

["ArrayQueue", "push", "push", "peek", "pop", "isEmpty"]

[[], [5], [10], [], [], []]

Output: [null, null, null, 5, 5, false]

Explanation:

ArrayQueue queue = new ArrayQueue();

queue.push(5);

queue.push(10);

queue.peek(); // returns 5

queue.pop(); // returns 5

queue.isEmpty(); // returns false

### Example 2

Input:

["ArrayQueue", "isEmpty"]

[[]]

Output:[null, true]

Explanation:

ArrayQueue queue = new ArrayQueue();

queue.isEmpty(); // returns true

### Constraints

- 1 <= numbers of calls made <= 100
- 1 <= x <= 100

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
