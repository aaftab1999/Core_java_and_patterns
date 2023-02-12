/**
 * patternAFTAB
 */
public class patternAFTAB {

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <6; j++) {
                if ((j==0 && i>=1)||(j==4 &&  i>=1) || (i==0 && j>=1 && j<=3)|| (i==3 && j<=4)) 
                    System.out.print("*");
                    
                 else 
                    System.out.print(" ");
                    
            }
                for (int j2 = 0; j2 < 6; j2++) {
                    if ((j2==0)||(i==0 && j2<=4)||(i==3 && j2<=3)) {
                        System.out.print("*");
                        
                    } else {
                        System.out.print(" ");
                        
                    }
                    
                }
                for (int j3 = 0; j3 < 6; j3++) {
                    if ((i==0 && j3<=4 )||(j3==2)) {System.out.print("*");
                        
                    } else {
                        System.out.print(" ");
                        
                    }
                    
                }
                for (int j4 = 0; j4 < 6; j4++) {
                    if ((j4==0 && i>=1)||(j4==4 &&  i>=1) || (i==0 && j4>=1 && j4<=3)|| (i==3 && j4<=4)) {
                        System.out.print("*");
                        
                    } else {
                        System.out.print(" ");
                        
                    }
                    
                }
                for (int j5 = 0; j5 < 6; j5++) {
                    if ((j5==0)||(i==0 && j5<=3) ||(j5==4 &&((i>=1 && i<=2) || (i>=4 && i<=5))) || (i==6 && j5<=3) ||(i==3 && j5<=3)) {
                        System.out.print("*");
                        
                    } else {
                        System.out.print(" ");
                        
                    }
                    
                }

                
                System.out.println();
            }
            
        }
    }
