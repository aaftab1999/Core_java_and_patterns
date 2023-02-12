public class pattern71 {
public static void main(String[] args) {
    int mid=0; 
    for (int i = 0; i < 9; i=i+2) {
    int cnt=1;
        for (int j = 0; j <9; j++) {
            if (j-i<=0) {
                if (j<mid) {
                    System.out.print(cnt++);

                    
                } else {
                    System.out.print(cnt--);
                    
                }
                
            } else {
                System.out.print(" ");
                
            }
            
        }
        mid++;
        System.out.println();

        
    }
}
}
