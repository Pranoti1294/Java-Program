import java.util.Arrays;

public class MinimumPlatforms {
    public static int findPlatforms(int[] arr, int[] dep) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platforms = 1, result = 1;
        int i = 1, j = 0;

        while (i < arr.length && j < dep.length) {
            if (arr[i] <= dep[j]) {
                platforms++;
                i++;
            } else {
                platforms--;
                j++;
            }
            result = Math.max(result, platforms);
        }
        return result;
    }
}
