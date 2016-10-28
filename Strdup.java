import java.util.*;
class Strdup
{
public static void main(String[] args)
{
String st2="";
Scanner s=new Scanner(System.in);
System.out.println("enter String");
String st=s.nextLine();
System.out.println("enter value");
int n=s.nextInt();
st2=st.substring(n);
System.out.println(st2);
}
}
