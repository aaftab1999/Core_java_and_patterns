public class patternNumber3 {
    public static void main(String[] args) {
        int count=1;
        for (int i = 0; i < 5; i++) {
            int count2=count;
            for (int j = 0; j <5; j++) {
                if (j+i<=4) {
                    System.out.print(count2);
                    count2++;
                } else {System.out.print(" ");
                    
                    
                    
                }
                
            }
           count++;
           System.out.println(); 
        }
    }
}
