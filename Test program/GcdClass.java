public class GcdClass
{
	public static void main( String[] args )
	{
		int num1 = 18;
		int num2 = 12;
		
		System.out.printf( "Greatest common divisor of %d and %d is %d",num1,num2,gcd( num1,num2 ) );
	}
	
	public static int gcd( int num1,int num2 )
	{
		int x = ( num1>num2 )? num2: num1;
		
		int number = 1;
		int i = 1;
		
		while( i<= x )
		{
			if( (num1%i == 0) &&( num2%i == 0 ))
			{
				number = i;
			}
			i++;
		}
		
		return number;
	}
}