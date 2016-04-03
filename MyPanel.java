import java.awt.*;
import javax.swing.*;

public class MyPanel extends MyFrame
{
	public MyPanel()
	{
		setTitle( "JPanel drawing" );
		//getContentPane().setLayout( new BorderLayout() );
		PaintPanel p = new PaintPanel();
		PaintPanel2 p2 = new PaintPanel2();
		getContentPane().add( p);
		getContentPane().add( p2 );
	}
}
class PaintPanel extends JPanel
{

	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		g.setColor( Color.BLUE );
		
		//drawing inner rectangle..
		g.drawLine( 20,20,100,20 );
		g.drawLine( 20,20,20,100 );
		g.drawLine( 20,100,100,100 );
		g.drawLine( 100,20,100,100 );
		
		//drawing outer rectangle..
		
		g.drawLine( 10,10,80,10 );
		g.drawLine( 10,10,10,80 );
		g.drawLine( 10,80,80,80 );
		g.drawLine( 80,10,80,80 );
		
		//drawLine side lines..
		g.drawLine( 10,10,20,20 );
		g.drawLine( 10,80,20,100 );
		
		g.drawLine( 80,10,100,20 );
		g.drawLine( 80,80,100,100 );
	
	}
}

class PaintPanel2 extends JPanel
{
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		g.setColor( Color.RED );
		g.fillArc( 10,10,50,80,0,180 );
	}
}