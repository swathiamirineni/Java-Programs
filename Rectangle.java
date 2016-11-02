public class Rectangle extends Geometry
{
void area(int l,int b)
{
int res1=l*b;
System.out.println("the area of the rectangle"+res1);
} 
void perimeter(int l,int b)
{
int res2=2*(l+b);
System.out.println("the perimeter of the rect"+res2);
}
}