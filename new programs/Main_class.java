public class Main_class
{
	public static void main(String [] args)
	{
		
	    int[] list=new int[]{23,12,43,211,57,34,23,64,34,43};
	   base_class obj=new base_class();
		System.out.println("before sort array is ");
		obj.display(list);
		System.out.println("\nafter sort array is ");
		obj.sort(list);
		obj.display(list);
	}//end of main function	
}//end of main class

class base_class
{
   public void sort(int[] list)
	{
	 int temp,i;
		for(int j=0; j<list.length; j++)
			{
			 for(i=1; i<list.length; i++)
				{
				  if(list[j]<list[i])
					{
					temp=list[i];
					list[i]=list[j];
					list[j]=temp;
					}//end of if 	
				}//endof inner for loop
			}//end of outer for loop...
	}//endof sort function....
     public void display(int[] list)
	{
		int j;
		for(j=0; j<list.length; j++)
		    System.out.print(list[j]+" ");
	}		
}