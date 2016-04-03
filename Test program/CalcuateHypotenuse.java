public class CalculateHypotenuse
{
	public static void main( String[] args )
	{
		double base = 120.122;
		double perpendicular = 233.122l
		
		System.out.printf( "Hypotenuse of %.2f and %.2f is %.2f ",base,perpendicular,hypotenuse( perpendicular,base) );
	}
	
	public static double hypotenuse( double perpendicular,double base )
	{
		return perpendicular/base;
	}
}