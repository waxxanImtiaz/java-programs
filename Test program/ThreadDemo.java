
class MyThread implements Runnable
{
	public void run()
	{
		for( int i  = 0; i<10; i++ )
		{
			System.out.println( "Child Thread" );
			try{
			if( i == 5 )
			{
				Thread.sleep( 500 );
			}
			}catch( InterruptedException e )
			{
				e.printStackTrace();
			}
		}
		
	}
}

public class ThreadDemo
{
	public static void main( String[] args )
	{
		MyThread t = new MyThread();
		
		Thread f = new Thread( t );
		f.start();
		
		for( int i = 0; i<10; i++ )
		{
			System.out.println( "Main thread" );
			try{
			if( i == 5 )
			{
				Thread.sleep( 500 );
			}
			}catch( InterruptedException e )
			{
				e.printStackTrace();
			}
		}
	}
}