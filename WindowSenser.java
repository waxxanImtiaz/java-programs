import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowSenser extends MyFrame implements MouseListener
{
	private JTextArea text;
	
	
	public WindowSenser( )
	{
		super( "Window Senser" );
		text = new JTextArea();
		getContentPane().setLayout( new BorderLayout(  ) );
		//text.setEditible( false );
		add( text,BorderLayout.SOUTH );
		this.addMouseListener( this );
	}
	
	public void mousePressed( MouseEvent e )
	{
		
	}
	public void mouseReleased( MouseEvent e )
	{
	}
	public void mouseClicked( MouseEvent e )
	{
		text.setText( String.format( " Clicked at [ %d,%d ] ",e.getX(),e.getY() ) );
	}
	public void mouseExited( MouseEvent e )
	{
		text.setText( String.format( "Mouse Exited at [ %d,%d ]" ,e.getX(),e.getY()) );
		getContentPane().setBackground( Color.BLUE );
	}
	public void mouseEntered( MouseEvent e  )
	{
		text.setText( String.format( "Mouse entered at [%d,%d]",e.getX(),e.getY() ) );
		getContentPane().setBackground( Color.GREEN );
	}
	
}