import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
public class MyFrameWithExitHandling extends JFrame implements WindowListener {

	
	public static void main( String[] args )
	{
		MyFrameWithExitHandling frame = new MyFrameWithExitHandling( "Test program" );
		frame.setSize( 200,300 );
		frame.center();
		frame.setVisible( true );
	}
	
	public MyFrameWithExitHandling()
	{
		super();
		addWindowListener( this );
	}
	public MyFrameWithExitHandling( String title )
	{
		super( title );
		addWindowListener( this );
	}
	public void center()
	{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		
		Dimension frameSize = this.getSize();
		int x = (screenWidth - frameSize.width);
		int y = (screenHeight - frameSize.height);
		if( x<0 )
		{
			x = 0;
			frameSize.width = screenWidth;
		}
		
			if( y<0 )
			{
				y = 0;
				frameSize.height = screenHeight;
			}
			this.setLocation( x,y );
	}
	public void windowClosed( WindowEvent event )
	{}
	public void windowDeiconified( WindowEvent event )
	{}
	public void windowIconified( WindowEvent event )
	{}
	public void windowActivated( WindowEvent event )
	{}
	public void windowDeactivated( WindowEvent event )
	{}
	public void windowOpened( WindowEvent event )
	{}
	public void windowClosing( WindowEvent event )
	{
		dispose();
		System.exit( 0 );
	}
}


