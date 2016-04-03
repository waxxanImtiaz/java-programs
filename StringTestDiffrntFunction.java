class StringFunctions
{	
	public String str;
	
	public StringFunctions()
	{
		str = null;
	}
	public StringFunctions( String str)
	{
		this.str = str;
	}
	public void setString( String str)
	{
		this.str=str;
		
	}
	public String getString(  )
	{
		return str;
	}
	public int findIndexOf( char find )
	{
		
		int i=0;
		try{
		while( i<str.length())
		{
			if( str.charAt(i)==find )
				return i;
				i++;
		
		}
		
		}catch( IllegalArgumentException e )
		{
			
			System.out.println(" invalid argument in findIndexOf function");
			
		}
		return 0;
		
	}
	
	public boolean compareStrings( String target)
	{
				int i=0;
				boolean flag = true;
				while( (i<str.length())&(flag!=false)) 
				{
					if(str.charAt( i )!=target.charAt( i ))
						flag=false;
					i++;
				}
				
				return flag;
	}//end of compareStrings method
	
	public int repeatingChar( char target )
	{
			int count=0;
			
			int loopCounter=0;
			
			
		
			
				try
				{
				while( loopCounter<str.length())
				{
				if( str.charAt( loopCounter )==target)
					count++;
				  loopCounter++;
				}
				}catch( Exception e)
				{
					
					e.printStackTrace();
				}
			
			
			return count;
			
	}
	
	public boolean isUpperCase( char target )
	{
			if( (target>=65)&&(target<=90))
			  return true;
			  
			  return false;
	}
	
	public boolean isLowerCase( char target )
	{
	
			if( (target>=97)&&(target<=122))
			 return true;
			 
			 return false;
	}
	
	public String checkAlpha( char target )
	{
			if( (target>=65)&& (target<=90) )
				return (target+" is capital alphabatical latter.");
				else
					if( (target>=97)&&( target<=122 ) )
					  return (target+" is small alphabatical latter.");
						else
							if( (target>=48)&&( target<=57 ) )
								return (target+" is a number.");
								else
								   return (target+" is a special character.");
					 
					  
	}
	public boolean isDigit( char target )
	{
			if((target>=28)&&(target<=57))
				return true;
				return false;
	}
	
	
}

public class StringTestDiffrntFunction
{
	public static void main(String[] args)
	{
		
			StringFunctions obj = new StringFunctions();
			String name = "hello";
			obj.setString(name);
			
			if(obj.compareStrings("hello"))
				System.out.println("hello is equal to "+obj.getString());
			else
				System.out.println("hello is not equal to "+obj.getString());
			
			System.out.println("index of t is "+obj.findIndexOf('t'));
			int x = obj.repeatingChar( 'i' );
			System.out.println("i is repeating "+x+" times");
			char a='B';
			if(obj.isDigit(a))
				System.out.println( a+" is digit");
			
			if(obj.isLowerCase( a ))
				System.out.println( a+" is lowercase character");
			if(obj.isUpperCase( a ))
				System.out.println( a+" is Uppercase character");
			String check = obj.checkAlpha( 'C');
			
			System.out.println(check);
	}
	
}