public class fibonacciSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println("0"+'\n'+"1");

        for (int i = 0; i <15; i++) {
            int sum=a+b;
            System.out.println(sum+" ");
            a=b;
            b=sum;
            
        }
    }
}
