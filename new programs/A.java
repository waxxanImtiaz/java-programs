public class A
{
 public static void main(String [] args)
	{
	int[][] array=new int[12][12];
	
	int i,j;

	System.out.println("enter numbers:");

		for(i=0; i<12; i++)
			for(j=0; j<12; j++)
			array[i][j]=MyScanner.Input.nextInt();			

	System.out.println("You have entered:");
	
		for(i=0; i<12; i++)
		{
		  System.out.print((i+1)+"  ");
			for(j=0; j<12; j++)
			System.out.print(array[i][j]+" ");
		System.out.println();
		}
		}
}