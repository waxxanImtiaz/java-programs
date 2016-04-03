import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import javax.swing.JPanel;
import java.awt.event.*;

public class Test extends JFrame {
	private boolean flag = true;
	private int y;
	private JButton b;
	public Test()
	{
		setSize( 500,500 );
		
		
	    final JPanel p = new JPanel();
	   // final Child c = new Child( p );
	    b = new JButton( "Close" );
	    setLayout( new FlowLayout() );
		JButton button = new JButton( "Open" );
		JButton reset = new JButton( "Reset" );
		add( button );
		p.setLayout( new FlowLayout() );
		p.add( button );
		
		JPanel r = new JPanel();
		r.setLayout( new BorderLayout() );
		r.add( reset,BorderLayout.SOUTH  );
		add( r );
		
		reset.addActionListener( new ActionListener()
		{
			public void actionPerformed( ActionEvent e )
			{
				flag = false;
				addButton( p );
			}
		});
		add( p );
		button.addActionListener(   new ActionListener()
		{
			public void actionPerformed( ActionEvent e )
			{
				flag = true;
				addButton( p );		
			}
		});
		//add( c );
		}
		public void addButton( JPanel x )
		{
			
			if( flag )
			{
			x.add( b );
			x.revalidate();
			validate();
			flag = false;
			}
			else
			{
				x.remove( b );
				x.revalidate();
				
			}
		}
		
		
	
	
	public static void main( String[] args )
	{
		Test frame = new Test();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible( true );
	}

}


