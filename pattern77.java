public class pattern77 {
    public static void main(String[] args) {
        int count=1;
        for (int i = 0; i < 5; i++) {
            int diff=4;
            int count2=count;
            for (int j = 0; j < 5; j++) {
                if (j-i<=0) {
                    System.out.print((count2)+" ");
                             }
                    
                 else {
                    System.out.print(" ");}
                    count2=count2+diff;
                    diff--;
                    
                
                
            }
            count++;
            System.out.println();
            
        }
    }
}
