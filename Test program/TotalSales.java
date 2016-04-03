import java.util.Random;
public class TotalSales
{
	private String[][][] salesData = new String[30][4][3];
	private int salesPersonOne = 0;
	private int salesPersonTwo = 0;
	private int salesPersonThree = 0;
	private int salesPersonFour = 0;
	private Random generator = new Random();
	public void check()
	{
		int salesNumber;
		int pNumber;
		int dollarCost;
		for( int i = 0; i<30; i++ )
		{
			for( int j = 0; j<4; j++ )
			{
				for( int k = 0; k<3; k++ )
				{
					if( k == 0 )
					{		
						salesNumber = j+1;
						salesData[ i ][ j ][ k ] =  ""+( salesNumber ) ;
					}
					else
						if( k == 1 )
						{
							pNumber = 1 + generator.nextInt( 6 );
							salesData[ i ][ j ][ k ] = ""+( pNumber );
						}
						else
						{
							dollarCost = 50 + generator.nextInt( 200 );
						salesData[ i ][ j ][ k ] = ""+( dollarCost );
						}
				}
			}
		}
	}
	public void printData()
	{
		System.out.printf( "%20s%20s%20s%20s","Salesperson 1","Salesperson 2","Salesperson 3","Salesperson 4" );
		for( int i = 0; i<30; i++ )
		{	
			System.out.println();
			System.out.printf( "%s","Product: " );
			for( int j = 0; j<4; j++ )
			{	if( j == 0 )
					salesPersonOne = salesPersonOne + Integer.parseInt( salesData[ i ][ j ][ 1 ] );
					else if( j == 1 )
						salesPersonTwo = salesPersonOne + Integer.parseInt( salesData[ i ][ j ][ 1 ] );
						else if( j == 2 )						
							salesPersonThree = salesPersonOne + Integer.parseInt( salesData[ i ][ j ][ 1 ] );
							else
								salesPersonFour = salesPersonOne + Integer.parseInt( salesData[ i ][ j ][ 1 ] );		
						System.out.printf("%20s" ,salesData[ i ][ j ][ 1 ]);
			}
			System.out.println();
		}
		System.out.printf( "%s%4d%20d%20d%20d","Total:",salesPersonOne,salesPersonTwo,salesPersonThree,salesPersonFour );
		
	
	}
	
	public static void main( String[] args )
	{
		TotalSales obj = new TotalSales();
		
		obj.check();
		obj.printData();
	}
}