# [Implement Stack using Queue](https://takeuforward.org/plus/dsa/problems/implement-stack-using-queue?subject=dsa&approach=optimal&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

Implement a Last-In-First-Out (LIFO) stack using a single queue. The implemented stack should support the following operations: push, pop, top, and isEmpty.

Implement the QueueStack class:

void push(int x): Pushes element x onto the stack.

int pop(): Removes and returns the top element of the stack.

int top(): Returns the top element of the stack without removing it.

boolean isEmpty(): Returns true if the stack is empty, false otherwise.

### Example 1

Input:

["QueueStack", "push", "push", "pop", "top", "isEmpty"]

[[], [4], [8], [], [], []]

Output: [null, null, null, 8, 4, false]

Explanation:

QueueStack stack = new QueueStack();

stack.push(4);

stack.push(8);

stack.pop(); // returns 8

stack.top(); // returns 4

stack.isEmpty(); // returns false

### Example 2

Input:

["QueueStack", "isEmpty"]

[[]]

Output:[null, true]

Explanation:

&nbsp;QueueStack stack = new QueueStack();

stack.isEmpty(); // returns true

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
