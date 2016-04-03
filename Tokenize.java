import java.util.StringTokenizer;

public class Tokenize
{
	public static void main( String [] args )
	{
	
			String input = "my name is Imtiaz ali.";
			
			String[]  tokens = input.split( " " );
			
			for( String x : tokens )
			{
			if( x.startsWith( "I" ) )
			System.out.println( x );
			}
			
			for( String x : tokens )
			{
				if( x.endsWith( "e" ) )
				System.out.println( x );
			}
				
	}
}