public class pattern11 {
    public static void main(String[] args) {
        for (int i = 0; i <9; i++) {
            for (int j = 0; j <12; j++) {
                if ((j-i>=0 && j-i<=3 ) || (j+i>=8 && j+i<=11 ))
        //((j-i>=0 && j-i<=3 && i<=4) || (j+i>=8 && j+i<=11 && i>4))
                System.out.print("*");
                else
                System.out.print(" ");
                
            }
            System.out.println();
            
        }
    }
}
