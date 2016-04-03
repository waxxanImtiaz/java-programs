public class VariableLenght
{
	public static double sum( double ... numbers )
	{
		double x = 0.0;
		for( double d : numbers )
			x = x+d;
		
		return x;
	}
	
	public static void main( String[] args )
	{
		double r = sum( 1,1,1,1 );
		
		System.out.println( r );
	}
}