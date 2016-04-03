import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;
public class UsingLinkedList
{
	public static void main( String[] args )
	{
		Integer[] array = { 1,2,3,4,5,6,7,655,55 };
		
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList( array ));
		
		list.add(  22 );
		list.addFirst( 33 );
		Collections.sort( list ,Collections.forwardOrder());
		printList( list , "\nList of numbers");
		
		Integer[] array2 = new Integer[ list.size() ];
		
		array2 = list.toArray( new Integer[ list.size() ]  );
		
		
		//printList( list , "\na of numbers");
		/*
		LinkedList<String> list = new LinkedList<String>();
		
		for( String colors: color )
			list.add( colors );
		
		printList( list,"\nlist of colors is " );
		
		LinkedList<String> list2 = new LinkedList<String>();
		
		String[] names = { "Kamran","amjad","Khadim" };
		
		for( String n : names )
			list2.add( n );
		
		printList(  list2,"\nlist of names is " );
		
		list.addAll( list2 );
		
		printList( list,"\nList of colors and names is" );
		
		list.subList( 2,5 ).clear();
		
		printList( list,"\nAfter removing elements from 2 to 5 then list of colors and names is" );
		
		list.addFirst( "rehman" );
		list.addLast( "Imdad" );
		printList( list,"\nList of colors and names is" );
		
	}*/
	}
	public static void printList( LinkedList< Integer > list, String header  )
	{
		System.out.println( header );
		
		for( Integer x : list )
		{
			System.out.printf( "%s ",x );
		}
	}
}