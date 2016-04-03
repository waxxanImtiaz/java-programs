public class Inheritance
{
	public static void main( String[ ] args )
	{
		A obj = new C();
		obj.show();
	}
}

class A{
	public void show()
	{
		System.out.println( "Class A" );
	}

}
class B extends A
{
	/*
	public void show()
	{
		System.out.println( "Class B" );
	}*/
	
}

class C extends B
{
	/*
	public void show()
	{
		System.out.println( "Class C" );
	}*/
	
}