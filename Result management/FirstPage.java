import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FirstPage extends JFrame  implements MouseListener 
{
	private  JList list;
	private final String[] names = { "imtiaz","Kamran" };
	public FirstPage()
	{
		super( "Result Management" );
		
		SetFontsPanel p = new SetFontsPanel();
		add( p );
		this.addMouseListener( this );
		
		
		list = new JList( names );
	
		
	}//end of constructor
	

	public static void main( String [] args )
	{
		FirstPage frame = new FirstPage();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setVisible( true );
		frame.setSize( 900,500 );
	}
	public void mouseClicked( MouseEvent e )
	{
		System.exit( 0 );
		//StartWindow strW = new StartWindow();
		//add( strW );
	}
	public void mouseMoved( MouseEvent e )
	{
			
	}
	public void mouseExited( MouseEvent e )
	{
			
	}
	public void mouseEntered( MouseEvent e )
	{
			
	}
	public void mousePressed( MouseEvent e )
	{
			
	}
	public void mouseReleased( MouseEvent e )
	{
			
	}
	
}

class SetFontsPanel extends JPanel
{
	private Font font;
	private Color color;
	public SetFontsPanel()
	{
			
			repaint();
	}
	
	public void paintComponent( Graphics g )
	{
		font = new Font( "Arial",Font.BOLD,50 );
		color = new Color( 100,200,122 );
		g.setColor( color );
		g.setFont( font );
		
		g.drawString( "Welcome to result management",55,200 );
	}
}

