import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelProgram extends JFrame
 {
	 public PanelProgram()
	 {
		 super( "Panel Program" );
		 setSize( 500,200 );
	 }
	
	public static void main( String[] args )
	{
				WindowSenser frame = new WindowSenser();
				frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
				frame.setVisible( true );
	}
}

class PanelTest extends PanelProgram
{
	public PanelTest()
	{
		PaintPanelT p = new PaintPanelT( "Welcome to Java " );
		getContentPane().setLayout( new BorderLayout() );
		getContentPane().add( p );
	}
}

class PaintPanelT extends JPanel implements MouseMotionListener
{
	private String message;
	private int x = 10;
	private int y = 10;
	public PaintPanelT( String s )
	{
		message = s;
		this.addMouseMotionListener( this );
		repaint();
	}
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		g.drawString( message,x,y );
	}
	
	public void mouseDragged( MouseEvent e )
	{
		x = e.getX();
		y = e.getY();
		
		repaint();
	}
	public void mouseMoved( MouseEvent e )
	{}
	
}

