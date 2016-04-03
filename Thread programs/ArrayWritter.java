import java.lang.Runnable;

public class ArrayWritter implements Runnable
{
	private final SimpleArray sharedSimpleArray;
	private final int startValue;
	
	public ArrayWritter( int value,SimpleArray array )
	{
		startValue = value;
		sharedSimpleArray = array;
	}
	
	public void run()
	{
		for( int i = startValue; i<startValue+3; i++ )
		{
			System.out.println( "i="+i );
			sharedSimpleArray.add( i );
		}
	}
}