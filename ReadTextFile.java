import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile
{
	private Scanner input;
	public void openFile()
	{
		try
		{
		input = new Scanner( new File( "c.txt") );
		}
		catch( FileNotFoundException e )
		{
			System.err.println( "Error opening file." );
			System.exit( 1 );
		}
	}
	
	public void readRecords()
	{
		
		Account record = new Account();
		
		System.out.printf( "\n%-10s%-12s%-12s%-10s\n" ,"Account","First Name","Last Name","Balance" );
		
		try{
			while( input.hasNext() )
			{
				record.setAccountNumber( input.nextInt() );
				record.setFirstName( input.next() );
				record.setLastName( input.next() );
				record.setBalance( input.nextDouble() );
				
				System.out.printf( "%d%12s%12s%10.2f\n" , record.getAccountNumber(),record.getFirstName(),record.getLastName(),record.getBalance() );
				
			}
			
			
		}catch( NoSuchElementException e )
		{
			System.err.println( "File improperly formed." );
			input.close();
			System.exit( 1 );
		}
		catch( IllegalStateException e )
		{
			System.err.println( "Error reading file." );
			System.exit( 1 );
		}
	}
	public void closeFile()
	{
		if( input != null )
			input.close();
	}
	}
	
	
	
	
