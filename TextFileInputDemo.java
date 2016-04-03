import java.io.*;
public class TextFileInputDemo
{
	public static void main(String[] args)
	{
	BufferedReader inptStream=null;
	try{
	 inptStream=new BufferedReader(new FileReader("out.txt"));
		
		String line=null;
	//	line=inptStream.readLine();
		char word='\0';	
		while(word!=-1)
		{
		
		// line=inptStream.readLine();
		word=(char)(inptStream.read());
	//	System.out.println(line);
		System.out.println(word);
		}		
		
		}//end of try
		catch(FileNotFoundException e)
		{
		System.out.println("File not found or not opened");
		System.exit(0);
		}//end of catch block
		catch(IOException e)
		{
		System.out.println("error in reading file");
		}				
		//inptStream.close();


		
 	}//end of main function
}//end of main class