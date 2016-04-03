public class TestInstance
{
	public static void main( String[] args)
	{
		try{
			Object o = Class.forName( args[0] ).newInstance();
			System.out.println( "Object created for:"+o.getClass().getName() );
		}catch( InstantiationException e )
		{
			e.printStackTrace();
		}
		 catch( Exception e )
		 {
			 e.printStackTrace();
		 }
		//	o.printName();
	}
}