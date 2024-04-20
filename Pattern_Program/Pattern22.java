public class Pattern22 {
    public static void main(String[] args) {
        int rows = 7;

        for (int i = 1; i <= rows; i++) {
            // Print 1s
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("1");
            }
            
            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            
            System.out.println();
        }
    }
}
