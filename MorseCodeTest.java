
public class MorseCodeTest
{
		public static void main( String [] args )
		{
				//MorseCodeClass  obj = new MorseCodeClass( );
				//obj.getInput();
				TelephoneTangles object = new TelephoneTangles();
			
		}
}
class MorseCodeClass
{
	private String input;
	private String code;
	
	public void getInput()
	{
		int t;
		
		System.out.println( "Enter number of inputs:" );
		t = MyScanner.Input.nextInt();
		String x;
		while( t>=1 )
		{
			
			System.out.println( "enter code "+t );
			x = MyScanner.Input.next();
			
			start( x );
			t--;
		}
	}
	
	public void start( String in )
	{
		input = in;
		code = "";
		
		for( int i= 0; i<input.length(); i++ )
		{
			code = code + " "+getCode( input.charAt( i ) );
			
		}
		
		printCode( code );
	}
	
	
	public String getCode( char x )
	{
		switch(x)
		{
			case 'A':
					return ".-";
			case 'B':
					return "-...";
			case 'C':
					return "-.-.";
			case 'D':
					return "-..";
			case 'E':
					return ".";
			case 'F':
					return "..-.";
			case 'G':
					return "--.";
			case 'H':
					return "....";
			case 'I':
					return "..";
			case 'J':
					return ".---";
			case 'K':
					return "-.-";
			case 'L':
					return ".-..";
			case 'M':
					return "--";
			case 'N':
					return "-.";
			case 'O':
					return "---";
			case 'P':
					return ".--.";
			case 'Q':
					return "--.-";
			case 'R':
					return ".-.";
			case 'S':
					return "...";
			case 'T':
					return "-";
			case 'U':
					return "..-";
			case 'V':
					return "...-";
			case 'W':
					return ".--";
			case 'X':
					return "-..-";
			case 'Y':
					return "-.--";
			case 'Z':
					return "--..";
			
			}
			return "";
					
		}//end of function
		
		public void printCode( String x )
		{
			System.out.println( x );
		}
	
}