public class MyProgram
{
public static void main(String args[])
	{
	Circle myCircle=new Circle();

	myCircle.get_radius();

	myCircle.circum();
	}
}//endof main class

class Circle
{

public double radius;

public void get_radius()
{
System.out.println("Enter radius of circle:");
radius=MyScanner.Input.nextDouble();

System.out.println("You have entered:"+radius);
}//end 

public void circum()
{

double cir=2*3.142*radius;

System.out.println("Circumferrence is "+cir);
}
}