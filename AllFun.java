import java.util.*;
public class AllFun extends Manual implements Runnable,Induction
{
void off()
{
System.exit(0);
}
public void run()
{
}
public void manual()
{}
public void  rd()
{
Scanner s=new Scanner(System.in);
System.out.println("your stove is set ");
System.out.println("flame  indicators");
System.out.println("1.+");
System.out.println("2.-");
System.out.println("choose choice");
int f=s.nextInt();
if(f==1)
{
System.out.println("the flame is incresing");
}
else if(f==2)
{
System.out.println("the flame is decresing");
}
}

public void sc()
{
System.out.println("the stove is set for 65 degrees centigrades");
}

public void stirFry()
{
System.out.println("the stove is set for stir fry");
System.out.println("the temperature is set for 166 c");
}

public void  presCook()
{
System.out.println("the stove is set for pressure cook");
try
{
Thread.sleep(8000);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("the stove is automatically off");
}

public void deepFry()
{
System.out.println("the stove is set for deep fry");
}

public void mWater()
{
System.out.println("the stove is set for milk/water");
}

public void gravy()
{
System.out.println("the stove is set for gravy");
System.out.println("the induction provide moderate heat for five minutes");
try
{
Thread.sleep(1000);
System.out.println("it change to high flame for 13 minutes");
Thread.sleep(5000);
int s=302-237;
System.out.println("the flame is set for slow cooking" +s);
}
catch(Exception e)
{
System.out.println(e);
}
}
}

