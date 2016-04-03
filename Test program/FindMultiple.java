public class FindMultiple
{
	public static void main( String[] args )
	{
		int num = 3;
		int multiple = 45;
		System.out.printf( "%d is %s multiple of %d",num,(isMultiple( num,multiple ))? "":"not",multiple );
	}
	
	public static boolean isMultiple( int num1,int multiple )
	{
		if( num1/multiple == 0 )
			return true;
		else return false;
		
	}
}