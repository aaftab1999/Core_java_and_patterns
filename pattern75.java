public class pattern75 {
    public static void main(String[] args) {
        for (int i = 2; i < 9; i=i+2) {
            for (int j = 0; j <9; j++) {
                if (j-i<=0) {
                    if (j*2==i) {
                        System.out.print(" ");
                        
                    } else {
                        System.out.print("*");
                        
                    }
                    
                } else {
                    System.err.print(" ");
                    
                }

                
            }
            System.out.println();
            
        }
    }
}
