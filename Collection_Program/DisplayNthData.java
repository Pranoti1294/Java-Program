import java.util.ArrayList;

public class DisplayNthData {
    public static void main(String[] args) {
        ArrayList<String> a = addColors();
        display(a);
    }
    private static void display(ArrayList<String> a) 
    {
        System.out.println(a.get(4));
        System.out.println(a.get(1));
        System.out.println(a.get(3));
        System.out.println(a.get(2));
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
