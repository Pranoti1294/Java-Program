import java.util.PriorityQueue;

public class ConvertPriorityQueueToArray {
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

        Integer []s = new Integer[a.size()];
        a.toArray(s);

        for(Integer e : s)
            System.out.print(e+" ");
    }
}
