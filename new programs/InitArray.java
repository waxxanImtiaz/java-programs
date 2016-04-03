public class InitArray
{
	public static void main(String [] args)
	{
	int[][] array1={{1,2,3},{4,5,6}};
	int[][] array2={{1,2,3},{3},{4,5,6}};

	System.out.println("Array1");
	outputArray(array1);

	
	System.out.println("Array2");
	outputArray(array2);
	}

	public static void outputArray(int[][] array)
	{
	for(int row=0; row<array.length; row++)
	{	
		for(int col=0; col<array[row].length; col++)
		{
		System.out.print(array[row][col]+" ");
		}
	}
	}

}