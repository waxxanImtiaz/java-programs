import java.util.Comparator;

public class GenericClassesTest implements Comparator< CompareToTest > 
{
	
	public int compare( CompareToTest t1,CompareToTest t2 )
	{
			if( t1.getNumber()>t2.getNumber() )
				return t1.getNumber();
			else
				return t2.getNumber();
	}
	
	public static void main( String[] args )
	{
		GenericClassesTest obj = new GenericClassesTest();
		CompareToTest t1 = new CompareToTest( 3 );
		t1.setNumber( 1 );
		
		CompareToTest t2 = new CompareToTest( 34 );
		t2.setNumber( 4 );
		
		System.out.println(obj.compare( t1,t2 ));
	}
}