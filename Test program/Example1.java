
class genericClass <T,V>
{
	T varT;
	V varV;
	V var;
	genericClass( T varT, V varV )
	{
		this.varT = varT;
		this.varV = varV;
	}
	void printMethod()
	{
		System.out.println( " Class of parameter1:"+varT.getClass().getName()+" and value is "+varT );
		System.out.println( " Class of parameter2:"+varV.getClass().getName()+" and value is "+varV );
		//var = varT + varV;
	}
}
public class Example1
{
	public static void main( String[] args )
	{
		genericClass <String,Integer> object = new genericClass<String,Integer>( "Imtiaz" ,19);
		object.printMethod();
		
	}
}