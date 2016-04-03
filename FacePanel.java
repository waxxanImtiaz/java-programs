import java.awt.*;
import javax.swing.*;

public class FacePanel extends MyFrame
{
	public FacePanel()
	{
		setTitle( "Face Drawing" );
		
		MyFacePanel p = new MyFacePanel();
		
		getContentPane().add( p );
	}
}

class MyFacePanel extends JPanel 
{
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		g.setColor( Color.BLUE );
		
		//drawing circle..
		g.drawArc( 50,50,150,150,0,360 );
		//drawing left eye
		g.drawArc( 80,90,30,30,0,360 );
		//drawing right eye..
		g.drawArc( 140,90,30,30,0,360 );
		
		//drawing nose
		g.drawLine( (80+140)/2,90,110,(80+140)/2);
	}
}