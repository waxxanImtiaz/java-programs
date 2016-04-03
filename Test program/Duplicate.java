import java.util.Random;
public class Duplicate
{
	private int[] input = new int[ 5 ];
	private Random generator = new Random();
	
	public void takeInput()
	{
		for( int i = 0; i<5; i++ )
		{
			input[ i ] = 10 + generator.nextInt( 91 );
			if( checkDuplicate( i ))
			{
				System.out.println( input[ i ] );
			}
		}
	}//end of takeInput method..
	public boolean checkDuplicate( int index )
	{
		int number = input[ index ];
		
		for( int i = 0; i<index; i++ )
		{
			if( input[ i ] == number )
				return false;
		}
		
		return true;
	}
	
	public static void main( String[] args )
	{
		Duplicate obj = new Duplicate();
		
		obj.takeInput();
	}
}