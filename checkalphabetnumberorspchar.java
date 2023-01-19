
public class checkalphabetnumberorspchar {
    public static void main(String[] args) {
        
        char ch='$';
        if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
            System.out.println("Its an Alphabet");
            
        } else if (ch<='0' && ch>='9') {
            System.out.println("Its a Number");
        }
        else{
            System.out.println("Special Character");
        }
    }
}
