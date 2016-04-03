import java.util.*;
public class Token
{

public static void main(String [] args)
	{
	StringTokenizer wordFinder=new StringTokenizer("We l.ove Pakistan",".");	
		while(wordFinder.hasMoreTokens())
		System.out.println(wordFinder.nextToken());	
	}
	}