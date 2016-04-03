public class excption
{
  public static void main(String []args)
	{
	 int x;
		System.out.println("Enter any number:");
		x=MyScanner.Input.nextInt();

		if(x<=0)
		throw new exception("number is 0 or less than 0:");
		else
			System.out.println("ok");
	}
}