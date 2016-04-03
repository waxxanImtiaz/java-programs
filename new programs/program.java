import java.util.Scanner;
public class testCircle
{
   public static void main(String [] args)
	{
		Circle myCircle=new Circle();
		System.out.println("The area of circle of radius " + myCircle.radius
		+ " is " + myCircle.findArea());
		}
}

public class Circle
{
	double radius=1.0;
	double findArea()
	{
	return radius*radius*Math.PI;
		}
}