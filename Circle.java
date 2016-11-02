public class Circle extends Rectangle
{
final double  pi=3.14;
void area(int r)
{
int res3=(int) (pi*(Math.pow(r,2)));
System.out.println("the area of the circle"+res3);
}
void perimeter(int r)
{
int res4=(int) (2*pi*r);
System.out.println("the perimeter of the circle"+res4);
}
}