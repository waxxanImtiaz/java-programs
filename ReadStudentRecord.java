import java.io.File;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.lang.IllegalStateException;

public class ReadStudentRecord {
			private Scanner input = new Scanner( System.in );
			
			public void openFile(  )
			{
				
				try
				{
					
					input = new Scanner( new File( "my.txt" ) );
					
				}catch( SecurityException e )
				{
					
					System.err.println( "You have not access to this file." );
					System.exit( 1 );
				}
				catch( FileNotFoundException e )
				{
					
					System.err.println( "File not found." );
					System.exit( 1 );
				}
			}//end of method openFile
			
			public void readRecord()
			{
				StudentRecord record = new StudentRecord( );
				
				System.out.printf( "%-10s%-10s" , "Name","Roll number");
				
				while( input.hasNext() )
				{
					try{
					record.setName( input.next() );
					record.setRoll( input.nextInt() );
					
					System.out.printf(  "\n%-10s%-10d\n" , record.getName(),(int)record.getRoll());
					
				
					}catch( NoSuchElementException e )
					{
						
						System.err.println(  "\nInvalid input.\n"+e.getMessage() );
						input.nextLine();
					}
					catch( IllegalStateException e )
					{
						
						System.err.println( "Error reading from file." );
						input.close();
						System.exit( 1 );
					}
				}//end of while loop.
			}//end of method.
			
			public void closeFile()
			{
				
				if( input != null )
					input.close();
			}
		
}
