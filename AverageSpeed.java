class Time
{
	private int hours;
	private int seconds;
	private int minutes;
	
	public Time( int h, int sec, int min )
	{
		
		hours = h;
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
			hours = h;
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
			minutes = m;
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
	public int getHours()
	{
		return hours;
	}
	public int getMinutes()
	{
		return minutes;
	}
	
	public String toString()
	{
		
		return String.format( "\n%d:%d:%d\n",getHours(),getMinutes(),getSeconds() );
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
		documentation();
		start();
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
			
			System.out.println("Enter true for input speed and false for continue." );
			
			forDis = MyScanner.Input.nextBoolean();
			
			if( forDis )
			{
				System.out.println( "Enter seconds:" );
					time.setSeconds( MyScanner.Input.nextInt() );

				System.out.println( "Enter minutes:" );
					time.setMinutes( MyScanner.Input.nextInt() );
				
				
				System.out.println( "Enter hourse:" );
					time.setHours( MyScanner.Input.nextInt() );
				
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
				
				if(  time.getMinutes()>0)
				{
					cal = getSpeed()/3600;
					distance = cal*time.getMinutes()*60;
					printResult( distance );
				}
				else if( time.getSeconds()>01 )
				{
					cal = getSpeed()/3600;
					distance =cal*time.getSeconds();
					printResult( distance );
				}
				else if( time.getHours()>0 )
				{
					cal = getSpeed()/3600;
					distance = cal*time.getHours()*3600;
					printResult( distance );
				}
				
			}
			System.out.println( "Enter true for continue." );
			con = MyScanner.Input.nextBoolean();
		}
	}//end of method
	
	public void printResult( double d )
	{
		
		System.out.printf( "\n%2d:%2d:%2d %.2fkm\n",time.getHours(),time.getMinutes(),time.getSeconds(),d );
	}
	public void documentation()
	{
		
		System.out.println("*********************Special notes for this program********");
		System.out.println("This program is written for calculate distance of a car travelled");
		System.out.println("when speedo meter of a car does not work well");
		System.out.println("This program takes speed after some interval of time.. and calculate distance");
		System.out.println("using given time..");
		System.out.println("Press true to continue.");
		boolean flage = false;
		while( !flage )
		{
			flage = MyScanner.Input.nextBoolean();
		}
	
	}
}//end of class..