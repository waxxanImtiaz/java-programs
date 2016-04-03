import java.io.File;

public class FileDemonstration
{
	public static void main(String [] args)
	{
			System.out.println("Enter file or directory name: ");
			analyzePath( MyScanner.Input.nextLine());
			
	
	}
	
	public static vl=oid analyzePath(  String path )
	{
		
		File name = new File( path );
		
		if( name.exists() )
		{
			
			System.out.printf( "%s",name.getName(),"exists", )
		}
	}
	
}