import java.util.Scanner;
public class LinkedListDemo
{
	private LinkedListClass head;
	private String data;
	
	public LinkedListDemo(  )
	{
		this.data = " ";
		
		head = null;
		
	}
	
	public void insert( String value )
	{
		LinkedListClass current = head;
		LinkedListClass temp;
		if((current == null))
		{
			temp = new LinkedListClass();
			temp.setData( value );
			head = temp;
		
		}
		else
		{
		while( current.next != null )
			current = current.next;
		
		temp = new LinkedListClass();
		temp.setData( value );
		current.next = temp;
		}
	}
	
	public void print( )
	{
		LinkedListClass temp;
		temp = head;
		
		System.out.println( "Linked list is..... " );
		while( temp != null )
		{
			System.out.println("\n"+temp.getData());
			temp = temp.next;
		}
	}
}
