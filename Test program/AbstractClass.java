public class AbstractClass
{
	public static void main( String[] args )
	{
		
		A obj = new C();
		obj.display();
	}
}

abstract class A
{
	public void print()
	{
		System.out.println( "Class A" );
	}
	public abstract void display();
}

class B extends A implements InterfaceA
{
	public void display()
	{
		System.out.println( "Class C" );
	}
}
class C extends B
{
	public void display()
	{
		System.out.println( "Class C" );
	}
}