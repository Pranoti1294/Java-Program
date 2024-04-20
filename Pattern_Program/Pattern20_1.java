public class Pattern20_1 {
    public static void main(String[] args) {
        int rows = 7;

        for (int i = rows; i >= 1; i--) {
            // Print 1s
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            
            System.out.println();
        }

        for (int i = 1; i <= rows; i++) {
            // Print 1s
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            
            System.out.println();
        }
    }
    
}
