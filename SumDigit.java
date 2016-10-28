// sum of digits in the given numbers
import java.util.*;
class SumDigit
{
public static void main(String[] args)
{
int sum=0;
int p;
int m;
Scanner s=new Scanner(System.in);
System.out.print("enter value");
int n=s.nextInt();
while(n!=0)
{
p=n%10;//get remainder of the number
sum=sum+p;
n=n/10;
}
System.out.println(sum);
}
}

