import java.util.TreeSet;

public class NumberLessThan7TreeSet {

    public static void main(String[] args) {
        TreeSet<Integer> a = new TreeSet<>();
        a.add(1);
        a.add(4);
        a.add(7);
        a.add(2);
        a.add(6);
        a.add(5);
        a.add(7);

        TreeSet<Integer> a7 = new TreeSet<>();
        for(Integer e : a)
        {
            if(e < 7)
            {
                a7.add(e);
            }
        }
        System.out.println(a7);
    }
    
}
