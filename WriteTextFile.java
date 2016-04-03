import java.lang.SecurityException;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.FormatterClosedException;

public class WriteTextFile
{
	
	private Formatter output;
	
	public void openFile()
	{
		try{
			
			output = new Formatter( "c.txt" );
			
		}catch( SecurityException e )
		{
			System.err.println( "You do not have write access to this file." );
			System.exit( 1 );
		}
		catch( FileNotFoundException e )
		{
			System.err.println( "File not found." );
		}
	}
	public void addRecords()
	{
		
		Account record = new Account();
		
		System.out.printf( "\n%s\n%s\n","To terminate input type end-of-file indicator"," press crtl+z on then press enter. " );
		
		System.out.printf( "\n%s\n%s","Enter account number (>0),first name,last name and balance.","?" );
		
		while( MyScanner.Input.hasNext() )
		{
			try{
				record.setAccountNumber( MyScanner.Input.nextInt() );
				record.setFirstName( MyScanner.Input.next() );
				record.setLastName( MyScanner.Input.next() );
				record.setBalance( MyScanner.Input.nextDouble() );
				
				if( record.getAccountNumber( )>0 )
				{
					
					output.format( "%d %s %s %.2f\n" ,record.getAccountNumber(),record.getFirstName(),record.getLastName(),record.getBalance());
				}
				else
				{
					System.out.println(" Account number must be great then zero. ");
				}
			}catch( FormatterClosedException e )
			{
				System.err.println( "Error writting to file." );
				return;
			}
			catch( NoSuchElementException e )
			{
				
				System.err.println( "Invalid input.Please try again." );
				MyScanner.Input.nextLine();
			}
			System.out.printf( "\n%s\n%s","Enter account number (>0),first name,last name and balance","?" );
	
		}
	}
	public void closeFile()
	{
		if( output != null )
		{
			output.close();
		}
	}
}