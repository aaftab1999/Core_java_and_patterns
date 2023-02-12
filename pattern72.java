public class pattern72 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (j+i>=4 && j<=4) {
                    System.out.print(j+i-3);//forward tilted and increasing
                    
                } else if(j-i<=4 && j>=5){
                    System.out.print(5-j+i);  //backaward tilted and decreasing
                    
                }
                else
                System.out.print(" ");
                
            }
            System.out.println();
            
        }
    }
    
}

