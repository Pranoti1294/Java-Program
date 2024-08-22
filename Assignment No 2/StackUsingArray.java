public class StackUsingArray {
    private int maxSize;
    private int top;
    private int[] stack;

    public StackUsingArray(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
