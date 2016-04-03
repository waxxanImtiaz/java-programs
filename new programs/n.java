import java.util.Scanner;
public class n
{
   public static void main(String [] args)
	{
 	 Array obj=new Array();
	obj.input();
	obj.print();
	}
}

class Array
{
  private int[] array=new int[4];
  public Scanner i=new Scanner(System.in);
	public void input()
	{
	
	for(int x=0; x<4; x++)
	{
	System.out.println("\nenter any number:");
	array[x]=i.nextInt();
	}
	}
	public void print()
	{
	System.out.println("you have entered:");
	for(int i=0; i<4; i++)
	System.out.println(array[i]);		
	
	}	
}