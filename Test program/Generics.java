public class Generics
{
	public static void main( String[] args )
	{
		System.out.println( "Maximum of 3 and 4 is "+max( 3,4 ) );
	}
	
	public static <T extends Comparable<T>> T max( T x,T y )
	{
		T a = x;
		if( x.compareTo( a )>0) 
			return a;
		else return y;
	}	
}