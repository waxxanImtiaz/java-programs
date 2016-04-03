import java.util.Scanner;
public class QuestionPaper
{
	private String[] questions = { "Q:1) How many provinces of Pakistan?" , "Q:2) Which city is capital of Sindh?","Q:3) Which city is capital of Pakistan?" ,"Q:4) Which is largest country of the world?","Q:5) How many para are in Holy Quran?","Q:6) How many eyes a person have?","Q:7) How many legs a person have?", "Q:8) How many fingers a person have?","Q:9) Who was founder of Pakistan?","Q:10) How many ears a person have?" };
	private String[] answers = { "four","Karachi","Islamabad","China","30","2","2","20","Quad-e-Azam","2" };
	private double result = 0.0;
	private int numOfStudents;
	private boolean[] givenAns = new boolean[10];;
	
	public String getQuestion( int index )
	{
		return questions[ index ];
	}
	public String getAnswer( int index )
	{
		return answers[ index ];
	}
	
	public boolean checkResult( String answer,int index )
	{
		if( answers[ index ].equals( answer ) )
		{
			givenAns[ index ] = true;
			System.out.println( givenAns[ index ] );
			setResult( index );
			return true;
		}
		givenAns[ index ] = false;
		return false;
	}
	public void setResult( int index )
	{
		if( givenAns[ index ] )
		result = result+10.0;
		
	}
	public double getResult()
	{
		return result;
	}
	public void printResult()
	{
		System.out.println( "\nResult of paper:" );
		for( int i = 0; i<10; i++ )
		{
			System.out.println( questions[ i ] );
			System.out.println( givenAns[ i ] );
			
			
		}
			System.out.println( getResult() );
	}
	
	public static void main( String[] args )
	{
		
		int numOfStudents = 1;
		Scanner input = new Scanner( System.in );
		String ans;
		QuestionPaper std1 = new QuestionPaper();
		
		
		for( int i = 0; i<numOfStudents; i++ )
		{
			for( int j = 0; j<10; j++ )
			{
				System.out.println( std1.getQuestion( j ) );
				ans = input.nextLine();
				std1.checkResult( ans,j );
			}
			
			std1.printResult();
		}
		
	}
	
}
