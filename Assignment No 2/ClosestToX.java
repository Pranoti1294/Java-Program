import java.util.Arrays;

public class ClosestToX {
    public static void findPair(int[] arr, int x) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        int minDiff = Integer.MAX_VALUE;
        int pairLeft = left, pairRight = right;

        while (left < right) {
            int sum = arr[left] + arr[right];
            int diff = Math.abs(sum - x);
            if (diff < minDiff) {
                minDiff = diff;
                pairLeft = left;
                pairRight = right;
            }
            if (sum < x) left++;
            else right--;
        }
        System.out.println("Pair closest to " + x + ": " + arr[pairLeft] + " and " + arr[pairRight]);
    }
}
