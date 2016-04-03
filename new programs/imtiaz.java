import java.util.Scanner;
public class imtiaz
{
	public static void main(String [] args)
	{
	 	Star myStars=new Star();
		System.out.println("output is ");
		myStars.display();
		System.out.println(myStars.imt);
		//int _=2333;
		//System.out.println(_);
	}//endof main function

}//endof class main class


class Star
{
	public final int imt=122;
	public void display()
	{
	for(int i=1; i<=5; i++)
	{
		for(int j=5; j>=i; j--)
			System.out.print(" ");
			//System.out.println("\n");
			for(int k=1; k<=i; k++)
			  System.out.print("*");
				System.out.println("\n");	 
			}
		}//endof function display........
}//endof class Star