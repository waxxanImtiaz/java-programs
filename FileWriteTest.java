import java.io.*;

public class FileWriteTest
{
	private String fileName = " imtiaz.txt ";
	private InputStreamReader in = new InputStreamReader( System.in );
	private BufferedReader input = new BufferedReader( in );
	
	public static void main( String[] args )
	{
		try{
			FileWriter fileWriter = new FileWriter( fileName );
			
				BufferedWriter bufferedWritter = new BufferedWriter( fileName );
				String name = "";
				System.out.println( "Enter a sentence:" );
				while( !name.equals( "-1" ) )
				{
				  name = input.readLine();
				  bufferedWritter.write( name );
				  bufferedWritter.newLine();
				}
			}catch( FileNotFoundException e )
			{
				e.printStackTrace();
			}
			catch( IOException e )
			{
				e.printStackTrace();
			}
			
			
			bufferedWritter.close();
	}
}

