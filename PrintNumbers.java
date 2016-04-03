//This program is written by Muhammad Imtiaz..
// This program prints a number when clicking on the button..
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class PrintNumbers 
{
	
	public static void main( String []  args)
	{
		
		 PaintPanel frame = new PaintPanel( "" );
		 
		 frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		 frame.setSize( 500,300 );
		 frame.setVisible( true );
		
	}
	
}

class PrintNumbersTest extends JFrame implements ActionListener 
{
	
	private JButton[] buttons = new JButton[ 10 ];
	private JPanel p = new JPanel();
	private Container container = getContentPane();
	private JTextField tx;
	
	public PrintNumbersTest()
	{
		setTitle( "Printing numbers" );
		tx = new JTextField( );
		
		container.setLayout( new BorderLayout() );
		p.setLayout( new GridLayout( 3,4,5,5 ) );
		for( int i = 0; i<buttons.length; i++ )
		{
			buttons[i] = new JButton( ""+(i+1) );
			p.add( buttons[i] );
			buttons[i].addActionListener( this );
		}
		container.add( p,BorderLayout.CENTER );
		container.add( tx,BorderLayout.SOUTH );
	}
	
	public void actionPerformed( ActionEvent e )
	{
		String a = e.getActionCommand();
		if( e.getSource() instanceof JButton	)
		{
			tx.setText( a );
			check( a );
		}
		
	}
	public void check( String x )
	{
		PaintPanel pp = new PaintPanel( x );
		pp.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		pp.setVisible( true );
	}
	
}

class PaintPanel extends JFrame implements MouseListener
{
	private JLabel txt;
	private int x = 0,y = 0;
	private JButton[] buttons = new JButton[ 4 ];
	private Container container = getContentPane();
	private JPanel drawPanel = new JPanel();
	private String event;
	public PaintPanel( String t )
	{
		setSize( 200,200 );
		txt = new JLabel( t );
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = screensize.width;
		int screenHeight = screensize.height;
		//addMouseListener( this );
		Dimension frameSize = this.getSize();
		int x = ( screenWidth - screensize.width );
		int y = ( screenHeight - screensize.height );
		
		buttons[0] = new JButton( "drawRect" );
		buttons[1] = new JButton( "fillRect" );
		buttons[2] = new JButton( "arc" );
		buttons[3] = new JButton( "oval" );
		container.setLayout( new FlowLayout() );
		drawPanel.add( buttons[0] );
		drawPanel.add( buttons[1] );
		drawPanel.add( buttons[2] );
		drawPanel.add( buttons[3] );
		
		container.add( drawPanel );
		Handler handler = new Handler();
		buttons[0].addActionListener( handler );
		buttons[1].addActionListener( handler );
		buttons[2].addActionListener( handler );
		buttons[3].addActionListener( handler );
		
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
		this.setLocation( x+100,y+100 );
		add( txt );
	}
	public void mousePressed( MouseEvent e )
	{
		
		
	}
	public void mouseClicked( MouseEvent e )
	{}
	public void mouseEntered( MouseEvent e )
	{}
	public void mouseExited( MouseEvent e )
	{}
	public void mouseReleased( MouseEvent e )
	{}
	private class Handler implements ActionListener
	{
		
		public void actionPerformed( ActionEvent e )
		{
			event = e.getActionCommand();
			repaint();
		}
	}
	public void paint( Graphics g )
	{
			if( event.equals( "drawRect" ) )
			g.drawRect( 100,200,50,50 );
			else
				if( event.equals( "fillRect" ) )
				{
				g.fillRect(100,200,10,10 );
				}
		
		
		

	}
	
}


