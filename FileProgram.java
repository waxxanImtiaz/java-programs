import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.NoSuchElementException;
import java.util.FormatterClosedException;
import java.util.Scanner;
import java.util.Formatter;

public class FileProgram
{
	Formatter output;
	
	public void openFile(  )
	{
		try{
		output = new Formatter( "test.txt" );
		
		}
		catch( SecurityException e )
		{
			
			System.err.println( e );
			System.exit( 1 );
		}
		catch( FileNotFoundException e )
		{
			System.out.println( e );
			
			System.exit( 1 );
			
		}
	}
	
	public void addRecord()
	{
		AccountRecord record = new AccountRecord();
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Enter account number, first name,last name,balance( to exit press end of file indicator( crtl+z in windows ) ) " );
		System.out.println( "enter Account number >0 " );
		while( input.hasNext() )
		{
			
			try{
					record.setAccount( input.nextInt() );
					record.setFirstName( input.next() );
					record.setLastName( input.next() );
					record.setBalance( input.nextDouble() );
					if( record.getAccount()>0 )
					{
						output.format( " %d %s %s %.2f ",record.getAccount(),record.getFirstName(),record.getLastName(),record.getBalance() );
						
					}
					else
					{
						System.out.println( "Account number must be greater than zero. Input again." );
					}
			}catch( FormatterClosedException e )
			{
				System.out.println( e );
				System.exit( 1 );
			}
			catch( NoSuchElementException e )
			{
				System.out.println( e );
				input.next();
			}
			System.out.println( "Enter account number, first name,last name,balance( to exit press end of file indicator( crtl+z in windows ) ) " );
		    System.out.println( "enter Account number >0 " );
		
		}
	}//end of function..
	public void closeFile()
	{
		if( output != null )
		{
			output.close();
		}
	}
}//end of classs...