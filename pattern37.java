public class pattern37 {
    public static void main(String[] args) {
        int count=1;
        for (int i = 0; i < 6; i++) {
           int count2=count;
            for (int j = 0; j < 6; j++) {
                if (j-i<=0) {
                    System.out.print((char)(count2 +64)+" ");
                    
                } else {
                    System.out.print(" ");}
                    count2=count2+5;
                    
                
                
            }
            count++;
            System.out.println();
            
        }
    }
}
