public class MainClass
{

public static void main(String args[])
	{
	Test obj=new Test();
	obj.input();
	obj.display();
	}

}

class Test
{
public int x;
public void input()
{
System.out.println("Please Enter any number:");
x=MyScanner.Input.nextInt();
}
public void display()
{
 System.out.println("You have Entered:");
 System.out.println(x);
}
}