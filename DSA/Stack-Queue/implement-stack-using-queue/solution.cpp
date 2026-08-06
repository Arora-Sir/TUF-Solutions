class QueueStack {
    // Queue
    queue<int> q;

public:
    QueueStack() {
    }

    // Method to push element in the stack
    void push(int x) {
        // Get size 
        int s = q.size(); 
        // Add element
        q.push(x); 

        // Move elements before new element to back
        for (int i = 0; i < s; i++) {
            q.push(q.front()); 
            q.pop(); 
        }
    }

    // Method to pop element from stack
    int pop() {
        // Get front element 
        int n = q.front(); 
        // Remove front element
        q.pop(); 
        // Return removed element
        return n; 
    }

    // Method to return the top of stack
    int top() {
        // Return front element
        return q.front(); 
    }

    // Method to check if the stack is empty
    bool isEmpty() {
        return q.empty(); 
    }
};