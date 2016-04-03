import java.util.Random;
import java.util.Scanner;
public class SeatReservation
{
	private int[] firstClass = { 1,2,3,4,5 };
	private int[] econClass = { 6,7,8,9,10 };
	private boolean[] firstClassSeats ={ false,false,false,false,false };
	private boolean[] econClassSeats = { false,false,false,false,false };
	private int first = 0;
	private int econ = 0;
	private Random gen = new Random();
	private int x;
	private Scanner input = new Scanner( System.in );
	public void showSeats()
	{
		System.out.printf( "\n%-20s%-25s\n","First Class Seats","Economy Seats" );
		for( int i = 0; i<5; i++ )
		{
			System.out.printf( "%s %d:%s %12s%d:%s","Seat",( i+1 ),(!firstClassSeats[ i ] )? "Empty":"Reserved","Seat ",(i+6),(!econClassSeats[ i ])? "Empty":"Reserved" );
			System.out.println();
		}
	}
	public int firstClassReservation()
	{
		if( first > 5 )
		{
			System.out.println( "Next flight in 3 hours.Press 0 for terminate." ); 
		}
		while( true )
		{
		 x = 1+ gen.nextInt( 6 );
		 if( x<6 )
		if( !firstClassSeats[ x ] )
		{
			System.out.println( x );
			firstClassSeats[ x ] = true;
			first++;
			showPassSeat();
			return x;
		}
	
		}
	}
	
	public int econClassReservation()
	{
		if( econ > 5 )
		{
			System.out.println( "Next flight in 3 hours.Press 0 for terminate." ); 
		}
		
		while( true )
		{
			x = 1+ gen.nextInt( 6 );
			if( x<6 )
			if( !econClassSeats[ x ] )
			{
				System.out.println( x );
			econClassSeats[ x ] = true;
			econ++;
			showPassSeat();
			return x;
			}
		}
		
	}
	public int menu()
	{	
		int choice;
		System.out.println( "Welcome to online seat reservation." );
		System.out.println( "Please type 1 for first class." );
		System.out.println( "Please type 2 for economy class." );
		
		while( true)
		{
			choice = input.nextInt();
			if( choice == 1  )
					return choice;
				else if( choice == 2 )
					return choice;
					else 
						System.out.println( "\nInvalid input please try again." );
				
		}

	}
	public boolean start()
	{
		int choice = menu();
		if( choice == 1 )
			firstClassReservation();
		else
			econClassReservation();
		
		if( choice == 0 )
			return false;
		return true;
		
	}
	public void showPassSeat()
	{
		System.out.println( "Your seat is "+x );
	}
	public static void main( String[] args )
	{
		boolean flag = true;
		SeatReservation obj = new SeatReservation();
		while( flag )
		{
		 flag = obj.start(); 
		 obj.showSeats();
		}
	}
}