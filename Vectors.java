import java.util.*;

public class Vectors
{
	public static void main(String[] args)
	{
		Vector v=new Vector(6);
	
		v.addElement("amjad");
		v.addElement("Kamran");
		v.addElement("Ali");
		v.addElement("waxxan");
		v.addElement("imtiaz");
	
		System.out.println("vector values before sorting");
		int i;

		for(i=0; i<v.size(); i++)
		   System.out.print(v.elementAt(i)+" ");
		System.out.println();

		
	}
}