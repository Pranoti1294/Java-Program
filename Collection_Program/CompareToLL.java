import java.util.LinkedList;
import java.util.List;

public class CompareToLL {
    public static void main(String[] args) 
    {
        List<Integer> a1 = new LinkedList<Integer>();
        List<Integer> a2 = new LinkedList<Integer>();
        a1.add(10);
        a1.add(20);
        a1.add(30);

        a2.add(10);
        a2.add(30);
        a2.add(30);
        
        
        if(compare(a1,a2))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }

    private static boolean compare(List<Integer> a1, List<Integer> a2) 
    {
        for(int i=0; i<a1.size()-1;i++)
        {
            if(a1.get(i) != a2.get(i))
            {
                return false;
            }
        }
        return true;
    }

}
