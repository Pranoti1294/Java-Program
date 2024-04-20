import java.util.LinkedList;
import java.util.List;

public class AddElementAtEndLL {
    public static void main(String[] args) 
    {
        List<Integer> a = addData();

        display(a);
        addElementAtEnd(a,70);
        display(a);
    }
    private static void addElementAtEnd(List<Integer> a, int num) {
       a.add(a.size(), num);
    }
    private static void display(List<Integer> a) 
    {
        for (Integer e : a) {
            
            System.out.print(e+" ");
        }
        System.out.println();
    }
    
    static List<Integer> addData() {
         List<Integer> a = new LinkedList<>();
         a.add(10);
         a.add(60);
         a.add(40);
         a.add(20);
         a.add(80);
         a.add(50);
         a.add(70);
         return a;
    }
}
