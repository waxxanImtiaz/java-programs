import java.io.*;
public class TextFileInput
{
	public static void main(String [] args)
	{	
		try{
		BufferedReader inputStream=new BufferedReader(new FileReader("out.txt"));
		String temp=null;
 		for(int count=1; count<=3; count++)
		{
		temp=inputStream.readLine();
		if(temp==("1 imtiaz ali wassan"))
		System.out.println(temp);
		else
		 System.out.println("Not found");
		}//end of loop body
		inputStream.close();
		}//end of try block
		catch(FileNotFoundException e)
		{
		System.out.println("File out.txt was not found");
		}// end of catch block
		catch(IOException e)
		{
		System.out.println("Error in reading file out.txt");
		}
	}// end of main function
}//end of main class