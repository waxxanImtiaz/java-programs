import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonEventMessage extends MyFrame implements ActionListener
{
	//declaring class varaibels..
	private JPanel panel;
	private JButton[] buttons = new JButton[ 6 ];
	
	//class methods
	public ButtonEventMessage()
	{
		setTitle( "Examples of JPanel and JButton" );
		getContentPane().setLayout( new BorderLayout() );
		
		panel = new JPanel();
		
		panel.setLayout( new GridLayout( 2,3,5,5 ) );
		
		for( int i = 0; i<6; i++ )
		{
			//for panel one..
			buttons[ i ] = new JButton( "Button "+(i+1) );
			buttons[ i ].addActionListener( this );
			panel.add( buttons[ i ] );
			
		}//end of for loop
		
		getContentPane().add( panel,BorderLayout.SOUTH );
		
	}//end of defaulf Constructor...
	
	public void actionPerformed( ActionEvent e )
	{
		String message = e.getActionCommand();
		for( int i = 0; i<6; i++ )
		if( e.getSource() == buttons[ i ] )
			JOptionPane.showMessageDialog( this,message," Dialog ",JOptionPane.PLAIN_MESSAGE );
	}// end of actionPerformed method
}//end of class....