import pack1.Fish;
public class TestPackage
{
	public static void main( String []  args)
	{
		Fish[] f = Fish.values();
		for( Fish b: f )
		{
			b.info();
		}
	}
}
