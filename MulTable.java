import java.awt.*;
import javax.swing.*;

public class MulTable extends MyFrame
{
	public MulTable()
	{
		MyMulTable t = new MyMulTable();
		
		add( t );
	}
}
 class MyMulTable extends JPanel
{
	private int x = 100;
	private int y = 30;
	private String message;
	public MyMulTable()
	{
		message = "Multiplication Table";
		repaint();
	}
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		g.drawString( message,x,y-10 );
		int mul = 1;
		g.drawRect( x-50,y+10,200,200 );
		int a = 1;
		int b = 1;
		x = 50;
		for( int i =1; i<11; i++ )
		{
			
			g.drawString( ""+i,(x),y+5 );
			
			g.drawString( ""+i,(x-10),(y ) );
			
			/*
			for( int j = 1; j<11; j++ )
			{
				mul = i*j;
				g.drawString( ""+mul,( j+x+5) ,( i+y+5 )  );
			}*/
			y = y+20;
			x = x+20;
		}//end of outer loop
	}// end of method paintComponent..
}// end of class..