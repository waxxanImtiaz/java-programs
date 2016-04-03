public class inherit
{
  public static void main(String [] args)
	{
	 record obj=new record();
	obj.first_name="imtiaz";
	obj.last_name=" wassan";
	System.out.println("first name="+obj.first_name); 
	System.out.println("last name="+obj.last_name);
	}
}
class record
{
  public String first_name;
  public String last_name;
	
}