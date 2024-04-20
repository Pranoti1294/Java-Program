import java.util.HashSet;

public class HashSetToArray {
    public static void main(String[] args) {
        HashSet<Integer> a = addData();
        display(a);
        convertToArray(a);
    }
   
    private static void convertToArray(HashSet<Integer> a) {
        Integer[] s = new Integer[a.size()];
        a.toArray(s);
       
        for (Integer element : s) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void display(HashSet<Integer> a) {
        for (Integer e : a) {
            System.out.print(" " + e);
        }
        System.out.println();
    }
    
    static HashSet<Integer> addData() {
        HashSet<Integer> a = new HashSet<>();
        a.add(10);
        a.add(60);
        a.add(70);
        a.add(20);
        a.add(50);
        a.add(50);
        a.add(70);
        return a;
    }      
}
