import java.util.StringTokenizer;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MorseToEnglish
{
	private ArrayList<String> buffer = new ArrayList<String>();
	private ArrayList<String> buffer1 = new ArrayList<String>();
	private	InputStreamReader in;
    private BufferedReader input;
		

	 
	private int y;

	public MorseToEnglish()
	{
	  in= new InputStreamReader(System.in);
     input = new BufferedReader(in);
	 getInput();

		
	}
	public void getInput()
	{
		String getStart;
		getStart = " ";
		documentation();
		while( !getStart.equals( "Ok" ) )
		{
			getStart = MyScanner.Input.nextLine();
		}
		String temp;
		y = 0;
		System.out.println( "Enter only one MorseCode per line : and enter -1 to terminate:" );
		temp = "";
		try{
			
	     	
		while(!temp.equals("-1"))
		{
			temp = input.readLine();
			
			
			if( !temp.equals( "-1" )  )
			{
				System.out.printf("\ntemp:%s\n",temp);
				buffer.add(y, temp );
			}
			
			y++;
		}
		y--;
		if(y==0)
		{
			
			System.out.println(" Ok thanks... ");
			System.exit( 1 );
		}
		else{
		printBuffer( buffer );
		
		 start();
		}
		}catch (IOException io) {
		      io.printStackTrace();
        }
	}
	
	
  public void start()
  {
	 
	  int count;
	  System.out.println( "Enter number of Inputs for one String in MorseCode(e.g 1,2,3....):" );
	  count = MyScanner.Input.nextInt();
	
	  String temp;
	  System.out.println( "Enter Morse codes(e.g .-. ... ---):" );
	  try{
	  for( int i = 0; i<count; i++ )
	  {
		  
		  temp = input.readLine();
		    buffer1.add(i,temp);
		  
		
		}
	  }catch( IOException sc )
	  {
		  
		  sc.printStackTrace();
	  }

	  
	  String[] english = new String[ count ];
	  int j;
	  String t;
	  for( int i = 0; i<count; i++ )
	  {
		  temp = buffer1.get( i );
		  english[i] = "";
		  String[] tokens = temp.split( " " );
			
		  
		  
			  t = change( tokens );
		  english[i] = english[i] + t;
		 
		  
		System.out.printf( "\nMessage #%d\n:%s",i+1,english[i] );

	  }
	    }//end of function
  
  public String change( String[] tokens  )
  {
	  String temp = "" ;
	  int j;
	  char c ;
	  for( int i =0; i<tokens.length; i++ )
	  {
		  j = 0;
		  c = 'A';
		  while( j<buffer.size()  )
		  {
		  if( tokens[i].equals( buffer.get(j) ) )
		  {
			  temp = temp+ c;
			 
			  j=buffer.size();
			  break;
			
		  
		  }
		  
		  c++;
			j++;
		  }
			
		  
	  }
	  return temp;
  }
  
  public void printBuffer( ArrayList<String> items )
  {
	  
	  int i = 0;
	  System.out.println( "You have entered following MorseCodes:" );
	  while(i<items.size())
	  {
		  System.out.printf("\n%s ",items.get( i ));
	  i++;
	  }
  }
	public void documentation()
	{
		
		System.out.println( "**********Important Notes About this program********************" );
		System.out.println( "This is Morse code program: In this program I have not used filling" );
		System.out.println( "user of this program first have to input of morse codes." );
		System.out.println( "Then he or she can see output of morsce codes entered by him or her." );
		System.out.println( "Press Ok to continue:" );
		
	}
}