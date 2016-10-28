import java.util.*;
class Factmeth
{
int fact(int n)
{
int res;

if(n==1)
return 1;

res=fact(n-1)*n;
return res;
}
}
class Factorial
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int k=s.nextInt();
Factmeth me=new Factmeth();
int a=me.fact(k);
System.out.println("the factorial of the given number is"+a);
}
} 