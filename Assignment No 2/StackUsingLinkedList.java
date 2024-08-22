class StackNode {
    int data;
    StackNode next;

    public StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackUsingLinkedList {
    private StackNode top;

    public StackUsingLinkedList() {
        this.top = null;
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int popped = top.data;
            top = top.next;
            return popped;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }
}
