import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WriteSer
{
	    private ObjectOutputStream output;
		
		public void openFile()
		{
			try
			{
				output = new ObjectOutputStream( new FileOutputStream( "test.ser" ) );
				
			}catch( IOException e )
			{
				System.err.println( e );
				
			}//end of catch
			
		}//end of method
		
		public void addRecord(  )
		{
			AccountRecordSer record;
			
			Scanner input = new Scanner( System.in );
			int account;
			String fn;
			String ln;
			double bal;
			
			System.out.println(  "to terminate press end-of-line indicater. In windows press <crtl> + z and press enter." );
			System.out.println( "Enter account number,first name,last name and balance." );
			System.out.println("Enter  and roll number(>0).");
			
			while( input.hasNext() )
			{
				try{
					account = input.nextInt();
					fn = input.next();
					ln = input.next();
					bal = input.nextDouble();
					
					if( account>0 )
					{
						
						record = new AccountRecordSer( account,fn,ln,bal );
						output.writeObject( record );
					}
					else
					{
						System.out.println( "Account number must be greater than zero." );
					}
				}catch( IOException e )
				{
					System.err.println( e );
					return;
				}
				catch(  NoSuchElementException e )
				{
					System.err.println( e );
					input.nextLine();
				}
				System.out.println( "Enter account number,first name,last name and balance." );
			
			}
		}//end of method
		
		public void closeFile()
		{
			try{
				if( output != null )
					output.close();
				
			}catch( IOException e )
			{
				System.err.println( e );
				System.exit( 1 );
			}
		}
	
}//end of class...