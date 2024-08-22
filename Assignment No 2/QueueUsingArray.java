public class QueueUsingArray {
    private int front, rear, size, capacity;
    private int[] queue;

    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        front = size = 0;
        rear = capacity - 1;
        queue = new int[this.capacity];
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }
}
