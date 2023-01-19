public class addingdigits {
    public static void main(String[] args) {
        int num=343, sum=0;  //don't use 0 first it will be taken as octal number
        while (num>0) {
            int lastdigit=num%10;
            sum=sum+ lastdigit;
            num=num/10;
            
        }
        System.out.println(sum);
    }
}
/*
 * int num=32383, sum=0;
 * while(num>0)
 * {
 * int lastdigit=num%10;
 * sum=sum+lastdigit;
 * num/=10;
 * }
 * System.out.println(sum);
 * 
 * 
 * 
 */