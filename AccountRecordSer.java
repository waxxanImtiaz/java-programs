

import java.io.Serializable;
public class AccountRecordSer implements Serializable
{
	
	private int account;
	private String firstName;
	private String lastName;
	private double balance;
	
	public AccountRecordSer()
	{
		
		this( 0,"","",0.0 );
	}
	public AccountRecordSer( int acct,String first,String last, double bal )
	{
		
		setAccount( acct );
		setFirstName( first );
		setLastName( last );
		setBalance( bal );
	}
	
	
	public void setAccount( int acct )
	{
		
		account = acct;
	}
	public void setFirstName( String first )
	{
		
		firstName = first;
	}
	public void setLastName( String last )
	{
		
		lastName = last;
	}
	public void setBalance( double bal )
	{
		
		balance = bal;
	}
	
	public String getLastName( )
	{
		
		return lastName;
	}
	public String getFirstName( )
	{
		return firstName;
	}
	public int getAccount(  )
	{
		
		return account;
	}
	public double getBalance()
	{
		
		return balance;
	}
}//end of clas