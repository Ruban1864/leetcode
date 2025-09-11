class MyQueue {
    private int[] stack;
    private int front;
    private int back;
    private int size;
    private int capacity;

    public MyQueue() {
        capacity = 10;
        stack = new int[capacity];
        front = 0;   // Start at 0 instead of -1
        back = -1;   // Back starts at -1 because no elements yet
        size = 0;
    }

    public void push(int x) {
        if (size == capacity) {
            throw new RuntimeException("Queue is full");
        }
        back = (back + 1) % capacity; // move back
        stack[back] = x;
        size++;
    }

    public int pop() {
        if (empty()) return -1;
        int val = stack[front];
        front = (front + 1) % capacity; // move front
        size--;
        return val;
    }

    public int peek() {
        if (empty()) return -1;
        return stack[front];
    }

    public boolean empty() {
        return size == 0;
    }
}
