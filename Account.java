public class Account{
	private int accountNumber;
	private String firstName;
	private String lastName;
	private double balance;
	
	public Account( int acn,String fn,String ln,double b )
	{
		
		accountNumber = acn;
		firstName = fn;
		lastName = ln;
		balance = b;
	}//Account Constructor1
	public Account()
	{
		
		this( 0,"","",0.0 );
	}
	
	public void setAccountNumber( int acn )
	{
		accountNumber = acn;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public void setFirstName( String fn )
	{
		firstName = fn;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setLastName( String ln )
	{
		lastName = ln;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setBalance( double b )
	{
		balance = b;
	}
	public double getBalance()
	{
		return balance;
	}
    
}//end of Account class...