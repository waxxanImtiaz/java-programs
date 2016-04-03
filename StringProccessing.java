public class StringProccessing
{
public static void main(String args[])
	{
		
	char[] temp={'a','b','3','4','5','6','7','8','9','0'};

	int[] array={2,3,4,5,6,45,6};
	int total;	
	
	for(int index:array)
	 index=++index;

	for(int index:array)
	System.out.println(index);	
	}
}