public class TestClass
{
	public static void main(String args[])
	{
	  int x;
	   try{
		System.out.println("Enter any number:");
		x=MyScanner.Input.nextInt();
		if(x==0)
		{
			throw new DivideByZeroException("OoooOopS!");
		}
		else
		{
		System.out.println("ok");
		}
		}//end of try block	
		catch(DivideByZeroException e)
		{
		System.out.println(e.getMessage());
		}
         }
}//end of main Class

class DivideByZeroException extends Exception
{
  public DivideByZeroException()
	{
	super("Divide by zero here");
	}
   public DivideByZeroException(String message)
	{
	super(message);
	}
}