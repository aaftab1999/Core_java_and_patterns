public class swap
{
public static void main(String[] args)
{
int a=1, b=2;
System.out.println(a+"   "+b);




a=a+b;
b=a-b;
a=a-b;
System.out.println(a+"   "+b);

a=a*b;
b=a/b;
a=a/b;
System.out.println(a+"   "+b);


int c=b;
b=a;
a=c;
System.out.println(a+"   "+b);






//Eeuilateral triangle

int s=5;

double sqr3=Math.pow(3, 0.5);
//double sqr3=Math.sqrt(3);

double area=sqr3*s*s/4;

System.out.println(area);



//FAHRENHEIT TO CELCIUS

double C=37, f=32+(9*C/5); //capital C because c is already taken
System.out.println(f);

//celcius to fahrenheit

double Celcius=((f-32)*5)/9;
System.out.println(Celcius);


//compound interest

int p=1000, n=12, t=5;
double r=0.05;

double fpart=1+r/n;
int spart=n*t;

double A=p*Math.pow(fpart,spart);
System.out.println(A);

//ass n010
char ch='"';
System.out.println(ch+"HefShine"+ch);
System.out.println("hef\"shine");
System.out.println("hef\nshine");
}


}