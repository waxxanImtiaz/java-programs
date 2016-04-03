import java.lang.Math.*;
public class FindPrimeNumber
{
	public static void main( String[] args )
	{
		int number = 21;
		
		System.out.printf( "%d is%s prime",number,(isPrime( number ))? "":" not" );
	}
	
	public static boolean isPrime( int number )
	{
		double squareRoot = Math.sqrt( number );
		
		if( number == 0 )
			return false;
		if( number == 1 )
			return false;
		if( number/squareRoot == 0.0 )
			return false;
		
		for( int i = 2; i<number/2; i++ )
		{
			if( number%i == 0 )
				return false;
		}
		
		return true;
	}
}