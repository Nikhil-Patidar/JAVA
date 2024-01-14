import java.util.Scanner;
class Add
{
public static void main(String x[])
{
int a;
int b;
Scanner Sc=new Scanner(System.in);
a=Sc.nextInt();
b=Sc.nextInt();
a=a+b;
b=a-b;
a=a-b;

System.out.println("a = "+a+"\nb = "+b);
}
}