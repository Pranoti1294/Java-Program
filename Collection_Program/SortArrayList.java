import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    
    public static void main(String[] args) {
        ArrayList<String> a = addColors();
        sortArrayList(a);
        display(a);
    }
    
    private static void sortArrayList(ArrayList<String> a) {
        Collections.sort(a);
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
