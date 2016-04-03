public  class ValidateInput
{
	
	public static boolean validateFirstName( String firstName )
	{
		
	return firstName.matches("([a-zA-Y^Z]+|[a-zA-Z]+\\s[a-zA-Z]+)"  );
	}

	public static void main( String [] args)
	{
		
		String name = "SdadfZ imtiaz";
		
		if(validateFirstName(name))
			System.out.println("your input is ok");
		
		else
			System.out.println("invalid input");
	}
	}
	
