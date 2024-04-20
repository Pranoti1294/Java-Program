public class Pattern20_2 {
    public static void main(String[] args) {
        int rows = 7, spaces = 0;

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = i; k <= 7; k++) {
                System.out.print(k);
            }

            System.out.println();
            spaces += 1;
        }

        spaces = (rows - 2) ;
        for (int i = rows - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = i; k <= 7; k++) {
                System.out.print(k);
            }

            System.out.println();
            spaces -= 1;
        }
    }

}
