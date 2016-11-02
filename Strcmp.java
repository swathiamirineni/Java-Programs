import java.util.*;
class Strcmp
{
public static void main(String[] args)
{
int count=0,val;
Scanner s=new Scanner(System.in);
System.out.println("enter string");
String st=s.nextLine();
String[] st1=st.split("\\s");
System.out.println("enter the word");
String st2=s.next();
for(int i=0;i<st1.length;i++)
{
 if(st1[i].equals(st2))
count++;
}
System.out.println(count);

}
}