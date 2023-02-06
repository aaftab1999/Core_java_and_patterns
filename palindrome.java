public class palindrome {
    public static void main(String[] args) {
        int num=373, originalNum=num, num2=0;
        while (num>0) {
            int lastdigit=num%10;
            num2=num2*10 + lastdigit;
            num=num/10;
            
        }

        if (originalNum==num2) {
            System.out.println("palindrome number");

            
        } else {
            System.out.println("not a palindrome number");
        }
    }
}
