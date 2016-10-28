import java.util.*;
class Strrev
{
public static void main(String[] args)
{
String rev="";
Scanner s=new Scanner(System.in);
System.out.println("enter String");
String st=s.next();
int len=st.length();
for(int i=len-1;i>=0;i--)
{
rev+=st.charAt(i);
/*System.out.println(rev);*/
}
if(rev.equals(st))
System.out.println("pallindrom");
else 
System.out.println("not pallindron");
}
}