import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class RegexMatches
{
	public static void main( String[] args )
	{
		
		Pattern expression = Pattern.compile( "((\\w)=(\\d+))") ;
		String input = "a=b=4.";
		Matcher m = expression.matcher( input );
		System.out.println( m.groupCount() );
	
		ArrayList<String> in = new ArrayList<String>();
		while( m.find() )
		{
			System.out.println("Found a "+m.group()+"."+in.add( m.group() ));
		
		}
		
	}
}