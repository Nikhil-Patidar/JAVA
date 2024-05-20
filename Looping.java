import java.util.Scanner;
class Looping
{
public static void main(String a[])
{
 int n,i,sum=0;
Scanner Sc=new Scanner(System.in);
    n=Sc.nextInt();
for(i=1;i<=n;i++)
  {
    sum=sum+i;
  }
System.out.println("The sum of "+n+" numbers : "+sum);
}
}//
