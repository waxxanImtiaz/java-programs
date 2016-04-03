import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.lang.SecurityException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class WriteStudentRecord {
		private Formatter output;
		private Scanner input = new Scanner( System.in );
		public void openFile()
		{
			
			try{
				
				output = new Formatter( "my.txt" );
			}
			catch(SecurityException e   )
			{
				
				System.err.println( "You have no access to this file." );
				System.exit( 1 );
			}
			catch( FileNotFoundException e )
			{
				
				System.out.println( "File not found." );
				System.exit( 1 );
			}
		}
		
		public void addRecord(  )
		{
			
			StudentRecord record = new StudentRecord();
			
			System.out.println(  "to terminate press end-of-line indicater. In windows press <crtl> + z and press enter." );
			
			System.out.println("Enter  and roll number(>0).");
			
			while( input.hasNext() )
			{
				try{
					record.setName(input.next() );
					record.setRoll( input.nextInt()  );
					
					if( record.getRoll()>0 )
					{
						
						output.format("\n %s %d \n", record.getName(),record.getRoll());
						cal( record.getRoll() );
					}
					else
					{
						
						System.out.println( "Roll number must be greater than 0." );
					}
				}catch( FormatterClosedException e )
				{
					
					System.err.println( "Error writting to file." );
					return;
				}
				catch( NoSuchElementException e )
				{
					
					System.err.println( "Invalid input, Enter again." );
					input.nextLine();
				}
				System.out.println("Enter name and roll number(>0).");
				
			}//end of loop
		}//end of method.
		public void closeFile()
		{
			
			if( output != null )
			    output.close();
		}
		
		public void cal( int x )
		{
			
			System.out.println( " square is "+x*x );
		}
}// end of class
