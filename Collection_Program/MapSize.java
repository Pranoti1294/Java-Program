import java.util.HashMap;
import java.util.Map;

public class MapSize {
    public static void main(String[] args) {
        Map<Integer,String> a = new HashMap<>();

        a.put(10, "pranoti");
        a.put(20, "poonam");
        a.put(30, "nutan");
        a.put(40, "siya");
        a.put(50, "meena");
        a.put(60, "jiya");

        System.out.println("Map size : "+a.size());
    }
}
