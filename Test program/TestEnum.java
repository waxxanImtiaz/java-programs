public class TestEnum
{
	public static void main( String[] args )
	{
		Fisher[] f =  Fisher.values();
		for( Fisher b1:f )
		{
			System.out.println(  b1+"..."+b1.getPrice() );
		}
		
	}
}
enum Fisher{
	
	STAR(1),GUPPY( 2 ),KURRRA(3),FLOWER(4);
	int price;
	Fisher( int price )
	{
		this.price = price;
	//	System.out.println( price );
	}
	
	Fisher()
	{
		this.price = 0;
	}
	public int getPrice()
	{
	return price;
	}
	
}

