public class pellSeries {
    public static void main(String[] args) {
        int a=0, b=1, sum=0;
        System.out.println("0"+'\n'+"1");
        for (int i = 0; i < 13; i++) {
            
            sum=a+b*2;
            System.out.println(sum);
            a=b;
            b=sum;
            
        }
    }
}
