public class Pattern15 {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = i; k <= rows; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}
