import java.util.*;
class EvenOddSe
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Number ");
int n=s.nextInt();
System.out.println("The even numbers in below"+n);
for(int i=0;i<=n;i++)
{
if(i%2==0)
System.out.println(i);
}
System.out.println("The odd numbers in below"+n);
for(int i=0;i<=n;i++)
{
if(i%2!=0)
System.out.println(i);
}
}
}

