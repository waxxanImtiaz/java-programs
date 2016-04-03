import java.util.Scanner;
public class public_class
{
  public static void main(String [] args)
	{ 
	 child_class obj=new child_class(12,23);
	System.out.println("before calling an object"); 
	obj.display();
        obj.get();
	System.out.println("after calling mutator function:");
	obj.display();
	
      
	}
}//endof father_class..

class father_class
{
  //declaring data members	
  private int number1;
  private int number2;
  public Scanner input=new Scanner(System.in); 
   public father_class(int numb1, int numb2)
	{
	  number1=numb1;
	  number2=numb2;
        //  child.child_class(numb1,numb2);
	}
   public void get()
	{
	 System.out.println("enter any two numbers:");
         number1=input.nextInt();
	 number2=input.nextInt();
	}
  public void display()
	{
	System.out.println("number1="+number1);
	System.out.println("number2="+number2);
	//child.display();
	}		

}//endof father_class 

class child_class extends father_class
{
   private int number1;
   private int number2;
   public child_class(int numb1, int numb2)
	{
	super(numb1+10,numb2+220);
	 number1=numb1;
	 number2=numb2;
          
	}
   public void get()
	{
	 System.out.println("Child class: enter any two integers:");
	  number1=super.input.nextInt();
	  number2=super.input.nextInt();
       }
   public void display()
	{
	System.out.println("father_class data members:");
	super.display();
 	System.out.println("child_class data members:");
	System.out.println("number1="+number1);
	System.out.println("number2="+number2);
	}
}