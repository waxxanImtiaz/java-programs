public class PrimeNumber {

  /**
 * @param args
 */
public static void main(String [] args)
  {
	int number;  
	if(args.length!=1)
		System.out.printf("Please enter a single number");
	 number=Integer.parseInt(args[0]);
	  Number objNumber=new Number();
	  
	    objNumber.isPrime(number);
  }
	
}

class Number
{
	private int number;
	
	public void setNumber(int num)
	{
		number=num;
	}
	public boolean checkNumber(int num)
	{
		boolean flag=true;
		 
		setNumber(num);
		 
			if(number==1)
				  flag=true;
			else 
				if(number==2)
					 flag=true;
				else
				{
					int i;
					for(i=2; i<number; i++)
					{
						
						if(number%i==0)
							flag=false;
					}
					
				}//end of else statement...
				
		return flag;
	}//end of function checkNumber..
	public void isPrime(int num)
	{
		boolean check;
		check=checkNumber(num);
		if(check)
		 System.out.printf("%s",toString());
		else
			System.out.printf("%d is not prime",number);
			   
			
			
	}
	@Override
	public String toString()
	{
		return String.format("%d is prime",number);
	}
}
