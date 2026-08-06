class QueueStack {
    // Queue
    Queue<Integer> q = new LinkedList<>();
    
    
    // Method to push element in the stack
    public void push(int x) {
        // Get size
        int s = q.size();
        // Add element
        q.add(x);

        // Move elements before new element to back
        for (int i = 0; i < s; i++) {
            q.add(q.poll());
        }
    }

    // Method to pop element from stack
    public int pop() {
        // Get front element
        int n = q.peek();
        // Remove front element
        q.poll();
        // Return removed element
        return n;
    }

    // Method to return the top of stack
    public int top() {
        // Return front element
        return q.peek();  

        
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return q.isEmpty();
    }
}