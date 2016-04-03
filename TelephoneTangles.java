import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class TelephoneTangles
{
	
	private int[] duration;
	private String[] idd;
	
	private String[] localities;
	private double[] price;
	private String[] std;
	private String sub;
	private InputStreamReader in;
	private BufferedReader input;
	public TelephoneTangles()
	{
		in = new InputStreamReader( System.in );
		input = new BufferedReader( in );
		idd = new String[ 2 ];
		localities = new String[ 2 ];
		price = new double[ 2 ];
		std = new String[ 2 ];
		duration = new int[ 2 ];
		
		getIDD();
		getSTD();
		//printIndv();
		check();
	}
	
	public void getIDD( )
	{
		
		int i = 0;
		try{
		while( i<idd.length )
		{
			
			System.out.println( "Enter IDD "+(i+1) );
			idd[ i ] = input.readLine();
			if(!isValidIDD( idd[i] )){
				System.out.println("Invalid idd. Try again");
				System.exit( 1 );
			}
			System.out.println( "Enter locality "+(i+1) );
			localities[i] = input.readLine();
			
			System.out.println( "Enter price "+(i+1) );
			price[i] = MyScanner.Input.nextDouble();
			i++;
		}//end of while loop
		}catch( IOException e )
		{
			e.printStackTrace();
		}//end of try catch
	}//end of getIDD method..
	
	public void getSTD()
	{
		int i = 0;
		try{
		while( i<std.length )
		{
			System.out.println( "Dial number to call "+(i+1) );
			std[i] = input.readLine();
			
			System.out.println( "Enter duration of call:"+(i+1));
			duration[i] = MyScanner.Input.nextInt();
			
			i++;
			
		}
		}catch( IOException e)
		{
			e.printStackTrace();
		}
	}//end of getSTD method
	
	public void check()
	{
		
		int i = 0;
		int j = 0 ;
		boolean flag;
		while(  j<idd.length )
		{
			flag = true;
			while( i<std.length )
			{
			if( std[i].indexOf( idd[j] ) != -1 )
			{
				sub = std[i].substring( std[i].indexOf( idd[j]),std[i].length() ) ;
				System.out.println( " sub = "+sub );	
				flag = false;
				//printResult( std[i],localities[j],sub,duration[i],price[i] );
			}
			i++;
			}
			  if( flag )
				if( (std[i].charAt(0)=='0' )&&( std[i].charAt(1) == '0' ))
				{
					
					//printResult( std[i],"unknown"," ",duration[i],-1.00 );
				}
				else{
					System.out.println( std[i].indexOf( idd[j] ) );
					//printResult( std[i],"Local",std[i],duration[i],0.00 );
				  }
			//}//end of if else
	
//		     }//end of inner while loop
				j++;
    	}//end of outer while loop
	}// end of check method..
	public boolean isValidIDD( String id )
	{
		return id.matches( "\\d{2}+|\\d{3}+|\\d{4}+|\\d{5}+|\\d{6}" );
	}
	public void printResult( String st, String loc,String sub,int dur,double p )
	{
		if( p == -1.00 )
		{
			System.out.printf( "\n%s\t\t%s\t\t\t%d\t\t\t%.2f ", st,loc,dur,-1.00 );
		}
		else
		{
			 if( loc.equals( "Local" ) )
			 {
				 System.out.printf( "\n%s\t\t%s\t\t%s\t\t%d\t\t%.2f\t\t%.2f",st,loc,sub,dur,0.00,0.00 );
			 }
			 else{
				  double totalCost = dur*p/100;
				  double costPerMin = dur*p/1000;
				  
				  System.out.printf( "\n%s\t\t%s\t\t%s\t\t%d\t\t.2f\t\t%.2f\n",st,loc,sub,dur,costPerMin,totalCost );
			 }//end of else if
		}//end of outer else
		
	}//end of printResult method
	public void printIndv(  )
	{
		System.out.println( "Idds" );
		for( String temp : idd )
			System.out.println(temp);
		System.out.println( "stds" );
		for( String temp : std )
			System.out.println(temp);
		/*
		int j;
		System.out.println( "finding idd in std:" );
		for( int i = 0; i<idd.length; i++ )
		{
				j=0;
		while( j<idd.length )
		{
		System.out.printf( "\nIndex of %s in %s is %d ",idd[j],std[i], std[i].indexOf( idd[j] ) );
		j++;
		}
		}*/
	}
}// end of class