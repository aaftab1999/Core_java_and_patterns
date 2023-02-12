public class patternILY {
    public static void main(String[] args) {
        
    
    for (int i=0; i<13;++i){
        for (int j = 0; j <=29; j++) {
            if ( (i<1 && j<=4) || (j<=2 && j>=2 ) || (i<13 && j<=4 && i>=12)|| (j+i>=8 && j-i<=10 && i<=3 ) ||(j+i>=18 && j-i<=20 && i<=3)||(j-i>=2 && j+i<=26 && i>=3) ||(j<=25 && j>=25 && i<12) ||(j<=29 && j>=29 && i<12) || (i<13 && i>=12 && j>25 && j<29 )) {
                System.out.print("@");
                
            } else {
                System.out.print(" ");
                
            }}System.out.println();
            
        }
    }
}
