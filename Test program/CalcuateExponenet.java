public class CalculateExponent
{
	public static void main( String[] args )
	{
		int base = 2;
		int power = 4;
		int result;
		result = (int)integerPower( base,power );
		
		Sytem.out.printf( "%d power %d is %d",base,power,result );
	}
	public static long integerPower( int base , int expo )
	{
		long mul = 1;
		int lcv = 1;
		
		while( lcv<=expo )
		{
			mul = mul*base;
			lcv++;
		}
		return mul;
	}
}