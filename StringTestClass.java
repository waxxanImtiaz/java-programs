public class StringTestClass
{
	public static void main(String [] args)
	{
		char[] charArray={'b','i','r','t','h','d','a','y'};
		String s = new String( "hello" );
		String s1=null;
		String s2=null;
		String s3=null;
		String s4=null;	
		try{
		 s1 = new String( );
		 s2 = new String(s);
		 s3 = new String(charArray);
		 s4 = new String( charArray, 6, 2 );
		}catch ( StringIndexOutOfBoundsException e)
		{
			
			System.out.println(e.getMessage());
		}
			StringCompare obj = new StringCompare();
			obj.test();

	//	System.out.printf("s1 = %s\n s2 = %s\n s3 = %s\n s4 = %s ",s1,s2,s3,s4);
		
		
	}
	public  void function()
	{
		String s1 = "hello there";
		char[] charArray = new char[ 5 ];
		
		System.out.printf("s1: length = %d\n",s1.length());
		
		for(int i = s1.length()-1; i>=0; i--)
			System.out.printf("%c ",s1.charAt( i ));
		s1.getChars(0,5,charArray,0);
		
		System.out.println();
		
		for( char a: charArray)
			System.out.printf("%c,",a);
	}
}

class StringCompare extends StringTestClass
{
	public String s1 = new String( "Hello" );
	public String s2 = "goodbye";
	public String s3 = "Happy Birthday";
	public String s4 =  "happy birthday";
	
	public void printString( String s1 , String s2 , String s3 , String s4 )
	{
		System.out.printf("%s\n%s\n%s\n%s\n",s1,s2,s3,s4);
	}
	
	public void test()
	{
		if(s1.equals(" hello "))
			System.out.println("s1 equals to hello");
		else
			System.out.println( "s1 does not equals to hello");
			
		if(s1=="hello")
			System.out.println("s1==hello");
		else
			System.out.println( "s1 != hello");

			if(s3.equalsIgnoreCase( s4 ))
			System.out.printf("%s equals %s with case ignored\n ",s3,s4);
		else
			System.out.println( "s3 does not equals to s4");
		
		if(s1.equals(" hello "))
			System.out.println("s1 equals to hello");
		else
			System.out.println( "s1 does not equals to hello");
	
		if(s1.compareTo( s2 ) ==-1)
			System.out.printf("%s is less than %s\n",s1,s2);
		else if(s1.compareTo( s2 )==0)
			System.out.printf("%s is equal to %s",s1,s2);
		else 
			System.out.printf("%s is greater than %s",s1,s2);
		
		if(s3.regionMatches(0,4, s4,0,5 ))
			System.out.println(  )
		
		super.function();
	}
	
}