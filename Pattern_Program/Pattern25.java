public class Pattern25 {
    public static void main(String[] args) {
        int rows = 7;
        int num = 1;

        for (int i = 1; i <= rows; i++) {
            // Print numbers
            for (int j = 1; j <= rows; j++) {
                System.out.print(num );
                num = num % rows + 1;
            }
            System.out.println();
            num = i + 1;
        }
    }
}
