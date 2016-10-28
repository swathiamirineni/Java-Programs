// Amstrong number
import java.util.*;
class Ams
{
public static void main(String[] args)
{
int sum=0;
int p;
int number;
Scanner s=new Scanner(System.in);
System.out.println("enter number of Digits");
int m=s.nextInt();
System.out.print("enter value");
int n=s.nextInt();
number=n;

while(n!=0)
{
p=n%10;//get remainder of the number
sum=sum+(int)Math.pow(p,m);
n=n/10;
}
System.out.println(sum);
if(sum==number)
System.out.println("given number is Amstrong");
else
System.out.println("given number is not Amstrong");
}
}

