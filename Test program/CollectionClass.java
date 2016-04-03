import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionClass
{
	public static void main( String[] args )
	{
		String[] colors = { "black","gold","green","blue"};
		
		List<String> list = new ArrayList<String>();
		
		for( String color : colors )
			list.add( color );
		
		System.out.println( "list1 of colors :\n" );
		printList( list );
		
	
		String[] colors2 = { "black","green","violet","white" };
		
		
		List<String> list2 = new ArrayList<String>();
		
		for( String color : colors2 )
			list2.add( color );
		
		System.out.println( "\nlist2 of colors :\n" );
		printList( list2 );
		
		removeColors( list,list2 );
		
		System.out.println( "\nAfter removing list2 from list.....\n the list is:" );
		printList( list );
		
		System.out.println( "\nAnd List2 is:" );
		printList( list2 );
	}
	private static void printList( Collection<String> collection )
	{
		Iterator<String> iterator = collection.iterator();
		
		while( iterator.hasNext() )
		{
			System.out.printf( "%s ",iterator.next() );
		}
	}
	
	private static void removeColors( Collection<String> collection1,Collection<String> collection2 )
	{
		Iterator<String> iterator = collection1.iterator();
		
		while( iterator.hasNext() )
		{
			if( collection2.contains( iterator.next() ) )
				iterator.remove();
		}
	}
	
}