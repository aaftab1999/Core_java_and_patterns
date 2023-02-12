public class pattern112 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <7; j++) {
                if ((j-i==-1) || (j+i==7) ||(i==0 && j>=1 && j<=2)||(i==0 && j>=4 && j<=5) ||(j==3 && i>=1 && i<=1)) {
                    System.out.print("*");
                    
                } else {
                    System.out.print(" ");
                    
                }
                
            }
            System.out.println();
            
        }
    }
}
