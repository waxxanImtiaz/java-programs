import java.util.Scanner;
class k{
 public static void main(String[] args)
{	
	Scanner userInputScanner=new Scanner(System.in);
	      //for taking integer from user
		System.out.println("enter any number");
	      int name=userInputScanner.nextInt();
  		System.out.println("you have entered "+name);
		//for taking string from user
		//System.out.println("enter any name");
		//float flt=userInputScanner.nextFloat();
		//System.out.println("you have entered "+flt);
		//for taking double from user
		System.out.println("double data type:");
		double dbl=userInputScanner.nextDouble();
		System.out.println("you have entered "+dbl);
				}
}

