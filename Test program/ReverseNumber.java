public class ReverseNumber
{
	public static void main( String[] args )
	{
		long number = 45861;
		
		System.out.printf( "Reverse of %d is %d",number,reverse( number ) );
	}
	public static long reverse( long number )
	{
		long num = number;
		
		long a;
		long b;
		long c;
		long d;
		long e;
		
		a = num/10000;
		num = num%10000;
		
		b = num/1000;
		num = num%1000;
		
		c = num/100;
		num = num%100;
		
		d = num/10;
		num = num%10;
		
		e = num;
		
		num = e*10000;
		num = num + d*1000;
		num = num + c*100;
		num = num + b*10;
		num = num + a;
		
		return num;
		
		
	}
}