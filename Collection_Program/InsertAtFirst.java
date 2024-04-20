import java.util.ArrayList;

public class InsertAtFirst {
    public static void main(String[] args) {
        ArrayList<String> a = addColors();
        display(a);
    }

    private static void display(ArrayList<String> a) 
    {
        for(String e : a)
        {
         System.out.println(e);
        }
     }
     static ArrayList<String> addColors() 
     {
         ArrayList<String> a = new ArrayList<>();
         a.add(0,"Blue");
         
         a.add(0,"Purple");
         a.add(0,"Red");
         a.add(0,"green");
         a.add(0,"orange");
         a.add(0,"pink");
         return a;
     }
}
