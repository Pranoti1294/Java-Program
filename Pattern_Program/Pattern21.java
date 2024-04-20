public class Pattern21 {
    public static void main(String[] args) {
        int rows = 7;

        for (int i = rows; i >= 1; i--) {
            int num = rows;
            for (int j = i; j <=rows; j++) {
                if(num % 2 == 1)
                    System.out.print("1");
                else
                    System.out.print("0");
                num--;
            }
            System.out.println();
        }
    }
}
