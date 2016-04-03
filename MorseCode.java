import java.util.ArrayList;
public class MorseCode
{
	public static void main( String [] args )
	{
		

			ArrayList<String> codes = new ArrayList<String>();
			
			
			String input;
			
			for( int i = 0; i< 9; i++ )
			{
				input = "";
				System.out.println( "Enter code:" );
				input =  MyScanner.Input.nextLine();
				
				codes.add(i, input );
			}
			
			for( int i = 0; i< 9; i++ )
			{
				System.out.println( "codes are:"+codes.get( i ));
				
			}
	}
}