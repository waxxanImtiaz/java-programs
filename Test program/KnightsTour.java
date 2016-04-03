import java.util.Random;
import java.util.Scanner;
public class KnightsTour
{
	private int[][] chessBoard = { { 0,0,0,0,0,0,0,0 }
								  ,{ 0,0,0,0,0,0,0,0 },
								   { 0,0,0,0,0,0,0,0 },
								   { 0,0,0,0,0,0,0,0 }
								  ,{ 0,0,0,0,0,0,0,0 },
								   { 0,0,0,0,0,0,0,0 },
								   { 0,0,0,0,0,0,0,0 },
								   { 0,0,0,0,0,0,0,0 }};
	private int[] vertical = { -1,-2,-2,-1,1,2,2,1 };
	private int[] horizontal = {2,1,-1,-2,-2,-1,1,2};
	private int tracer = 0;
	private int moveNumber;
	private int currentRow;
	private int currentColumn;
	private Random generator = new Random();
	private Scanner input = new Scanner( System.in );
	
	
	public void knightsTour( int r , int c , int fromR,int fromC )
	{
		if( (r < 0) || ( r >= 8 ) ||( c < 0 ) || ( c >= 8 ) )
		{
			//do nothing..
		}
		else
			if( chessBoard[ r ][ c ] != 0 )
			{
				//if it is visited,then do nothing..
			}
			else if(  chessBoard[ r ][ c ] == 0 )
			{
				
				chessBoard[ r ][ c ] = ++tracer; 
				System.out.println(r +" "+ c + " (visited from " + fromR + ", " + fromC + ")");
				knightsTour( r + 2, c + 1,fromR,fromC );
				knightsTour(r+1, c-2, fromR,fromC );
				knightsTour(r+1, c+2, fromR, fromC );
				knightsTour(r-1, c+2, fromR, fromC );
				knightsTour(r-2, c-1, fromR, fromC );
				knightsTour(r-2, c+1, fromR, fromC );
				knightsTour(r-1, c-2, fromR, fromC );
				knightsTour(r+2, c-1, fromR, fromC ); 
			}
	}
	/*
	public void startGame()
	{
		currentRow = 0;
		currentColumn = 0;
		tracer = 1;
		int cc = 0;
		int cr = 0;
		while( tracer <= 64  )
		{
			//moveNumber = generator.nextInt( 8 );
			
			//System.out.println( " "+moveNumber );
			
			//if( moveNumber > 7 )
				//moveNumber = 0;
			System.out.println(  "Enter choice :" );
			moveNumber = input.nextInt();
			currentRow += vertical[ moveNumber ];
			currentColumn += horizontal[ moveNumber ];
			//System.out.println( " currentColumn = "+currentColumn+" \n" );
			//System.out.println( " currentRow = "+currentRow+" \n" );
		//	System.out.println(arePositive( currentColumn,currentRow ));
			if( currentColumn > 7 )
				currentColumn = horizontal[ moveNumber ];
			if( currentRow > 7 )
				currentRow = vertical[ moveNumber ];
			
			if( arePositive( currentColumn,currentRow ) )
			{
			//	chessBoard[ currentRow ][ currentColumn ] = tracer;
				if(( currentColumn > currentRow )&&( chessBoard[ currentRow  ][ currentColumn ] == 0 ) ) 
				{
					
					if( tracer == 1 )
					{
					chessBoard[ currentRow ][ currentColumn ] = 1;	
					System.out.print(" "+chessBoard[ currentRow ][ currentColumn ]+" "  );
					}
					else
						chessBoard[ currentRow ][ currentColumn ] = tracer;
					
						tracer++;
					
					//System.out.print( tracer+" " );
					//System.out.print( chessBoard[ currentRow + 1 ][ currentColumn ] +"-" );
				}
				else if( chessBoard[ currentRow ][ currentColumn ] == 0 )
				{
					if( tracer == 1 )
					{
					chessBoard[ currentRow ][ currentColumn ] = -1;	
					//System.out.print(" "+chessBoard[ currentRow ][ currentColumn ]+" "  );
					}
					else
						chessBoard[ currentRow ][ currentColumn ] = tracer;
					
					//chessBoard[ currentRow ][ currentColumn ] = tracer;
					
				tracer++;
					
				}
				
				tracer++;
			}
			
			
	
		}//end of loop
		
	}//end of method..
	*/
	public void displayChessBoard()
	{
		System.out.println( "\nThe Chess board" );
		for( currentRow = 0; currentRow < chessBoard.length; currentRow++)
		{
			for( currentColumn = 0; currentColumn < chessBoard[ currentRow ].length; currentColumn++ )
				System.out.print( chessBoard[ currentRow ][ currentColumn ] + " " );
			System.out.println();
		}
		
	}
	public boolean arePositive( int currentColumn, int currentRow )
	{
		if(( currentColumn < 0 ) ||	( currentRow < 0 ) )
			return false;
		else return true;
	}
	public static void main( String[] args )
	{
		KnightsTour obj = new KnightsTour();
		obj.knightsTour( 0,1,0,1 );
		//obj.displayChessBoard();
		//obj.startGame();
		obj.displayChessBoard();
	}
}