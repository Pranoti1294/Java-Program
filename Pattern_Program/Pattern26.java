    public class Pattern26 {
        public static void main(String[] args) {
            int rows = 5;
            int num = 1;
    
            for (int i = 1; i <= rows; i++) {
                int temp = num;
                // Print numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print(temp + " ");
                    temp += rows - j;
                }
                System.out.println();
                num++;
            }
        }
    }
    

