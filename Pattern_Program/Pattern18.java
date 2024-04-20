public class Pattern18 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            int num = rows;
            for (int j = i; j <=rows; j++) {
                
                System.out.print(num);
                num--;
            }
            System.out.println();
        }
    }
}
