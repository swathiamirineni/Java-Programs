import java.util.*;
import java.text.DateFormat;
class Manual 
{
//Scanner s=new Scanner(System.in);
void manualSet()
{
Date date=new Date();
System.out.println("The time now is");
DateFormat defaultDf = DateFormat.getDateTimeInstance();
System.out.println(defaultDf.format(date));
System.out.println("set the time and temperature");
System.out.println("enter time");
//Scanner s=new Scanner(System.in);
try
{
Scanner s=new Scanner(System.in);
System.out.println("enter second,enter minutes,enter hour");
int second=s.nextInt();
int minute=s.nextInt();
int hour=s.nextInt();
System.out.println("enter temperature");
int tem=s.nextInt();
System.out.println("the temperature is set for"+tem);
Calendar calendar1 = Calendar.getInstance();
       // calendar.setTime(date);
        calendar1.add(Calendar.SECOND, second);
        calendar1.add(Calendar.MINUTE, minute);
        calendar1.add(Calendar.HOUR, hour);
System.out.println("your dish is ready in this time");
System.out.println(calendar1.getTime());
check1(tem);
}
catch(Exception e)
{
System.out.println("Mismatch");
manualSet();
}
}
void check1(int tem){
int z=0;
Scanner s=new Scanner(System.in);
System.out.println("flame  indicators");
System.out.println("1.+ (<302)");
System.out.println("2.-");
System.out.println("3.no change");
System.out.println("choose choice");
int f=s.nextInt();
if(f==1||f==2||f==3)
{
if(f==1)
{
System.out.println("how much you want to increase");
int i=s.nextInt();
int a=tem+i;
if(a<=302)
System.out.println("the flame is incresing to"+a);
else
System.out.println("this is highest");
check1(tem);
}
else if(f==2)
{
System.out.println("how much you want to decrease");
int d=s.nextInt();
int b=tem-d;
if(b<=0)
System.out.println("flame is off");
else
System.out.println("the flame is decresing to"+d);
//if(b<=0)
//System.out.println("flame is off");
}
else 
{
System.exit(0);
}
}
else
{
System.out.println("choose correct");
check1(z);
}
}
/*void exit()
{
System.out.println("You are Exited");
}
public void menu()
{
Scanner s=new Scanner(System.in);
int x=s.nextInt();
switch(x)
{
case '*':manualSet();
       break;
case '#':exit();
       break;
}
}*/
}

