import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoArrayList {
    public static void main(String[] args) {
        ArrayList<String> a = addColors();
        swap(a,2,4);
        display(a);
    }
    private static void swap(ArrayList<String> a, int i, int j) 
    {
        Collections.swap(a,i,j);
        
    }
   
    private static void display(ArrayList<String> a) {
        for (String color : a) {
            System.out.println(color);
        }
    }
    
    static ArrayList<String> addColors() {
         ArrayList<String> a = new ArrayList<>();
         a.add("Blue");
         a.add("Purple");
         a.add("Red");
         a.add("Green");
         a.add("Orange");
         a.add("Pink");
         return a;
    }
    
}
