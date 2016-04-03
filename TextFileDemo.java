import java.io.*;
public class TextFileDemo
{
	public static void main(String [] args)
	{
	PrintWriter outputStream=null;
	try{
	outputStream=new PrintWriter(new FileOutputStream("out.txt",true));
		
		}
		catch(FileNotFoundException e)
		{
		 System.out.println("File is not found or not created");
		 System.exit(0);
		}//end of catch block	
	    outputStream.println("COmputer System Engineering");
		outputStream.close();
	}
}