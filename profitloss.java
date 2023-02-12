public class profitloss {
    public static void main(String[] args) {
        int buyamt=10000, sellamt=20000;
        if (buyamt<sellamt) {
            System.out.println("profit by "+(sellamt-buyamt));
            
        } else if (buyamt>sellamt) {
            System.out.println("loss by "+(buyamt-sellamt));
            
        }
        else{
            System.out.println("no profit no loss");
            
        }
    }
}
