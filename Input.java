public class Input{
	
		public static void main( String [] args )
		{
			AccountClass app = new AccountClass( "Lal","Chand",1,2111.2222 );
			
			//System.out.printf( "%s,%s,%d,%.2f",app.getFirstName(),app.getLastName(),app.getAccount(),app.getBalance() );
			System.out.println( app );
		}
}

class AccountClass
{
	
	private String firstName;
	private String lastName;
	private int account;
	private double balance;
	
	public AccountClass( String firstName,String lastName,int account,double balance )
	{
		setFirstName( firstName );
		setLastName( lastName );
		setBalance( balance );
		setAccount( account );
		
	}
	public void setFirstName( String firstName )
	{
		this.firstName = firstName;
	}
	public void setLastName( String lastName )
	{
		this.lastName = lastName;
	}
	public void setBalance( double balance )
	{
		this.balance = balance;
	}
	public void setAccount( int account )
	{
		this.account = account;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public int getAccount()
	{
		return account;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public String toString()
	{
		return String.format( "\nAccount Number:%d\nFirst Name:%s\nLast Name:%s\nBalance:%.2f",getAccount(),getFirstName(),getLastName(),getBalance() );
	}
}