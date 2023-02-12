public class pattern111 {
    public static void main(String[] args) {
       int cnt2=5;
        for (int i = 0; i < 5; i++) {
			int cnt=5;
            
            for (int j = 0; j < 5; j++) {
               if(j-i<=0)
				   System.out.print(cnt--);
			   else
				   System.out.print(cnt2);
				   
                
			}
            
        cnt2--;
            System.out.println();
            
            
        }
    }
}
