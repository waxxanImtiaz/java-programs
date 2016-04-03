public class MyTestClass
{
 public static void main(String [] args)
 {
  Complex obj=new Complex();
  //obj.add();
  obj.input();
  obj.add();
  obj.sub();
  obj.mul();
  
 }//end of main function
}

class Simple
{
 public int a;
 public int b;
 public Simple()
 {
 a=b=0;
 }
public void add()
 {
  System.out.println("Addition is "+(a+b));
	 }//end of add function

 public void sub()
 {
 System.out.println("subtraction  is "+(a-b));

 }//end of sub function

 public void mul()
 {
 System.out.println("multipication is "+(a*b));

 }//end of mul function	

 public void input()
 {
 System.out.println("Enter value of a:");
 a=MyScanner.Input.nextInt();
 System.out.println("Enter value of b:");
  b=MyScanner.Input.nextInt();
 }//end of input function
}//end of class Simple


class Complex extends Simple
{

public Complex()
{
  super();
} 
 public void input()
 {
 super.input();
 }//end of input function
 public void add()
  {
   //super.input();   	 

  if((super.a<=0)||(super.b<=0))
   System.out.println("invalid values.");
   else
   super.add();
 }//end of add function
 
 public void sub()
 {
  if((super.a<=0)||(super.b<=0))
   System.out.println("invalid values.");
   else
   super.sub();  
 }//end of function sub
 
 public void mul()
 {
  if((super.a<=0)||(super.b<=0))
   System.out.println("invalid values.");
   else
   super.mul(); 
  }//end of mul function..
}//end of class Complex