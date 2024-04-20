import java.util.ArrayList;

public class ArrayListColor
{
    public static void main(String[] args) {
        ArrayList<String> a = addColors();
        display(a);
    }
    private static void display(ArrayList<String> a) {
       for(String e : a)
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