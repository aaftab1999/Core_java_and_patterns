public class primenumber {
    public static void main(String[] args) {
        int num=1;
        boolean isDivisible=false;
        for (int i = 2; i<num; i++) {
            if (num%i==0) {
                isDivisible=true;
                System.out.println(num);
                //break;
                
            }
            
        }
if (isDivisible) 
    System.out.println("not a prime number");
    else 

    System.out.println("prime number");
    

    }
    
}
