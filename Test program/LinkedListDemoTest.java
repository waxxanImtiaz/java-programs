import java.util.Scanner;

public class LinkedListDemoTest
{
	private  static Scanner input = new Scanner( System.in );
	
	public static void main( String[] args )
	{
		LinkedListDemo obj = new LinkedListDemo();
		
		String name;
		boolean flag = true;
		
		System.out.println( "Enter any name( Enter false for terminate ):" );
		
		while( flag )
		{
			name = input.next();
			
			if( name.equals( "false" ) )
				flag = false;
			else
				obj.insert( name );
		}
		
		obj.print();
	}
	
}