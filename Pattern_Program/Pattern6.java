
    public class Pattern6 {
        public static void main(String[] args) {
            int rows = 5;
    
            for (int i = 1; i <= rows; i++) {
                // Print numbers in decreasing order
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }

