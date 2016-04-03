import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class FrontPage extends JFrame
{
	private JPanel[] panel;
	private JLabel[] label;
	private JTextField id;
	private JPasswordField pass;
	private JButton button;
	public FrontPage()
	{
		
		super( "University Front Page" );
		setLayout( new FlowLayout() );
		panel = new JPanel[2];
		panel[0] = new JPanel( );
		label = new JLabel[3];
		
		panel[0].setLayout( new GridLayout( 3,1 ) );
		label[0] = new JLabel( "Dawood University of Engineering & Technology" );
		
		label[0].setFont( new Font( "Serif",Font.BOLD,40 ) );
		panel[0].add( label[0] );
		
		label[1] = new JLabel( "University" );
		label[1].setFont( new Font( "Serif",Font.BOLD,20 ) );
		
		panel[0].add( label[1] );
		label[2] = new JLabel( "Database" );
		label[2].setFont( new Font( "Serif",Font.BOLD,20 ) );
		panel[0].add( label[2] );
		
		panel[1] = new JPanel( );
		
		panel[1].setLayout( new GridLayout(  2,2,2,2 ) );
		JLabel labelId = new JLabel( "ID:" );
		JLabel labelPass = new JLabel( "Password:" );
		panel[1].add( labelId );
		id = new JTextField( 20 );
		pass = new JPasswordField( 20 );
		panel[1].add( id );
		panel[1].add( labelPass );
		panel[1].add( pass );
		
		
		button = new JButton( "Long in" );
		
		
		add( panel[0] );
		add( panel[1] );
		add( button );
		
		Submit handler = new Submit();
		button.addActionListener( handler );
	}
	
	private class Submit  implements ActionListener
	{	
	public void actionPerformed( ActionEvent e )
	{
		
			FlowLayoutFrame obj = new FlowLayoutFrame();


	}
	
	}
}