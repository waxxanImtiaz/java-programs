public class Shapes
{
	public static void main(String [] args)
	{
	Box b=new Box(1,4,4);
	Figure f=b;
	f.drawAt(2);
	}
}

abstract class   Figure
{
	private int offset;
	public abstract void drawHere();
	public Figure()
	{
	offset=0;
	}	
	public Figure(int theOffset)
	{
	offset=theOffset;
	}

	public void setOffset(int newOffset)
	{
	offset=newOffset;
	}
	
	public int getOffset()
	{
	return offset;
	}

	public void drawAt(int lineNumber)
	{
	int count;
	for(count=0; count<lineNumber; count++)
		System.out.println();
	drawHere();
	}

	public void drawHere()
	{
	int count;
	for(count=0; count<offset; count++)
		System.out.println(' ');

	System.out.println('*');
	
	}
}//end of class Figure

class Box extends Figure
{
	private int height;
	private int width;

	public Box()
	{
		super();
		height=0;
		width=0;	
	}

	public Box(int theOffset,int theHeigth,int theWidht)
	{
		super(theOffset);
		height=theHeigth;
		width=theWidht;
	}

	public void reset(int newOffset,int newHeigth,int newWidht)
	{
		setOffset(newOffset);
		height=newHeigth;
		width=newWidht;
	}
	
	public void drawHere()
	{
		drawHorizontalLine();
		drawSides();
		drawHorizontalLine();
	}

	public void drawHorizontalLine()
	{
		spaces(getOffset());
		int count;
		for(count=0; count<width; count++)
		   System.out.print('-');
		System.out.println();
	}

	private void drawSides()
	{
		int count;
		for(count=0; count<(height-2); count++)
		    drawOneLineOfSides();
	}

	private void drawOneLineOfSides()
	{
		spaces(getOffset());
		System.out.print('|');
		spaces(width-2);
		System.out.println('|');
	}
	
	private static void spaces(int number)
	{
	         int count;
	  	 for(count=0; count<number; count++)
		     System.out.print(' ');
		
	}
}


