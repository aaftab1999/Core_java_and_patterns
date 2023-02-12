public class pattern81 {
    public static void main(String[] args) {
        int count2=1;
        for (int i = 0; i < 5; i++) {
            int count=1, count3=count2;
            for (int j = 0; j < 10; j++) {
                if (j-i<=0 || j+i>=9) {
                    if (j<=4) {
                        System.out.print(count++);
                        
                    } else {
                        System.out.print(count3--);
                        
                    }
                    
                } else {
                    System.out.print(" ");
                    
                }
                
            }
            count2++;
            System.out.println();
            
        }
    }
}
