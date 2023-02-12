public class pattern5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j>=3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                    
                }
            }System.out.println();
        }
    }
}
// for vertical line i==3 or 4 or any co-ordinate
// for horizontal line j=any co-ordinate
//to print above vertical line i>=any co-ordinate or vice versa 