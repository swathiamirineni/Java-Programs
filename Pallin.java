// Pallindrom number
import java.util.*;
class Pallin
{
public static void main(String[] args)
{
int sum=0;
int p;
int m;
Scanner s=new Scanner(System.in);
System.out.print("enter value");
int n=s.nextInt();
m=n;
while(n!=0)
{
p=n%10;//get remainder of the number
sum=sum*10+p;
n=n/10;
}
System.out.println(sum);
if(sum==m)
System.out.println("given number is Pallindrom");
else
System.out.println("given number is not Pallindrom");
}
}