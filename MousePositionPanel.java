import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MousePositionPanel extends MyFrame
{
	public MousePositionPanel()
	{
	
		MousePanel p = new MousePanel();
		this.addMouseListener( p );
		
		
		getContentPane().add( p );
		
	}//end of constructor..
}//end of class


class MousePanel extends JPanel  implements MouseListener
{
	private int x = 0;
	private int y = 0;
	
	public void mouseClicked( MouseEvent e )
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
	{
	
	}
	public void mouseDragged( MouseEvent e )
	{
		
	
	}
	
	public void mousePressed( MouseEvent e )
	{
		x = e.getX();
		y = e.getY();
		repaint();
	}
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		g.drawString( String.format( "(%d,%d)" ,x,y),x,y );
	}//end of method paintComponent..
}//end of class MousePanel...