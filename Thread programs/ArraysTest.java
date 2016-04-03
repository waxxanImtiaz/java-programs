import java.util.Arrays;
public class ArraysTest
{
	private int[] array = new int[ 6 ];
	
	private int[] array1 = new int[ array.length ];
	
	public ArraysTest()
	{
		Arrays.fill( array,1 );
	    display( array," array:" );
	}
	
	public void display( int arr[] ,String mesg)
	{
		System.out.println( " Elements of "+mesg );
		System.out.println( Arrays.toString( arr ) );
	}
	
	public void inputArray( )
	{
		System.out.println( "Filling array" );
		for( int i = 0; i< array.length; i++ )
			array[ i ] = i+3;
		display( array,"array:" );
		
		System.out.println( "copy array to array1:" );
		System.arraycopy( array,0,array1,0,array.length );
		
		display( array1," array1: " );
		
		Arrays.sort(array1);
		
		System.out.println( "after sorting " );
		display( array1,"array1:" );
		
		boolean flag = Arrays.equals( array,array1 );
		
		int location = Arrays.binarySearch( array1,5 );
		if( location >=0 )
			System.out.println( 5+" found at index "+location );
			else
			System.out.println( 5+" not found" );
			
		
			
	}
	
	public static void main( String [] args )
	{
		ArraysTest t = new ArraysTest();
		t.inputArray();
	}
}