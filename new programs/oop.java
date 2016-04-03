import java.util.Scanner;
public class oop
{
	public static void main(String [] args)
	{
	 car mycar=new car();
		mycar.input();
		mycar.display();
		int x;
		System.out.printf("enter any number:");
		x=mycar.temp.nextInt();
		System.out.printf("you have entered %d");
	}//endof main function
}//endof main class oop
class car
{
 public int numb1;
 public int numb2,numb3;
 public Scanner temp=new Scanner(System.in);
 public void input()
	{
	 System.out.println("Enter three integers");
	 numb1=temp.nextInt();
         numb2=temp.nextInt();
	 numb3=temp.nextInt();
	}//endof input member function
 public void display()
	{
	System.out.println("you have entered ");
	System.out.println("numb1="+numb1);
	System.out.println("numb2="+numb2);	
	System.out.println("numb3="+numb3);
	}
}//endof class car