public class FindBinary
{
	public static void main( String[] args )
	{
		int number = 8;
		System.out.printf( "Binary number of %d is %s",number,binary( number )  );
	}
	public static String binary( int number )
	{
		String x = "";
		
		int div;
		int y;
		
		 div = (int)number;
		
		while( div != 1 )
		{
			y = div%2;
			x = x + y;
			System.out.println( x );
			div = div/2;
		}
		x = x +div;
		
		//long result =  Long.parseLong( x );
		
		return x;
	}
}