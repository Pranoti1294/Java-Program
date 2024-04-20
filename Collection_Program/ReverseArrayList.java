import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> a = addColors();
        reverseArrayList(a);
        display(a);
    }
    
    private static void reverseArrayList(ArrayList<String> a) {
        Collections.reverse(a);
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
