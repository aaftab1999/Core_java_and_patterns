public class pattern73 {
    public static void main(String[] args) {
        int mid=0;
        for (int i = 0; i < 9; i=i+2) {
            char ch1='A';
            for (int j = 0; j <9; j++) {
                if (j-i<=0) {
                    if (j<mid) {
                        System.out.print(ch1++);
                        
                    } else {
                        System.out.print(ch1--);
                        
                    }
                    
                } else {
                    System.out.print(" ");
                    
                }


                
            }
            System.out.println();
            mid++;
            
        }
    }
    
}
