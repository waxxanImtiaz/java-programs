class P{
	static{
		System.out.println( "Static block" );
		
	}
	 
	
}

class B extends P
{
	public static final synchronized strictfp void main( String[] args )
	{
		System.out.println( " Main with int.." );
	}
}