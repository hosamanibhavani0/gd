interface A
{
 public void display();
}
class B
{
 public void display();
}
class C implements B,A
{
 publi void display()
 {
  System.out.println("interface example");
 }
}
class ex
{public static void main(String a[])
{
 C c=new C();
 c.display();
}
}