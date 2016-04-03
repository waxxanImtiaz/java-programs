public class CalculateHypotenuse
{
	public static void main( String[] args )
	{
		double base = 120.122;
		double perpendicular = 233.121122;
		
		System.out.printf( "Hypotenuse of %.2f and %.12f is %.2f ",base,perpendicular,hypotenuse( perpendicular,base) );
	}
	
	public static double hypotenuse( double perpendicular,double base )
	{
		return perpendicular/base;
	}
}