public abstract class Geometry
{
abstract void area(int l,int b);
abstract void perimeter(int l,int b);
void square(int s)
{
int re=s*s;
System.out.println("The area of the square"+re);
int re1=2*s;
System.out.println("the perimeter of the square"+re1);
}
}