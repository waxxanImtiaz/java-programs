class selectionSort
{

	public void sort(int[] x)
	{
		int temp;
	
		for(int i=0; i<x.length; i++)
		{
			temp=x[i];
			for(int j=i+1; j<x.length; j++)
			{
			if(temp>x[j])
			temp=x[j];
			}
			x[i]=temp;
		}
	
	}
	public void show(int[] x)
	{
	for(int i=0; i<x.length; i++)
	{
	System.out.print(x[i]+" ");
	}
	}
}

public class Sorting
{
 public static void main(String[] args)
	{
	selectionSort obj=new selectionSort();
	int[] list={3,2,43,5,6,5,7,6,8,6};
	System.out.print("before sorting list is ");
	obj.show(list);
	obj.sort(list);
	System.out.println("after sorting list is ");
	obj.show(list);
	}
}