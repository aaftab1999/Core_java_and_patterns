public class checkingtriangles {
    public static void main(String[] args) {
        int side1=23, side2=32, side3=43;
        if (side1==side2 && side2==side3){
            System.out.println("Equilateral");
            
        } else if (side1==side2 || side2==side3 ||side1==side3) {
            System.out.println("Isoceles");
            
        }else{System.out.println("Scalene");
            
        }
    }
}
