public class backwarddigit {
    public static void main(String[] args) {
        int num=10000, num2=0;
        while (num>0) {
            int lastdigit=num%10;
            num2=num2*10+lastdigit;
            num=num/10;
            
        }
        System.out.println(num2);
    }
}
