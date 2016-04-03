import java.util.Arrays;
import java.util.LinkedList;

public class UsingToArray
{
	public static void main( String[] args ) 
	{
		String[] colors = { "black","blue","white","imtiaz","wassan","kamran" };
		
		LinkedList<String> links = new LinkedList<String>(Arrays.asList( colors ));
		
		links.addLast( "yellow" );
		links.add( "red" );
		links.add( 3,"green" );
		links.add( 5,"pink" );
		links.addFirst( "dark" );
		links.addFirst( "cyan" );
		
		colors = links.toArray( new String[ links.size() ] );
		
		
		System.out.println( "list of colors is......" );
		for( String color : links )
			System.out.printf( "%s ",color );
		
	}
}