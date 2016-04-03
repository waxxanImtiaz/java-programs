import java.util.ArrayList;

public class ArrayListTest
{
	private ArrayList< String > items;
	
	public ArrayListTest( ArrayList<String> items )
	{
		this.items = items;
	}
	public void demo()
	{
		items.add( "Green" );
		items.add(  "Yellow" );
		items.add( "Pink" );
		items.add( "Red" );
		items.add( "Blue" );
		
		System.out.println( "ArrayList after insertion of elements" );
		for( int i = 0; i<items.size(); i++ )
			System.out.printf( "%s\n",items.get( i ));
		
		items.add( 3,"Cyan");
		items.add( 6,"Black" );
		
		display( items," after adding items are " );
		
		System.out.println( "Index of Cyan is "+items.indexOf( "Cyan" ) );
		
		System.out.println( "\'Red\' is in the list %b",( items.contains( "Red" ) )? true:false );
		items.trimToSize();
		
		display( items ,"Items after trimToSize");
		items.clear();
		display( items,"Items after clear method" );
	}
	public void display( ArrayList<String> i ,String header)
	{
		System.out.println( header );
		for( String x: i )
			System.out.println( x );
	}
}