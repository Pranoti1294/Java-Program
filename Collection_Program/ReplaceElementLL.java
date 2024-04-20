import java.util.LinkedList;
import java.util.List;

public class ReplaceElementLL 
{
    public static void main(String[] args) 
    {
        List<Integer> a = addData();
        display(a);
        replaceElementLL(a,10,90);
        display(a);
    }
    
    

    private static void replaceElementLL(List<Integer> a, int ele, int r) {
       
       
            int pos = a.indexOf(ele);
            a.set(pos, r);
        
    }



    private static void display(List<Integer> a) 
    {
        for (Integer e : a) {
            
            System.out.print(" "+e);
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
