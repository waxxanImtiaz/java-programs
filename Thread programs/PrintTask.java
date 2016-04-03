import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class PrintTask 
{
		public static void main( String[] args )
		{
			TaskExecutor task1 = new TaskExecutor( "Task1" );
			TaskExecutor task2 = new TaskExecutor( "Task2" );
			TaskExecutor task3 = new TaskExecutor( "Task3" );
			
			ExecutorService threadExecutor = Executors.newCachedThreadPool();
			
			threadExecutor.execute( task1 );
			threadExecutor.execute( task2 );
			threadExecutor.execute( task3 );
			
			threadExecutor.shutdown();
			
			System.out.println( "Tasks started, main ends" );
		
		}

}//end of class PrintTask


class TaskExecutor implements Runnable
{
	private final int sleepTime;
	private final String taskName;
	private final static Random generator = new Random();
	
	public TaskExecutor( String task )
	{
		taskName = task;
		sleepTime = generator.nextInt( 5000 );
	}
	
	public void run()
	{
		try
		{
			System.out.printf( "%s going to sleep for %d milli seconds.\n",taskName,sleepTime );
			Thread.sleep(  sleepTime );
		}
		catch( InterruptedException e )
		{
			System.out.printf( "%s done sleeping\n",taskName );
		}
	}
	
}