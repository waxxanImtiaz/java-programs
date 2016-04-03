import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestActionEvent extends MyFrameWithExitHandling implements ActionListener
{
	private JButton jbtClose;
	
	public TestActionEvent()
	{
		setTitle( "TestActionEvent" );
		
		
		jbtClose = new JButton( "imtiaz" );
		getContentPane().setLayout( new FlowLayout() );
		getContentPane().add( jbtClose );
		jbtClose.setMnemonic( '1' );
		jbtClose.addActionListener( this );
		JTextField f = new JTextField( "imtiaz" );
		f.setEditable( false );
		f.setColumns( 20 );
		getContentPane().add( f );
		
		
		
	}
	
	public static void main( String[]  args )
	{
		TestActionEvent frame = new TestActionEvent();
		frame.setSize( 300,300 );
		frame.setVisible( true );
	}
	public void actionPerformed( ActionEvent e)
	{
		if( e.getSource() == jbtClose )
			System.exit( 0 );
	}
}