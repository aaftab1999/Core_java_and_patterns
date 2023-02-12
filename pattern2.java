public class pattern2 {
    public static void main(String[] args) {
       
 char ch='9';
	   for (int i = 0; i < 10; i++) {
		   char ch2=ch;
            for(int j=0; j<5;j++)
            {
if (j+i>=4 && j-i>=-4)    { System.out.print(ch2+" ");
ch2=ch++;
}
 else 
    System.out.print(" ");
        }
 System.out.println(); 
 
        }
    }
}
