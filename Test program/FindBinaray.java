public class FindBinary
{
	public static void main( String[] args )
	{
		int number = 8;
		System.out.println( "Binary number of %d is %d",number,binary( number )  );
	}
	public static long binary( int number )
	{
		String x = "";
		
		int div;
		int y;
		
		 div = number;
		
		while( div != 1 )
		{
			y = div%2;
			x = x + y;
			div = div/2;
		}
		
		
		long result =  Long.parseLong( x );
		
		return result;
	}
}