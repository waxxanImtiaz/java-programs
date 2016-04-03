public class excption
{
  public static void main(String []args)
	{
	 int x;
		System.out.println("Enter any number:");
		x=MyScanner.Input.nextInt();
		try{
		if(x<=0)
		throw e= new Exception("number is 0 or less than 0:");
		else
			System.out.println("ok");
		}//end of try 
		catch( Exception e)
		{
		System.out.println(e.getMessage());
	}
		}
}