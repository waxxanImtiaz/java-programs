public class StaticInitializer
{
	public static void main( String[] args )
	{
		System.out.println( "In main method..." );
		System.out.println( "In main method......" );
		
		StaticInitializer obj1 = new StaticInitializer();
		obj1.display();
		
		
		StaticInitializer obj2 = new StaticInitializer();
		obj2.display();
		
		
		StaticInitializer obj3 = new StaticInitializer();
		obj3.display();
	}
	public void display( )
	{
		System.out.println( "Hello everybody" );
	}
	
	static
	{
		System.out.println( "Static initializer..." );
	}
}