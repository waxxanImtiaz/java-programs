public class Time
{
	private int hourse;
	private int seconds;
	private int minutes;
	
	public Time( int h, int sec, int min )
	{
		
		hourse = h;
		seconds = sec;
		minutes = min;
	}
	
	public Time()
	{
		
		this( 00,00,00 );
	}
	
	public void setHours( int h )
	{
		
		if( h>=00 )
		{
			hourse = h;
		}
		else 
		{
			System.out.println(" Hourse time is not valid. ");
			System.exit( 1 );
		}
		
	}
	
	public void setMinutes( int m )
	{
		
		if( m>=00 )
		{
			minutes = min;
		}
		else 
		{
			System.out.println(" Minutes time is not valid. ");
			System.exit( 1 );
		}
		
	}
	public void setSeconds( int s )
	{
		
		if( s>=00 )
		{
			seconds = s;
		}
		else 
		{
			System.out.println(" Seconds time is not valid. ");
			System.exit( 1 );
		}
		
	}
	
		
	public int getSeconds()
	{
		return seconds;
	}
	public int getHourse()
	{
		return hourse;
	}
	public int getMinutes()
	{
		return minutes;
	}
	
	public String toString()
	{
		
		return String.format( "\n%d:%d:%d\n",hourse,minutes,seconds );
	}
}//end of Time class


class AverageSpeed
{
	
	private Time time;
	
	private double distance;
	
	private double cal;
	
	public double speed;
	
	public AverageSpeed()
	{
		
		time = new Time();
		distance = 0.0;
		speed = 0.0;
	}
	
	public void setSpeed( double s )
	{
		
		if( s>=0.0 )
		{
			speed = s;
		}
		else
			System.out.println( "Invalid speed." );
	}
	
	public double getSpeed( )
	{
		
		return speed;
	}
	
	public void start()
	{
		
		boolean con = true;
		
		boolean forDis = false;
		
		while( con )
		{
			
			System.out.println("Enter true for input speed." );
			
			forDis = MyScanner.Input.nextBoolean();
			
			if( forDis )
			{
				System.out.println( "Enter seconds:" );
					time.setSeconds( MyScanner.Input.nextInt() );

				System.out.println( "Enter minutes:" );
					time.setMinutes( MyScanner.Input.nextInt() );
				
				
				System.out.println( "Enter hourse:" );
					time.setHourse( MyScanner.Input.nextInt() );
				
				System.out.println( "Enter Speed:" );
					setSpeed( MyScanner.Input.nextInt() );
			}
			else
			{
				System.out.println( "Enter hourse:" );
				time.setHours( MyScanner.Input.nextInt() );
				System.out.println( "Enter minutes:" );
				time.setMinutes( MyScanner.Input.nextInt() );
				System.out.println( "Enter seconds:" );
				time.setSeconds( MyScanner.Input.nextInt() );
				
				if(  getMinutes()>0)
				{
					cal = getSpeed()/3600;
					distance = cal*getMinutes()*60;
					printResult( distance );
				}
				else if( getSeconds()>01 )
				{
					cal = getSpeed()/3600;
					distance =cal*getSeconds();
					printResult( distance );
				}
				else if( getHourse()>0 )
				{
					cal = getSpeed()/3600;
					distance = cal*getHourse()*3600;
					printResult( distance );
				}
				
			}
			System.out.println( "Enter true for continue." );
			con = MyScanner.Input.nextBoolean();
	}//end of method
	
	public void printResult( double d )
	{
		
		System.out.printf( "\n%d:%d:%d %.2f",getHourse(),getMinutes(),getSeconds(),d );
	}
}//end of class..