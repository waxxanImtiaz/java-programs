package pack1;

public enum Fish
{
	STAR,GUPPY{
		
		public void info()
		{
			System.out.println( " Guppy info " );
		}
	};
	
	public void info()
	{
		System.out.println(  "fishes" );
	}
}