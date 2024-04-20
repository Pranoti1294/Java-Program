public class Pattern12 {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" "); // Add space for formatting
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(j+65) + " ");
                
            }
            System.out.println();
        }
    }
}
