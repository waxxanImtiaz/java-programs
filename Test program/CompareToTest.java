public class CompareToTest
{
	private int x;
	public CompareToTest( int x )
	{
		this.x = x;
	}
	public void setNumber( int x )
	{
		this.x = x;
	}
	public int getNumber(  )
	{
			return x;
	}
	
	public static void main( String[] args )
	{
		CompareToTest obj = new CompareToTest( 2 );
		
		obj.setNumber( 3 );
		System.out.println( obj.getNumber() );
	}
	public String toString()
	{
		return String.format( "%d ",x );
	}
}