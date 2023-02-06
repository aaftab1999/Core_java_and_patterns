public class endingWithSpecificNumber {
    public static void main(String[] args) {
        int start=100, end=200, endingElement=7;
        for (int i = start; i < end; i++) {
            if (i%10==endingElement) {
                System.out.println(i);
                
            }
            
        }
    }
}
