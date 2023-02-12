public class patternself {
    public static void main(String[] args) {
        int irange=10, jrange=9;
        myCode(irange,jrange);
    }
    private static void myCode( int irange, int jrange) {
        for (int i = 0; i < irange; i++) {
            for (int j = 0; j <5; j++) {
                if (j-i<=-1 && j+i<=9) {
                    System.out.print("*");
                    
                } else {System.out.print(" ");
                    
                    }}
                for (int j2 =5; j2 <9 ; j2++) {
                    if (j2+i>=9 && j2-i>=-1) {
                        System.out.print("*");
                        
                    } else {
                        System.out.print(" ");
                    }
                    
                }
                
            
            System.out.println();
        }
        
    }
}
