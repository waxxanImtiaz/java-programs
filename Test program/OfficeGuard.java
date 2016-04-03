public class OfficeGuard extends Guard
{
	private String shift;
	
	public OfficeGuard()
	{
		setShift( "" );
	}
	public void setShift( String s )
	{
		shift = s;
	}
	public String getShift()
	{
		return shift;
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
		super.setEducation( ed );
	}
	public String getEducation()
	{
		return super.getEducation();
	}
	public void setSalary( double s )
	{
		super.setSalary( s );
	}
	public double getSalary()
	{
		return super.getSalary();
	}
	@Override
	public String toString()
	{
		return String.format( "%sShift:%s\n",super.toString(),shift );
	}
	
}