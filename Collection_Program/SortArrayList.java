import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayList {
    
    public static void main(String[] args) {
        ArrayList<String> a = addColors();
        SortArrayList(a);
        display(a);
    }
    private static void SortArrayList(ArrayList<String> a) {
        
       Collections.sort(a);
    }
    private static void display(ArrayList<String> a) 
    {
        for(String e: a)
        {
            System.out.println(e);
        }
    }
    static ArrayList<String> addColors() 
    {
         ArrayList<String> a = new ArrayList<>();
         a.add("Blue");
         a.add("Purple");
         a.add("Red");
         a.add("green");
         a.add("orange");
         a.add("pink");
         return a;
    }
}
