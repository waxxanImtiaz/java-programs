import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest
{
	public static void main( String[] args )
	{
		String[] colors1 = { "blue,","green,","gold,","white,","yellow,","cyan,","indigo,","violet,","red," };
		
		List<String> list = new LinkedList<String>();
		
		for( String color : colors1 )
			list.add( color );
		
		System.out.println( "\nLinked list of colors1" );
		printList( list );
		
		
		String[] colors2 = { "blue,","pink,","rgb,","sky blue,","dark blue," };
		
		
		
		List<String> list2 = new LinkedList<String>();
		
		for( String color: colors2 )
			list2.add( color );
		

		
		System.out.println( "\nLinked list of colors2" );
		printList( list2 );
		
		list.addAll( list2 );
		
		list2 = null;
		
		System.out.println( "\nAfter adding list2 with list then the Linked list of colors1 is......." );
		printList( list );
		
	
		
		
		convertToUpperCase( list );
		
		System.out.println( "\nAfter converting to Upper case the Linked list of colors1 is....." );
		printList( list );
		
		
		printReverse( list );
		
		removeColors(list, 3,7 );
		
		System.out.println( "After removing 3 to 6th elements list is....." );
		printList( list );
	}
	private static void printList( List<String> list  )
	{
		for( String color : list )
			System.out.printf( "%s" ,color);
		
		System.out.println();
	}//end of printList method
	private static void convertToUpperCase( List<String> list )
	{
		ListIterator<String> iterator = list.listIterator();
		
		String color = null;
		while( iterator.hasNext() )
		{
			color = iterator.next();
			iterator.set( color.toUpperCase() );
		}
	}
	
	private static void printReverse( List<String> list )
	{
		ListIterator<String> iterator = list.listIterator( list.size() );
		
		System.out.println( "\nReverse list..... " );
		
		while( iterator.hasPrevious() )
		{
			System.out.printf( "%s",iterator.previous() );
		}
		
	}
	
	private static void removeColors( List<String> list,int start,int end )
	{
		list.subList( start,end ).clear();
	}
	
	


}