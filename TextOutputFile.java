import java.io.*;
public class TextOutputFile
{
	public static void main(String [] args)
	{
	   PrintWriter outputStream=null;
		try
		{
 		outputStream=new PrintWriter(new FileOutputStream("out.txt"));
		}
		catch(FileNotFoundException e)
		{
		System.out.println("Error in opening the file out.txt");
		System.exit(0);
		}//end of catch body
		System.out.println("Enter three lines of text:");
		String line=null;
		for(int count=1; count<=3; count++)
		{
		line=MyScanner.Input.nextLine();
		outputStream.println(count+" "+line);
		}//end of loop body
		
		outputStream.close();
		System.out.println("Those line wre written to out.txt file");
	}
}
