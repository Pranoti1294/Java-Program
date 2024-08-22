public class MissingNumber {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int total = n * (n + 1) / 2;
        for (int num : arr) {
            total -= num;
        }
        return total;
    }
}
