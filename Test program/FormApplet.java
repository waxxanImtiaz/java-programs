import javax.swing.JApplet;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
public class FormApplet	extends JApplet
{
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JPanel panel;
	private JButton submit;
	
	public void init()
	{
		setLayout( new FlowLayout() );
		
		firstNameLabel = new JLabel( "First Name" );
		lastNameLabel = new JLabel( " Last Name " );
		
		firstNameField = new JTextField( 10 );
		lastNameField = new JTextField( 10 );
		panel = new JPanel(  );
		panel.setLayout( new GridLayout( 2,2,10,10 ) );
		
		panel.add( firstNameLabel );
		panel.add( firstNameField );
		panel.add( lastNameLabel );
		panel.add(  lastNameField );
		
		
		add( panel,FlowLayout.LEFT );
		
		submit = new JButton( "Submit" );
		
		add( submit,FlowLayout.RIGHT );
		
	}
	
	public void start()
	{
		
	}
}