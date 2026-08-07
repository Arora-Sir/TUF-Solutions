// Queue used to simulate stack behavior
// Queue: add, poll, peek, isEmpty
// Stack: push, pop, top, isEmpty
class QueueStack {

  // Queue<Integer> queue = new LinkedList<>(); //Also fine
  Queue<Integer> queue = new ArrayDeque<>(); //Queue is a Interface & ArrayDequeue is a Class

  public void push(int x) {
    int size = queue.size();
    queue.add(x);

    // Moving all previous elements behind the new element
    for (int i = 0; i < size; i++) {
      queue.add(queue.poll());
    }
  }

  public int pop() {
    int topElement = queue.peek();
    queue.poll();
    return topElement;
  }

  public int top() {
    return queue.peek();
  }

  public boolean isEmpty() {
    return queue.isEmpty();
  }
}
