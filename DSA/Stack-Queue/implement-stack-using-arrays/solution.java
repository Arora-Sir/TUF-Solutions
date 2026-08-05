class ArrayStack {
    private int[] stackArray;
    private int capacity;
    private int topIndex;

    public ArrayStack(int size) {
        capacity = size;
        stackArray = new int[capacity];
        topIndex =-1;
    }

    public ArrayStack() {
        this(1000);
    }

    public void push(int x) {
        if(topIndex>=capacity-1){ 
            System.out.println("StackOverflow");
            return;
        }
        stackArray[++topIndex] = x;
    }

    public int pop() {
        if(isEmpty()) return -1;
        return stackArray[topIndex--];
    }

    public int top() {
        if(isEmpty()) return -1;
        return stackArray[topIndex];
    }

    public boolean isEmpty() {
        return (topIndex==-1);
    }
}
