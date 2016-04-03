import java.util.Scanner;
class jkl{
 public static void main(String[] args)
{
  	int x;
	int name;
	Scanner user=new Scanner(System.in);  
	System.out.println("ente number of times to print name:");
	x=user.nextInt();	
	System.out.println("you have enterd "+x);
	System.out.println("enter number to be print "+x+" times"); 	
	name=user.nextInt();
	System.out.println("you have entered "+name);
	System.out.println("calling function");	
	func(name,x);
}

public static void func(int name, int x)
{
		while(x>0)
		{
		System.out.print(name);
		x--;
		}
}


}