//Prime number or not
import java.util.*;
class Prime
{
public static void main(String[] args)
{
int count=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the value");
int n=s.nextInt();
for(int i=2;i<=n;i++)
{
if(n%i==0)
count++;
}
if(count==1)
System.out.println("prime");
else
System.out.println("not prime");
}
}