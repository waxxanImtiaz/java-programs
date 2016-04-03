public class Marks
{
public int sub1;
public int sub2;
public int sub3;
public void input()
{
System.out.println("Enter marks of subject1:");
sub1=MyScanner.Input.nextInt();

System.out.println("Enter marks of subject2:");
sub2=MyScanner.Input.nextInt();

System.out.println("Enter marks of subject3:");
sub3=MyScanner.Input.nextInt();
}//end of input member function

public int sum()
{
return (sub1+sub2+sub3);
}//endof sum member function

public float average()
{
return (sub1+sub2+sub3)/3;
}//endof average member function
}
