import java.util.*;
class Strspl
{
public static void main(String[] args)
{

Scanner s=new Scanner(System.in);
System.out.println("enter String");
String st=s.nextLine();
String st1[]=st.split("\\s");
for(int i=0;i<st1.length;i++)
{
if(i%2==0)
System.out.println(st1[i]);
}





}
}