import java.util.*;
class OnorOff extends AllFun
{
void check()
{
try
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("the indicators");
System.out.println("1.ON");
System.out.println("2.OFF");
System.out.println("switch on the stove");
n=s.nextInt();
if(n==1)
{
System.out.println("on");
System.out.println("use cookware with a flat bottom and diameter is 12-20cm");
System.out.println("");
try
{
System.out.println("Select which type you select");
System.out.println("1.Manual");
System.out.println("2.Roti/Dosa");
System.out.println("3.Gravy");
System.out.println("4.SlowCook");
System.out.println("5.Stir Fry");
System.out.println("6.Pressur Cook");
System.out.println("7.DeepFry");
System.out.println("8.Milk/Water");
System.out.println("9.Off at End");
int c=s.nextInt();
switch(c)
{
case 1:manualSet();
       break;
case 2:rd();
       break;
case 3:gravy();
       break;
case 4:sc();
       break;
case 5:stirFry();
       break;
case 6:presCook();
       break;
case 7:deepFry();
       break;
case 8:mWater();
       break;
case 9:off();
       break;
default:System.out.println("check your indicator");
       check();             
}
}
catch(Exception e)
{
System.out.println(e);
}
}
else if(n==2)
{
System.out.println("off");
}
else 
{
System.out.println("Please choose correct choice");
check();
}
}
catch(Exception e)
{
System.out.println(e);
System.out.println("Please choose correct choice");
check();
}
}
}
