import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Sort2
{
	public static void main( String[] args )
	{
		List<CompareToTest> list = new ArrayList<CompareToTest>();
		
		list.add( new CompareToTest( 34 ) );
		list.add( new CompareToTest( 12 ) );
		list.add( new CompareToTest( 1223 ) );
		
		System.out.println( list );
		
		Collections.sort( list,new GenericClassesTest() );
		
		System.out.println( list );
	}
}