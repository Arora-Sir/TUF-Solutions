# [Implement Stack using Arrays](https://takeuforward.org/plus/dsa/problems/implement-stack-using-arrays?subject=dsa&approach=optimal&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

Implement a Last-In-First-Out (LIFO) stack using an array. The implemented stack should support the following operations: push, pop, peek, and isEmpty.

You will be provided two arrays **operations** which contains what operation need to perform and **nums** which contains the values corresponding to the operations.

Implement the ArrayStack class:

void push(int x): Pushes element x onto the stack.

int pop(): Removes and returns the top element of the stack.

int top(): Returns the top element of the stack without removing it.

boolean isEmpty(): Returns true if the stack is empty, false otherwise.

<em style="color: rgb(245, 245, 245);">Please note that this section might seem a bit difficult without prior knowledge on what stacks is, we will soon try to add basics concepts for your ease! If you know the concepts already please go ahead to give a shot to the problem. Cheers!</em>

### Example 1

Input: operations = ["ArrayStack", "push", "push", "top", "pop", "isEmpty"]

nums = [[], [5], [10], [], [], []]

Output: [null, null, null, 10, 10, false]

Explanation:

ArrayStack stack = new ArrayStack();

stack.push(5);

stack.push(10);

stack.top(); // returns 10

stack.pop(); // returns 10

stack.isEmpty(); // returns false

### Example 2

Input: operations = ["ArrayStack","isEmpty", "push", "pop", "isEmpty"]

nums = [[], [], [1], [], []]

Output: [null, true, null, 1, true]

Explanation:&nbsp;

ArrayStack stack = new ArrayStack();

stack.push(1);

stack.pop(); // returns 1

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
