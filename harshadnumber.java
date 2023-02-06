public class harshadnumber {
    public static void main(String[] args) {
        int num=200, store=0, original=num;
        while (num>0) {
            int num2=num%10;
            store=store+num2;
            num/=10;  
        }
        if (original%store==0) {
            System.out.println("harshad number");

            
        } else {
            System.out.println("not a harshad number");
        }
    }
}
