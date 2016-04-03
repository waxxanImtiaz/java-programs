import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class JLabelFrame extends JFrame
{
	
	private JLabel label1;	
	public JLabelFrame()
	{
		
		super( "Testing JLabel" );
		setLayout( new FlowLayout() );
			
		//constructor with a string argument
		Icon bug = new ImageIcon( getClass().getResource( "th.jpg" ) );
		label1 = new JLabel( "label with text.",bug,SwingConstants.RIGHT );
		label1.setHorizontalTextPosition( SwingConstants.CENTER );
		label1.setVerticalTextPosition( SwingConstants.BOTTOM );
		label1.setVerticalAlignment( SwingConstants.LEFT );
		label1.setToolTipText( "This is label" );
		add( label1 );
		
				
	}
}