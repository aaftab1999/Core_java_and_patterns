public class capitalsmall {
    public static void main(String[] args) {
        char ch='&';

        if (ch>='A' && ch<='Z') {
            System.out.println("Capital");
        } else if (ch>='a' && ch<='z') {
            System.out.println("small");
            
        }
        else{
            System.out.println("something else");
        }
    }
}
