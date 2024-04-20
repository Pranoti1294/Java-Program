public class Pattern11 {
    
    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i > 0; i--) 
        {
            for (int j = 1; j <= i; j++) 
            {
                
                System.out.print((char)(j+64));
               
            }
            System.out.println();
        }
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = i; j >= 1; j--) {
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
    }
    
    
    
}
