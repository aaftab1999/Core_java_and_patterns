import java.util.Scanner;

public class correspondingdayofweek {
    public static void main(String[] args) {
        try (Scanner sc= new Scanner(System.in)) {
            System.out.println("Enter num");
      int num=sc.nextInt();
            if (num==0) {
                System.out.println("sunday");
            } else if (num==1) {
                System.out.println("MOnday");
                
            }
            else if (num==2) {
                System.out.println("tuesday");
                
            }
            else if (num==3) {
                System.out.println("wednesday");
                
            }
             else if (num==4) {
                System.out.println("thursday");
                
            }
             else if (num==5) {
                System.out.println("friday");
                
            }
             else if (num==6) {
                System.out.println("saturday");
                
            }
            else{
                System.out.println("invalid number");
            }
        }
            
        
    }
}
