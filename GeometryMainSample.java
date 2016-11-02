import java.util.*;
public class GeometryMainSample 
{
public static void main(String[] args)
{
int l,b,n,r;
Scanner s=new Scanner(System.in);
System.out.println("enter length,Breath to fin area,peri");
l=s.nextInt();
b=s.nextInt();
Rectangle r1=new Rectangle();
r1.area(l,b);
r1.perimeter(l,b);
System.out.println("enter n value to find sqare area,peri");
n=s.nextInt();
System.out.println("enter radious");
r=s.nextInt();
Circle c1=new Circle();
c1.area(r);
c1.perimeter(r);
c1.square(n);
}
}
