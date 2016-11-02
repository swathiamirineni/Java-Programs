import java.util.*;
class strrevsb
{
public static void main(String[] arg)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
StringBuffer str=new StringBuffer(s.next());
StringBuffer str1=new StringBuffer(str);
str.reverse();
if(str.toString().equals(str1.toString()))
System.out.println("string is pallindrom");
else 
System.out.println("String is not Pallindrom");
}
}