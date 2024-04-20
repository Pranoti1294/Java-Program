import java.util.PriorityQueue;

public class RemoveEleInPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> a = new PriorityQueue<>();

        a.offer(30);
        a.offer(40);
        a.offer(20);
        a.offer(10);
        a.offer(60);
        a.offer(20);
        a.offer(90);

        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}
