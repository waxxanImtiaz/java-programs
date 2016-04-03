import pack2.Person;
public class Guard extends Person
{
	private String education;
	private double salary;
	
	public Guard()
	{
		setEducation( "" );
		setSalary( 0.0 );
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
	public void setEducation( String ed )
	{
		this.education = ed;
	}
	public String getEducation()
	{
		return this.education;
	}
	public void setSalary( double s )
	{
		salary = s;
	}
	public double getSalary()
	{
		return salary;
	}
	@Override
	public String toString()
	{
		return String.format( "%sEducation:%s\nSalary:%.2f\n",super.toString(),this.getEducation(),this.getSalary() );
	}	
}