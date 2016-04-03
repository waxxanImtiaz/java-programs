public class MyInterfaceTest implements MyInterface
{
	public static void main( String[] args )
	{ 
		MyInterfaceTest obj = new MyInterfaceTest();
		obj.print( 2 );
	}
	public void print( int x  )
	{
		System.out.println( MyInterface.x );
	}
	public void set()
	{
		
	}
	public void run()
	{
		
	}
}