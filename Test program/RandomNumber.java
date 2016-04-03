import java.util.Random;

public class RandomNumber
{
	public static Random generator = new Random();
	public static void main( String[] args )
	{
		int num;
		for( int i = 0; i<=4; i++ )
		{
			num = 1+generator.nextInt( 10 );
				System.out.print( num+" " );
		}
	}
}