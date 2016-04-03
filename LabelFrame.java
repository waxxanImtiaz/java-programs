import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;
public class LabelFrame extends JFrame
{
	private JLabel label1;
	private JPanel panel1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private Font font;
	private Color color;
	private JTextField field;
	private JPasswordField pass;
	private JPanel panel2;
	private Container container;
	private FlowLayout layout;
	public LabelFrame()
	{
		
		super( "My Form" );
		layout = new FlowLayout();
		container = getContentPane();
		setLayout( layout );
		
		//panel1 = new JPanel();
		layout.setAlignment( FlowLayout.LEFT );
		font = new Font(  "Serif",Font.BOLD, 25  );
		label1 = new JLabel();
		label1.setText( " DAWOOD UNIVERSITY OF ENGINEERING AND TECHNOLOGY. " );
		label1.setFont( font );
		layout.layoutContainer( container );
		//panel1.add(label1);
		add( label1 );
		
		//panel2 = new JPanel();
		font = new Font(  "Serif",Font.BOLD, 50  );
		label2 = new JLabel();
		label2.setText( "UNIVERSITY" );
		label2.setFont( font );
		//panel2.add( label2);
		add( label2 );
		
		font = new Font(  "Serif",Font.BOLD, 50  );
		label3 = new JLabel();
		label3.setText( "DATABASE" );
		label3.setFont( font );
		add( label3 );
		 
		//set text field.
		field = new JTextField( 20 );
		add( field );
		
		pass = new JPasswordField( "Hidden text",20 );
		add( pass );
		
		//add(panel);
		
	}
}