import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int data) {
        q2.add(data);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return q1.remove();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
}
