import java.util.Random;

public class CreatingWords
{
	
	public static void main( String [] args )
	{
		
		String input;
		
		System.out.println( "Enter any five latter word" );
		input  = MyScanner.Input.nextLine();
		
		Random gen = new Random();
		
		int index1 , index2 , index3;
		
		String[] string = new String[7];
		
		
		for( int i = 0; i< string.length; i++ )
			string[i] = "";
		int i = 0;
		
		do{
				
					index1 = gen.nextInt(5);
					
					string[i] = string[i] + input.charAt( index1 );
					
					
					index2 = gen.nextInt(5);
					
					string[i] = string[i] + input.charAt( index2);
					
					
					index3 = gen.nextInt(5);
					
					string[i] = string[i] + input.charAt( index3 );
					i++;
			
		}while( i<string.length );
	
		for( String temp : string )
			System.out.println( temp );
	}
}