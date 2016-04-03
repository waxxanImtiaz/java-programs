import java.util.StringTokenizer;

public class PigLatin
{
	
	public static void main( String [] args )
	{
		
		String sentence;
		
		System.out.println( "Enter any sentence" );
		sentence = MyScanner.Input.nextLine();
		
		String[] tokens = sentence.split( " " );
		
		System.out.printf( " Length of tokens is %d\n", tokens.length );
		
		printWord( tokens,"English language tokens are:" );
		
		
		char y;
		StringBuilder buffer;
		//String get;
		for( int i = 0; i<tokens.length; i++ )
		{
			buffer = new StringBuilder( tokens[i] );
			
			y = buffer.charAt( 0 );
			
			buffer.deleteCharAt( 0 );
		
			tokens[i] = buffer.toString()+y+"ay";
		}
		
		printWord( tokens,"Latin" );
	}
	
	public static void printWord( String [] tokens , String x )
	{
		
		System.out.printf( "The %s words are  ",x);
		
		for( String y : tokens )
			System.out.println( y );
	}
}//end of class