public class CS
{
 	public static void main(String [] args)
	{
	String name="imtiaz";
	int rollNo=19;

	Student object=new Student(rollNo,name);
	object.print();
	object.check();
	}
}

class Student
{
private String name;
private int rollNo;

public Student(int roll,String n)
{
name=n;
rollNo=roll;
}
public void print()
{

System.out.println("roll number="+rollNo);
System.out.println("name="+name);
}
public void check()
{
if(rollNo%2==1)
System.out.println("roll number is odd");
else
System.out.println("roll nmber is even:");
}
}