public class pattern72Diff {
    public static void main(String[] args) {
        int c=0;
        for (int i = 0; i < 5; i++) {
            c=1; 
            for (int j = 0; j < 9; j++) {
                if (j+i>=4 && j-i<=4) {
                    System.out.print(c);
                    if(j<4)
                    c++;
                    else
                    c--;
                    
                } else {
                    System.out.print(" ");
                    
                }
                
            }
            
            System.out.println();
        }
    }
}
