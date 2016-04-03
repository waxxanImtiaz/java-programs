import java.util.Random;
import java.util.ArrayList;
public class RandomStrings
{
	public static void main( String [] args )
	{
		Random randomNum = new Random();
		
		String[] articles = { " the "," a "," one "," some "," any " };
		String[] nouns = { " boy "," girl "," dog "," town "," car " };
		String[] verbs = { " drove "," jumped "," ran "," walked "," skipped " };
		String[] preposition = { " to "," from "," over "," under "," on " };
		
		int select;
		int index1;
		int index2;
		// ArrayList<String>buffer = new ArrayList<String>();
		String[] string = new String[6];
		boolean flag;
		String s;
		do{
			select = randomNum.nextInt(5);
			index1 = randomNum.nextInt(5);
			index2 = randomNum.nextInt(5);
			
			string[0] = articles[select];
			string[1] = nouns[select] ;
			string[2] = verbs[select];
			string[3] = preposition[select];
			string[4] = articles[index1];
			string[5] = nouns[index2] ;
			
			s = "";
			
			for( int i = 0; i<string.length; i++ )
			{
				
				s=s+string[i];
			
			}
			
			System.out.println("Random sentence is : "+s);
			System.out.println("do you want to try again? Enter \"true\" to continue and \"false\" to terminate:");
			flag = MyScanner.Input.nextBoolean();
				
		
			}while(flag);
			System.out.println("Thanx for playing.");
		}
}