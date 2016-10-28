import java.util.*;
class Numbers
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("How many lines you want to print");
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
int j=1;
while(j<=i)
{
System.out.print( j );
j++;
}
System.out.println();
}
}
}


