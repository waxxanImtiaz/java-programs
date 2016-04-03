import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NewAgencyPayment
{
	private int[] values;
	private char[] numOfChars;
	private String[] articles;
	private int articleLines;
	private double moneyCount;
	private InputStreamReader in;
	private BufferedReader input;
	public NewAgencyPayment()
	{
		in = new InputStreamReader( System.in );
		input = new BufferedReader( in );
		getInput();
		
	}
	
	public void setLength( int charValues )
	{
		
		values = new int[ charValues ];
		moneyCount = 0;
		numOfChars = new char[ charValues ];
		
	}
	
	public void getInput()
	throws java.util.InputMismatchException
	{
		
		int tests;
		int numbers;
		int artLines;
		int i = 0;
		int j;
		String x ;
		
		System.out.println( "Enter number of articles:" );
		tests = MyScanner.Input.nextInt();
		
		if(tests !=0 )
		{	
		while( i<tests )
			{
			try{
			System.out.println( "Enter number of characters:" );
			numbers = MyScanner.Input.nextInt();
			setLength( numbers );
			j = 0;
			while( j<numbers )
			{
				x = input.readLine();
				numOfChars[j] = x.charAt(0);
				values[j] = MyScanner.Input.nextInt();
				j++;
			}
			
			System.out.println( "Enter number of lines of articles:" );
			artLines = MyScanner.Input.nextInt();
			setArtLength( artLines );
			j = 0;
			
			System.out.println( "Enter article number "+(i+1) );
			
			while( j<articles.length )
			{
				
				articles[j] = input.readLine();
				j++;
			}
			}catch( IOException e )
			{
				e.printStackTrace();
			}//end of try catch..
			j = 0;
			int temp;
			
			while( j<numOfChars.length )
			{
				
				temp = charCount(  numOfChars[j] );
				
				moneyCount = moneyCount +temp*values[j];
				
				j++;
			}//end of while loop
			System.out.println("Money for article # "+tests+" are  "+moneyCount+"$");
			i++;
		}//end of outer while loop..
		}//end of if
		else
		{
			System.out.println("Number of articles are less than 1. Please enter valid number of articles.");
			System.exit( 1 );
		}//end of else
	}//end of getInput method

	public int charCount( char find )
	{
		
		int count = 0;
		int j = 0;
		int i = 0;
		
		while( j<articles.length )
		{
			
			i = 0;
			while( i<articles[j].length() )
			{
				if( articles[j].charAt( i ) == find )
					count++;
				i++;
				
			}//end of inner while loop
			j++;
		}// end of outer while loop
		return count;
	}//end of charCount method
	
	public void setArtLength( int l )
	{
		
		articles = new String[ l ];
	}
}//end of class
	
	
