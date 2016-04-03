public class SecurityGuard extends Guard
{
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
		education = ed;
	}
	public String getEducation()
	{
		return education;
	}
	public void setSalary( double s )
	{
		salary = s;
	}
	public double getSalary()
	{
		return salary;
	}
	public String toString()
	{
		return String.format( "%s%s\n%.2f\n",super.toString(),getEducation(),getSalary() );
	}	
}