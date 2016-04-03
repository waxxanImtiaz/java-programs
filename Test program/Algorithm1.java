import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithm1
{
	public static void main( String[] args )
	{
		Integer[] number = { 1,2,3,4,5,6,7,8,9,111,45,33 };
		
		List<Integer> list = Arrays.asList( number );
		
		System.out.println( "list contains:" );
		output( list );
		
		Collections.reverse(  list );
		System.out.println( "\nAfter calling reverse,list contains:" );
		output( list );
		
		Integer[] numbercopy = new Integer[ number.length ];
		List<Integer> copyList = Arrays.asList( numbercopy );
		
		Collections.copy( copyList,list );
		
		System.out.println( "\nAfter copying,copyList contains:" );
		output( copyList );
		
		Collections.fill( list,133 );
		System.out.println( "\nAfter calling fill,list contains:" );
		output( list );
		
		int pos = Collections.binarySearch( list ,12);
		
		if( pos >=0 )
			System.out.printf( "\n%d is found at %d\n",12,pos );
			else
				System.out.printf( "\n%d not found \n",12 );
			
		Integer[] n = list.toArray( new Integer[ list.size() ] );
		
		System.out.println( "\nArray of numbers is\n " );
		
		for( Integer x : n )
			System.out.printf( "%d ",x );
		
		int fre = Collections.frequency( list,133 );
		
		System.out.println(  ); 
		
		System.out.println( fre ); 
		
		boolean disjoint = Collections.disjoint( copyList,list );
		
		if( disjoint )
		{
			System.out.println( disjoint ); 
		}
		else
			System.out.println( disjoint ); 
	}
	
	private static void output( List< Integer > listRef )
	{
		System.out.print( "The list is:" );
		
		for( Integer element : listRef )
			System.out.printf( "%s",element );
		
		System.out.printf( "\nMax:%s",Collections.max( listRef ) );
		System.out.printf( "\nMin:%s",Collections.min( listRef ) );
		
	}
}