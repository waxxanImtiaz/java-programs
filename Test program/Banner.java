import java.applet.Applet;
import javax.swing.*;
import java.awt.Graphics;
public class Banner extends Applet implements Runnable
{
	String s = "Welcome to Banner Program";
	Thread t;
	public void start()
	{
	   if( t == null )
		{
			t = new Thread(  );
			t.start();
		}
		
	}
	public void stop()
	{
		if( t != null )
		{
			t.stop();
		}
	}
	public void paint( Graphics g )
	{
		g.drawString( s,10,50 );
	}
	public void run()
	{
		char ch;
		while( true )
		{
			ch = s.charAt( 0 );
			s = s.substring( 1,s.length() );
			s += ch;
			
			repaint();
			
			try{
				Thread.sleep( 2000 );
				
			}catch( InterruptedException e )
			{
				
			}
		}
	}
}