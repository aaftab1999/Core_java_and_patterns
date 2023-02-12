public class pattern25 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (j+i>=4 && j-i<=4) {
                    if ((i+j)%2==0) {
                        System.out.print("*");
                        
                    } else {
                        System.out.print("-");
                        
                    }

                    
                } else {
                    System.out.print("-");
                    
                }
                
            }
            System.out.println();
            
        }
    }
}
