public class pattern6 {
    public static void main(String[] args) {
        for (int i = 0; i <9; i++) {
            for (int j = 0; j < 5; j++) {
                if (j+i<=8 && j-i<=0) {
                    System.out.print("*");
                    
                } else {System.out.print(" ");
                    
                }
            }
            System.out.println();
            
        }
      /*   // for (int i = 10; i < 20; i++) {
            for (int j =6; j <10; j++) {
                if (j+i>=20 && j-i>6) {
                    System.out.print("*");
                    
                } else {System.out.print(" ");
                    
                }
                
            }
            System.out.println();
        } */
    }
}
