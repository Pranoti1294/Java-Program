import java.util.LinkedList;
import java.util.List;

public class DisplayEleWithPosLL {
    public static void main(String[] args) 
    {
        List<Integer> a = addData();
        
        displayWithPos(a);
    }
    
    private static void displayWithPos(List<Integer> a) 
    {
        for (Integer e : a) {
            int pos = a.indexOf(e)+1;
            System.out.println(pos+" "+e);
        }
        
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
