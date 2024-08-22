class QueueNode {
    int data;
    QueueNode next;

    public QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueUsingLinkedList {
    private QueueNode front, rear;

    public QueueUsingLinkedList() {
        this.front = this.rear = null;
    }

    public void enqueue(int data) {
        QueueNode newNode = new QueueNode(data);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
    }

    public int dequeue() {
        if (this.front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int item = this.front.data;
        this.front = this.front.next;
        if (this.front == null) this.rear = null;
        return item;
    }
}
