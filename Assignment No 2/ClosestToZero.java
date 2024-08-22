import java.util.Arrays;

public class ClosestToZero {
    public static void findPair(int[] arr) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        int minSum = Integer.MAX_VALUE;
        int pairLeft = left, pairRight = right;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                pairLeft = left;
                pairRight = right;
            }
            if (sum < 0) left++;
            else right--;
        }
        System.out.println("Pair closest to zero: " + arr[pairLeft] + " and " + arr[pairRight]);
    }
}
