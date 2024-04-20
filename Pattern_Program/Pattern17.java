public class Pattern17 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print numbers in decreasing order
            for (int j = i; j >= 1; j--) {
                
                System.out.print("*");
                
            }
            System.out.println();
        }
        for (int i = rows-1; i >= 1; i--) {
            // Print numbers in decreasing order
            for (int j = i; j >= 1; j--) {
                
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}
