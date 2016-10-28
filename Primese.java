import java.util.*;
class Primese
{
public static void main(String[] args)
{
int j;
int count=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the value");
int n=s.nextInt();
for(int i=2;i<n;i++)
{
count=0;
for(j=2;j<i;j++)
{
if(i%j==0)
count=1;
}
if(count==0)
System.out.println(i);
}
}
}


