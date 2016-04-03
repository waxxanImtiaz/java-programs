import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest
{
	public static void main( String[] args )
	{
		SimpleArray sharedSimpleArray = new SimpleArray( 6 );
		
		ArrayWritter writer1 = new ArrayWritter( 1,sharedSimpleArray );
		ArrayWritter writer2= new ArrayWritter( 11,sharedSimpleArray );
		ArrayWritter writer3= new ArrayWritter( 4,sharedSimpleArray );
		
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.execute( writer1 );
		executor.execute( writer2 );
		//executor.execute( writer3 );
		
		executor.shutdown();
		
		try
		{
			boolean tasksEnded = executor.awaitTermination( 1,TimeUnit.MINUTES );
			
			if( tasksEnded )
			{
				System.out.println( sharedSimpleArray );
			}
			else
			{
				System.out.println( "Timed out while writing for tasks to finish." );
			}
		}catch( InterruptedException e )
		{
			System.out.println( "Interrupted while waiting for tasks to finish." );
		}
	}
}