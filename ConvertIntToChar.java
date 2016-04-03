public class ConvertIntToChar
{
	
	public static void main( String [] args )
	{
		
		int x; 
		int radix;
		
		System.out.println( "Enter radix :" );
		
		radix = MyScanner.Input.nextInt();
		
		System.out.println( "Enter digit :" );
		
		x = MyScanner.Input.nextInt();
		
		System.out.printf( "Convert digit to character: %c\n",Character.forDigit( x,radix ) );
		
	}
}