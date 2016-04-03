import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JApplet;

public class ImageMap extends JApplet
{
	private ImageIcon mapImage;
	
	private static final String captions[] = { "common programming error","Good Programming Practice","Look-And-Feel Observation","Performance Tip","Portability Tip","Software Engineering Observation","Error-Prevention Tip" };
	
	public void init()
	{
		addMouseListener( new MouseAdapter()
		{
				public void mouseExited( MouseEvent e )
				{
					showStatus( "Pointer outside applet" );
				}
				
		}		
		);
		
		addMouseMotionListener( 
		new MouseMotionAdapter()
		{
			public void mouseMoved( MouseEvent e )
			{
				showStatus( translateLocation( e.getX(),e.getY() ) );
			}
		}
		);
		
		mapImage = new ImageIcon( " new.jpg" );
	}
	
	public void paint( Graphics g )
	{
		super.paint( g );
		mapImage.paintIcon(  this,g,0,0 );
	}
	
	
	public String translateLocation( int x,int y )
	{
		if( x>=mapImage.getIconWidth() || y>= mapImage.getIconHeight() )
			return "";
		
		double iconWidth = ( double ) mapImage.getIconWidth()/7.0;
		int iconNumber = ( int )((double)x / iconWidth);
		
		return captions[ iconNumber ];
			
	}
}