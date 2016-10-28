//Fibonacci
import java.util.*;
class Fib
{
public static void main(String[] args)
{
int fir=0,sec=1,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
System.out.println(fir);

for(int i=0;i<=n;i++)
{
sum=fir+sec;
System.out.println(sum);
sec=fir;
fir=sum;

/*System.out.println(sum);*/
}
}
}
 