public class pattern60 {
    public static void main(String[] args) {
        int count=1, count3=4;
        for (int i = 0; i < 9; i++) {
            int count2=count, count4=count3;
            for (int j = 0; j < 5; j++) {
                if (j-i>=0 ||  j+i>=8) {
                    if (i<=4) {
                        System.out.print(count2++ +" ");
                        
                    } else {
                        System.out.print(count4++ +" ");
                        
                    }
                } else {
                    System.out.print(" ");
                    
                }
                
            }
            count++;
            if(i>4)
            count3--;
            System.out.println();
            
        }
    }
}
