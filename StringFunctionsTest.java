class StringClassFunctions
{
	private String[] list;
	
	public StringClassFunctions( String[] getList )
	{
		list = new String[ getList.length ];
		
		list = getList;
	}
	
	public void sortSeperate()
	{
		int i = 0;
		
		while( i<list.length )
		{
			list[i] = sortFunction( list[i] );
			
			i++;
		}
		
	}
	
	public String sortFunction( String temp )
	{
		char[] x = new char[ temp.length() ];
		char a;
		
		int i;
		int j;
		temp.getChars(0,temp.length(), x ,0 );
		for( i = 0; i<x.length; i++ )
		{
			a = x[i];
			for( j = i+1; j<x.length; j++ )
			{
				if( a>x[j] )
				{
					x[i] = x[j];
					x[j] = a;
					a = x[i];
				}
			}
			
		}
		
		temp = new String( x );
		return temp;
	}
	
	public void sort()
	{
		String temp;
		for( int i = 0; i<list.length; i++)
		{
			temp = list[i];
			for( int j = i+1; j<list.length; j++)
			{
				if(temp.charAt(0)>list[j].charAt(0))
				{
					list[i] = list[j];
					list[j] = temp;
					temp = list[i];
				}
			}
		}
	}
	
	public void findString( String target )
	{
		boolean flag = false;
		
		int i = 0;
		while( (i<list.length)&&(flag != true))
			{
				if(target.equalsIgnoreCase(list[i]))
				{
					flag = true;
				}
				i++;
			}
			
			if( flag )
			{
				System.out.printf("%s found at index %d",target,i);
			}
			else
			{
				System.out.printf("%s not found",target);
			}
	}
	public void startWith( String target )
	{
		int i = 0; 
		boolean flag = false;
		
		while( (i<list.length)&&(flag != true) )
		{
			if( list[i].startsWith( target ) )
			{
				flag = true;
			}
		}
		
		if( flag )
			System.out.printf( "%s starts with %s", list[i],target );
		else
			System.out.printf( "NO any string start with %s", target );
		
	}
	public void displayList()
	{
		
		System.out.println( "list is " );
		for( String temp : list )
			System.out.printf("%s,",temp);
	}
}//end of class StringClassFunctions.....

public class StringFunctionsTest
{
	public static void main( String[] args )
	{
		
		String[] list = { "imtiaz","amjad","qasim","qamar","murtaza","asghar" };
		StringClassFunctions obj = new StringClassFunctions( list );
		//obj.sortSeperate();
		obj.sort();
		obj.displayList();
		
		obj.findString( "imt" );
	}
	
}