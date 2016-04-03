import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class QuizChamp
{
	
	private int teams;
	private double[] x;
	private double[] y;
	private String[] name;
	private double distance1;
	private double distance2;
	private BufferedReader input;
	private InputStreamReader in;
	public QuizChamp()
	{
		 in= new InputStreamReader(System.in);
		 input = new BufferedReader(in);
		teams = 0;
		name = null;
		start();
	}
	public void setLength( int t, int xl, int yl,int n )
	{
		
		teams = t;
		x = new double[xl];
		y = new double[yl];
		name = new  String[n];
	}
	
	public void start()
	throws java.util.InputMismatchException,IllegalArgumentException
	{
		
		int n;
		double temp = 0.0;
		double dist = 0.0;
		int i;
		boolean flag = true;
		int num = 1;
		while( flag )
		{ 
		        System.out.println( "Enter \"true\" to continue and \"false\" to terminate:" );
	         	flag = MyScanner.Input.nextBoolean();
		  if( flag )
		   {
	          System.out.println( "Enter number of teams:" );
		      n = MyScanner.Input.nextInt();
		      setLength( n,n*2,n*2,n*2 );
		
        	  i = 0;
		
	            getInput();
				dist = cal( x[0],y[0],x[1],y[1] );
				double t;
	        	while( i<teams*2 )
	        	{
				
			     n = i+1;
				
				
			     while( n<teams*2 )
				 {
					temp = cal( x[i],y[i],x[n],y[n] );	 
				 if((temp<dist ))
					 {	
						 dist = temp;
					 }
					 n++;
				 }//end of final inner loop.
				 i++;
		         }//end of 1st inner loop  */
	       }//end of if
		   printResult( dist ,num );
		   num++;
		}//end of outer while loop
	}//end of start function
		
	public void getInput(  )
	
	{
		int i = 0;
		try{
			System.out.println( "Enter "+(name.length)+" of students and distance between their houses." );
			while(i<name.length)
			{
				System.out.println("Name:");
				name[ i ] = input.readLine();
				System.out.println("Distance: ");
				System.out.println("x1:");
				x[ i ] = MyScanner.Input.nextInt();
				System.out.println("y1:");
				y[i] = MyScanner.Input.nextInt();
				i++;
			}
		}catch( IOException e )
		{
			e.printStackTrace();
		}//end of try catch..
		
	}//end of method getInput
	public void printResult( double distance , int count )	
	{
		
		System.out.printf( "Case %d:%.2f\n",count,distance );
	}//end of printResult function
	
	public double cal( double x1, double y1, double x2, double y2 )
	{
			return ( Math.sqrt( (square(x2-x1)+square(y2-y1))));
	}
	public double square(  double x )
	{
		return x*x;
	}
}//end of class...