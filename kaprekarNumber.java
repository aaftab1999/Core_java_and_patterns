public class kaprekarNumber {
    public static void main(String[] args) {
        int num=9,sq=num*num, tempNum=num, digitCnt=0;
        while (tempNum>0) {
            digitCnt++;
            tempNum/=10;
}
        int div=(int)Math.pow(10, digitCnt);
        int fpart=sq/div;
        int spart=sq%div;
        if ((fpart+spart)==num) {
            System.out.println("kaprekar number");
            
        } else {
            System.out.println("not a kaprekar number");
            
        }
    }
}
