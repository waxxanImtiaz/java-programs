import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame
{
	public static void main( String [] args )
	{
		ResultManagement frame = new ResultManagement();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setVisible( true );
	}
	public MyFrame( )
	{
		super( "Test Frame" );
		
		setSize( 300,300 );
	}
	public MyFrame( String title )
	{
		super( title );
		setSize( 300,300 );
	}
	
}