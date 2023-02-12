public class patterHeart {
    public static void main(String[] args) {
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j <18; j++) {
                if( (j+i>=3 && j-i<=5 && i<=3) || (j+i>=12 && j-i<=14 && i<=3) || (j-i>=-4 && j+i<=20 && i>=3))
                                 {System.out.print("@");
                    
                } else {
                    System.out.print("'");
                    
                }
                
            }System.out.println();
            
        }
    }
}
