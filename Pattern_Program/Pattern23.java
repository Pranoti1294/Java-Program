public class Pattern23 {
    public static void main(String[] args) {
        int rows = 7;

        for (int i = 1; i <= rows; i++) {
           
            for (int j =1; j <= rows; j++) {
                if((i+j)%2==0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
}
