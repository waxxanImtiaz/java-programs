import java.util.regex.PatternSyntaxException;
import java.util.NoSuchElementException;
import java.lang.IllegalStateException;
public class TestMatches
{
	public static void main( String [] args )
	{
		String input = " " ;
		
		try
		{
		while( !input.equals( "-1" ) )
		{
			System.out.println( "Enter your name:" );
			input = MyScanner.Input.next( );
			if( !isValid( input ) )
			{
				System.out.println( "\nInvalid input." );
			}
		}//end of while loop....
		}catch( PatternSyntaxException e )
		{
			
			e.printStackTrace();
		}
		catch( NoSuchElementException e )
		{
			System.out.println( e.getMessage() );
		}
		catch( IllegalStateException e )
		{
			e.printStackTrace();
		}
	}
	
	public static boolean isValid( String temp )
	throws PatternSyntaxException
	{
		return temp.matches( "\\S?" );
	}
}