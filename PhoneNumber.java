import java.util.StringTokenizer;

class PhoneNumber
{
	private String input;
	
	public PhoneNumber()
	{
		this("");
		getStart();
	}
	
	public PhoneNumber( String input )
	{
		
		this.input = input;
	}
	
	public void setInput( String value )
	{
		input = value;
	}
	public String getInput()
	{
		
		return input;
	}
	public void getStart()
	{
		
		System.out.println( "Enter any name:" );
		input = MyScanner.Input.nextLine();
		
		input = input.toUpperCase();
		change();
	}
	public void change( )
	{
		
		String[] tokens = input.split( "-" );
		String digitValue="";
			
		for( int i = 0; i<tokens.length; i++ )
		{
			//printCode(tokens[ i ]);
			if((input.indexOf('-')!=-1)&&(i != 0))
			{
					digitValue = digitValue+"-"+convert( tokens[i] );
					

		     
			}
			else if( i == 0)
			    digitValue = digitValue + convert( tokens[i] );
			else
					digitValue = digitValue +" "+ convert( tokens[i] );
		}
		
		digitValue.replaceAll( " ","-" );
		
		printCode( digitValue );
	}
	
	public String convert( String value )
	{
		
		String temp = "";
		
		char matcher;
		
		for( int i = 0; i< value.length(); i++ )
		{
			matcher = value.charAt( i );
			
			switch( matcher )
			{
				
				case 'A':
				case 'B':
				case 'C':
				temp = temp + '2'; break;
				case 'D':
				case 'E':
				case 'F':
				temp = temp + '3'; break;
				case 'G':
				case 'H':
				case 'I':
				temp = temp + '4'; break;
				case 'J':
				case 'K':
				case 'L':
				temp = temp + '5'; break;
				case 'M':
				case 'N':
				case 'O':
				temp = temp + '6'; break;
				case 'P':
				case 'Q':
				case 'R':
				temp = temp + '7'; break;
				case 'S':
				case 'T':
				case 'U':
				temp = temp + '8'; break;
				case 'V':
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
				temp = temp + '2'; break;
				case '0':
				temp = temp + '0'; break;
				case '1':
				temp = temp + '1'; break;
				
			}//end of switch
		
		}//end of for loop
		return temp;
	}//end of convert function
	
	public void printCode( String value )
	{
		System.out.println("A suitable number for this : ");
		System.out.println(value);
	}
}