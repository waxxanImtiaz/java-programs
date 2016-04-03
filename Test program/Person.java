package pack2;
public class Person
{
	protected String name;
	private String cast;
	
	public Person()
	{
		setName( " " );
		setCast( " " );
	}
	protected void setName( String name )
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	protected void setCast( String cast )
	{
		this.cast = cast;
	}
	public String getCast()
	{
		return cast;
	}
	
	public String toString()
	{
		return String.format( "Name:%s\nCast:%s\n",getName(),getCast() );
	}
}