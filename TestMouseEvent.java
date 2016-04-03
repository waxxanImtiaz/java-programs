import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class TestMouseEvent extends MyFrameWithExitHandling implements MouseListener
{
	private int x,y = 0;
	private int x1 = 20,y1 = 100;
	
	public TestMouseEvent()
	{
		setTitle( "TestMouseEvent" );
		addMouseListener( this );
	}
	public static void main( String[] args )
	{
		TestMouseEvent frame = new TestMouseEvent();
		frame.setSize( 300,200 );
		frame.setVisible( true );
	}
	
	public void mousePressed( MouseEvent e )
	{
		x = e.getX();
		y = e.getY();
		
		repaint();
	}
	
	public void mouseReleased( MouseEvent e )
	{}
	public void mouseExited( MouseEvent e )
	{}
	public void mouseEntered( MouseEvent e )
	{}
	public void mouseClicked( MouseEvent e )
	{
		repaint();
	}
	public void mouseDraged( MouseEvent e )
	{
		
	}
	public void paint( Graphics g )
	{
		g.fillRect( x-5,y-5,10,10 );
		g.drawLine( x,y,x1,y1 );
	}
	
}