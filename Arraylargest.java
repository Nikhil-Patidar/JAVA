import java.util.Scanner;
class Show{
public static void main (String x[])
{ 
int t,j,n;
System.out.println("Enter the array size : ");
Scanner Sc=new Scanner(System.in);
n=Sc.nextInt();
 int a[]=new int [n];
System.out.println("Enter the array elements : ");
  

      
 for(int i=0;i<=n-1;i++)
{
  a[i]=Sc.nextInt();
}
 for(int i=0;i<=n-1;i++)
{
for(j=i+1;i<=n-1;i++)
{
 if(a[i]>a[j])
{
  t=a[i];
a[i]=a[j];
a[j]=t;
}
 
}
 System.out.print("the largest number is : "+a[j]);
}
}
}