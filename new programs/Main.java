public class Main
{
 public static void main(String []args)
	{
	Student first=new Student(12,"Imtiaz Wassan","PIA township",12,99);
	
	first.display();
	first.input();
	first.display();
	}
}
 class Person
{
private int id;
private String name;
private String address;
public Person(int idNo,String n,String add)
{
	id=idNo;
	name=n;
	address=add;
}//end of constructor
public  void input()
{

	
	System.out.println("enter your name:");
	name=MyScanner.Input.nextLine();
	
	System.out.println("enter your Address:");
	address=MyScanner.Input.nextLine();

	System.out.println("enter your id:");
	id=MyScanner.Input.nextInt();

	

}//endof input function

public void display()
{
	System.out.println("Id="+id);
	System.out.println("name="+name);
	System.out.println("address="+address);
}//endof display function
}//endof class Person

 class Student extends Person
{
private int rollNo;
private int marks;
public Student(int id,String name,String add,int roll,int mrks)
{
super(id,name,add);
rollNo=roll;
marks=mrks;
}
public void input()
{
 super.input();
 
 System.out.println("Enter your marks:");
 marks=MyScanner.Input.nextInt();

 System.out.println("Enter your roll number:");
 rollNo=MyScanner.Input.nextInt();	
}//endof input 
public void display()
{
 super.display();
 System.out.println("your roll number is "+rollNo);
 System.out.println("your marks are "+marks);
}//endof display function
}