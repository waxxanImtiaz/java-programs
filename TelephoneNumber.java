import java.util.StringTokenizer;

public class TelephoneNumber
{
	
	public static void main( String [] args)
	{
		
		String pNumber;
		
		System.out.println( "Enter your phone number in the form of 555 555-5555.There can be any number(0-9) at the place of 5 " );
		
		pNumber = MyScanner.Input.nextLine();
		String number;
		
		String[] code,n;
		
		if( isValidInput( pNumber ) )
		{
			
			code = pNumber.split( " " );
			
			n = pNumber.split( "-" );
			
			number = code+n[0]+n[1];
			
			System.out.println(number);
		}
		else 
			System.out.println("Invalid input");
		
	}
	
	public static boolean isValidInput( String number )
	{
		
		return number.matches( "(\\d{3}\\s{3}+\\d{4})" );
	}
}