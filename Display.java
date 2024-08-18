public import java.util.Scanner;
class Display{
 public static void main(String a[]){
int x;
float y;
double z;
String s;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of int type");
x=sc.nextInt();
System.out.println("Enter the value of float type");
y=sc.nextFloat();
System.out.println("Enter the value of double type");
z=sc.nextDouble();
System.out.println("Enter the value of string type");
s=sc.next();
System.out.println("Show the all value \n"+x);
System.out.println(y);
System.out.println(z);
System.out.println(s);
}
}/
