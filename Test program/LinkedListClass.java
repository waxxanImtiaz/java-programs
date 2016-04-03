public class LinkedListClass
{
	public LinkedListClass next;
	private String data;
	
	public LinkedListClass()
	{
		data = "";
		next = null;
	}

	public String getData()
	{
		return data;
	}
	public void setData( String data )
	{
		this.data = data;
	}
	
	public String toString()
	{
		return String.format( "%s ",getData() );
	}
}