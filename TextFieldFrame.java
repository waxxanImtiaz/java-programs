import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class TextFieldFrame extends JFrame
{
	private JTextField text1;
	private JTextField text2;
	private JPasswordField pass;
	private JButton button;
	public TextFieldFrame()
	{
		
		super( "TextField and Password Field" );
		setLayout( new FlowLayout() );
		
		text1 = new JTextField( 20 );
		add( text1 );
		
		text2 = new JTextField( "UnEditable text", 20 );
		text2.setEditable( false );
		add( text2 );
		
		pass = new JPasswordField( "Hidden text" );
		add( pass );
		
		button = new JButton( "TextField" );
		add( button );
		
		TextHandler handler = new TextHandler();
		
		text1.addActionListener( handler );
		text2.addActionListener( handler );
		pass.addActionListener( handler );
		button.addActionListener( handler );
		
		
	}
	private class TextHandler implements ActionListener
		{
			
	
			public void actionPerformed( ActionEvent e )
			{
				
				String s = " ";
				
				if( e.getSource()  == text1 )
				{
					s = String.format( "text1:%s" ,e.getActionCommand() );
					//text1.setText( s );
				}
				else
					if( e.getSource() == text2 )
					s = String.format( "text2:%s" ,e.getActionCommand() );
				else
					if( e.getSource() == pass )
						s = String.format( "pass:%s" ,e.getActionCommand() );
				else 
					if( e.getActionCommand == "TextField" )
					{
						text1.setText( "TextField" );
						s = "";
					}
				JOptionPane.showMessageDialog( null,s );
			
		
				
				
			}
		}
	
}	
