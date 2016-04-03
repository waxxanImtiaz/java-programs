import java.util.Random;

public class TurtleGraphics
{
	private String[][] floor = {{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"},
								{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"},
								{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"},
								{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"},
								{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"},
								{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"},
								{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"},
								{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"},
								{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"},
								{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"},
								{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"},
								{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"},
								{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"},
								{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"},
								{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"},
								{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"},
								{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"},
								{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"},
								{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"},
								{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"},
								};
	private int[] commands = { 1,2,3,4,5,6,9,0,10 };
	private Random generator = new Random();
	private int com;
	
	public String startGame()
	{
		
		
		for( int row = 0; row<floor.length; row++ )
		{
			for( int col = 0; col<floor[ row ].length; col++ )
			{
				com = generator.nextInt( 8 );
				
					if( commands[ com ] == 1 )
						floor[ row ][ col ] = "-";
						
					else if( commands[ com ] == 2 )
						floor[ row ][ col ] = "1";
					else if( commands[ com ] == 3 )
						col++;
					else if( commands[ com ] == 4 )
							col--;
					else if( commands[ com ] == 5 )
					{
						int c ;
						int x = row;
						int temp = 1;
						int y = col;
							for( int r = x; r<floor.length; r++ )
							{
								for( c = y; c<floor[ r ].length; c++ )
								{
									if( temp < 11 )
									{
										floor[ r ][ c ] = "*";
										if( c == 19 )
											{
												if( row != 19 )
												{
													row++;
												
												}
												col = 0;
											}
									temp++;
									}//end of if
									
									if( temp == 11 )
									{
										col = --c;
										c = floor[ row ].length - 1;
										r = floor.length - 1;
										
										
									}
									//temp++;
									y = 0;
								}//end of inner loop
							}//end of outer loop.
					}
					else if( commands[ com ] == 8 )
					{
						//System.out.println( "\nWithin the game call....");
						//showArray();
					}	
					
					else if( commands[ com ] == 0 )
						floor[ row ][ col ] = "a";
				
			}//end of inner loop
		}//end of outer loop
		return " ";
	}//end of function...
	public void showArray()
	{
		for( int row = 0; row<floor.length; row++ )
		{
			System.out.println();
			for( int col = 0; col<floor[ row ].length; col++ )
				System.out.print( floor[row][col]+" " );
			System.out.println();
		}//end of outer loop.
	}//end of showArray method..
	public static void main( String[] args )
	{
		TurtleGraphics obj = new TurtleGraphics();
		obj.startGame();
		System.out.println( "\n Without game call...." );
		obj.showArray();
	}//end of main method..
}//end of class.....