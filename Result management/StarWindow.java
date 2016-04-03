import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StartWindow extends JFrame
{
	//private JList dptList;
	//private JLabel batch,rollNumber;
//	private JList semList;
	//private String[] deprts = { "Computer System Engineering","Telecomunication" };
 	public StartWindow()
	{
	
		//setLayout( null );
		//setTitle( "Insert data" );
		
	
		
	}
	public static void main( String [] args )
	{
		StartWindow frame = new StartWindow();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setVisible( true );
		frame.setSize( 900,500 );
	}
}