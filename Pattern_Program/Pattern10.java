public class Pattern10 {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 1; i <= rows; i++) {
            // Print numbers in decreasing order
            for (int j = i; j >= 1; j--) {
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
    }
}
