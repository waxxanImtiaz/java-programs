import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TrafficLights extends JFrame implements ItemListener
{
	private JRadioButton rButton,yButton,gButton;
	private ButtonGroup group;
	private Lights light;
	private JPanel p1,p2;
	
	public static void main( String [] args )
	{
		TrafficLights  frame = new TrafficLights();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setSize( 200,300 );
		frame.setVisible( true );
	}
	
	public TrafficLights()
	{
		setTitle( "Traffic Lights" );
		
		p1 = new JPanel();
		p2 = new JPanel();
		light = new Lights();
		group = new ButtonGroup();
		
		p1.add( rButton = new JRadioButton( "Red",false ) );
		p1.add( yButton = new JRadioButton( "Yellow",false ) );
		p1.add( gButton = new JRadioButton( "BLUE",false ) );
		
		
		light.setSize( 200,300 );
		p2.add( light );
		
		group.add( rButton );
		group.add( yButton );
		group.add( gButton );
		
		rButton.addItemListener( this );	
		gButton.addItemListener( this );
		yButton.addItemListener( this );

		getContentPane().setLayout( new BorderLayout() );
		getContentPane().add( p2,BorderLayout.CENTER );
		getContentPane().add( p1,BorderLayout.SOUTH );

			
	}
	public void itemStateChanged( ItemEvent e )
	{
		if( e.getSource() == rButton )
			light.red();
		else
			if( e.getSource() == gButton )
				light.green();
			else
				if( e.getSource() == yButton )
					light.yellow();
	}
}

class Lights extends JPanel
{
	private boolean r,y,gg;
	
	public void red()
	{
		r = true;
		y = false;
		gg= false;
		repaint();
	}
	public void green()
	{
		r = false;
		y = false;
		gg = true;
		repaint();
	}
	public void yellow()
	{
		r = false;
		y = true;
		gg = false;
		repaint();
	}
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		
		if( r )
		{
			g.drawRect( 5,5,30,80 );
			g.setColor( Color.RED );
			g.fillOval( 10,10,20,20 );
			g.setColor( Color.BLACK );
			g.fillOval( 10,35,20,20 );
			g.fillOval( 10,60,20,20 );
		}
		else 
			if( gg )
			{
			g.drawRect( 5,5,30,80 );
			g.setColor( Color.BLACK );
			g.fillOval( 10,10,20,20 );
			g.setColor( Color.BLUE );
			g.fillOval( 10,35,20,20 );
			g.setColor( Color.BLACK );
			g.fillOval( 10,60,20,20 );
			}
		else  if( y )
			{
			g.drawRect( 5,5,30,80 );
			g.setColor( Color.BLACK );
			g.fillOval( 10,10,20,20 );
			g.fillOval( 10,35,20,20 );
			g.setColor( Color.YELLOW );
			g.fillOval( 10,60,20,20 );

			}
			
	}
	
	
	public Dimension getPreferredSize()
	{
		return new Dimension( 40,90 );
	}
}