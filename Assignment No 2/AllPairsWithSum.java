import java.util.HashSet;

public class AllPairsWithSum {
    public static void findPairs(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int target = sum - num;
            if (set.contains(target)) {
                System.out.println("Pair: (" + num + ", " + target + ")");
            }
            set.add(num);
        }
    }
}
