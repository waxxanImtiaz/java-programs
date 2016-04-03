import java.util.Scanner;
public class TestCharacter
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner( System.in );
		
		System.out.println("Enter a character and press enter:");
		String input = scanner.next();
		char c = input.charAt(0);
		
		System.out.printf("is defined:%b \n",Character.isDefined(c));
		System.out.printf("is digit:%b \n",Character.isDigit(c));
		System.out.printf("is first character in a java identifier:%b \n",Character.isJavaIdentifierStart(c));
		System.out.printf("is a java identifier:%b \n",Character.isJavaIdentifierPart(c));
		
		System.out.printf("is latter:%b \n",Character.isLatter(c));
		System.out.printf("is upperCase:%b \n",Character.isUpperCase(c));
	
	
	
		
	}
}