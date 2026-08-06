class ArrayQueue {
    int[] arr;
    int start, end;
    int currSize, maxSize;

    public ArrayQueue() {
        arr = new int[10];
        start = -1;
        end = -1;
        currSize = 0;
        maxSize = 10;
    }

    public void push(int x) {
        if (currSize == maxSize) {
            System.out.println("Queue is full \n Exiting...");
            System.exit(1);
        }

        if (end == -1) {
            start = 0;
            end = 0;
        } 
        else {
            end = (end + 1) % maxSize;
        }

        arr[end] = x;
        currSize++;
    }

    public int pop() {
        if (start == -1) {
            System.out.println("Queue Empty \n Exiting...");
            System.exit(1);
        }
        int popped = arr[start];

        if (currSize == 1) {
            start = -1;
            end = -1;
        } 
        else {
            start = (start + 1) % maxSize;
        }

        currSize--;
        return popped;
    }

    public int peek() {
        if (start == -1) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return arr[start]; 
    }

    public boolean isEmpty() {
        return (currSize == 0);
    }
}     //