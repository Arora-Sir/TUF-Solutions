class ArrayQueue {
  private int[] arr;
  private int start, end;
  private int currSize;
  private final int maxSize;

  private ArrayQueue(int size) {
    arr = new int[size];
    start = -1;
    end = -1;
    currSize = 0;
    maxSize = size;
  }

  public ArrayQueue() {
    this(10);
  }

  public void push(int x) {
    if (currSize == maxSize) {
      // System.out.println("Queue is full");
      // System.exit(1);
      throw new IllegalStateException("Queue is full");
    }

    if (isEmpty()) {
      start = 0;
    }

    end = (end + 1) % maxSize;
    arr[end] = x;
    currSize++;
  }

  public int pop() {
    if (isEmpty()) {
      // System.out.println("Queue is Empty");
      throw new IllegalStateException("Queue is empty");
    }
    int popped = arr[start];

    if (currSize == 1) {
      start = -1;
      end = -1;
    } else {
      start = (start + 1) % maxSize;
    }

    currSize--;
    return popped;
  }

  public int peek() {
    if (isEmpty()) {
      //   System.out.println("Queue is Empty");
      //   System.exit(1);
      throw new IllegalStateException("Queue is Empty");
    }
    return arr[start];
  }

  public boolean isEmpty() {
    return (currSize == 0);
  }
}
