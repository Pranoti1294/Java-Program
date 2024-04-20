
        public class Pattern5 
        {
        public static void main(String[] args) {
            int rows = 4;
    
            // Upper triangle
            for (int i = 1; i <= rows; i++) {
                // Print spaces
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
                // Print decreasing numbers
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
                // Print increasing numbers
                for (int j = 2; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
    
            // Lower triangle
            for (int i = rows - 1; i >= 1; i--) {
                // Print spaces
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
                // Print decreasing numbers
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
                // Print increasing numbers
                for (int j = 2; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
    

