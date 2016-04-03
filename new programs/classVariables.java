import com.imtiaz.wassan.Book;
public class classVariables
{
	public static void main(String [] imtiaz)	
	{
		int[] array={1,2,3,4};
 		int[] list=array;
		Book obj=new Book();
		obj.display();
		array[1]=122;
 	   	if(array==list)
		System.out.println(array[1]);
		else
 		for(int i:list)
	 	System.out.println(i);
	}
}