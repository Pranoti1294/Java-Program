import java.util.ArrayList;

public class DisplayArrayListWithPosition {
    public static void main(String[] args) {
        ArrayList<String> a = addColors();
        
        displayWithIndex(a);
    }
    
    
    private static void displayWithIndex(ArrayList<String> a) {
        for (String color : a) {
            int pos = a.indexOf(color)+1;
            System.out.println(pos+" "+color);
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
