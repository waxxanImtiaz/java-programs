import pack2.Person;
public class Student extends Person
{
	private int id;
	private String studentClass;
	
	public Student()
	{
		setId( 0 );
		setStudentClass( " " );
	}
	public void setName( String name )
	{
		super.setName(name);
	}
	public String getName()
	{
		return super.getName();
	}
	public void setCast( String cast )
	{
		super.setCast(cast);
	}
	public String getCast()
	{
		return super.getCast();
	}
	public void setId( int id )
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setStudentClass( String c )
	{
		studentClass = c;
	}
	public String getStudentClass()
	{
		return studentClass;
	}
	public String toString()
	{
		return String.format( "%sId:%d\nClass:%s",super.toString(),id,studentClass );
	}
}