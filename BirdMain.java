class BirdMain
{
public static void main(String[] args)
{
Parrot p=new Parrot();
p.fly();
p.color();
p.speak();
p.walk();
System.out.println("==============================");
System.out.println("owl properties");
Owl o=new Owl();
o.fly();
o.walk();
o.property();
}
}