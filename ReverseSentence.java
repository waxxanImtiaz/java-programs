import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseSentence
{
	
	private int numbOfInputs;
	
	private String[] string;
	private InputStreamReader in = new InputStreamReader( System.in );
	private BufferedReader input = new BufferedReader( in );
	public ReverseSentence()
	{
		System.out.println("Enter number input lines: ");
		set(MyScanner.Input.nextInt());
	}
	
	public void set( int index )
	{
		
		string = new String[ index ];
		numbOfInputs = index;
		getInput();
	}
	
	public void getInput()
	{
		
		System.out.println( "Enter "+numbOfInputs+" lines" );
		try{
		for( int i = 0; i<numbOfInputs; i++ )
		{
			string[i] = input.readLine(); 
			
		}
		reverseString();
		}catch( IOException e)
		{
		e.printStackTrace();
		}
	}
	
	public void reverseString()
	{
		StringBuilder buffer = new StringBuilder();
		for( int i = numbOfInputs-1; i>=0; i-- )
		{
			
			buffer.append( string[i] );
			buffer.append("\n");
		
			
		}
		buffer.reverse();
		
		System.out.printf("\n%s\n",buffer.toString());
	}//end of reverseString method
	
	public void printSentence()
	{
		
		System.out.println( "Result is " );
		for( int i =0; i<numbOfInputs; i++ )
			System.out.println( string[i] );
	}
}