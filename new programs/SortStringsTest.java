class SortStrings
{
	private String[] list = null;
	
	public SortStrings()
	{
		list = new String[10];
		
	}
	public SortStrings( String[] list )
	{
		this.list = list;
	}
	
	public void printString()
	{
		for(String temp : list)
		{
			System.out.print(temp+",");
		}
	}
	public void sort()
	{
		String temp;
		String change;
		
		for( int i=0; i<list.length; i++)
		{
		
			temp = list[i];
			for( int row = i; row<list.length(); row++)
				if( temp.compareTo( list[i])<0 )
				{
					change = temp;
					temp=list
					
				}
		}
	}
}

public class SortStringsTest
{
	public static void main( String[] args )
	{
		String[] list = { "imtiaz","wassan","kamran","amjad","Khadim","Murtaza","Vijay","imdad" };
		SortStrings obj = new SortStrings( list );
		
		obj.printString();
		obj.sort();
		
	}
}