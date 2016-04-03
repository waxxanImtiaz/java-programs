import java.awt.FlowLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FlowLayoutFrame extends JFrame
{
	
	private JButton left;
	private JButton right;
	private JButton center;
	private FlowLayout layout;
	private Container container;
	
	public FlowLayoutFrame()
	{
		
		super( "FlowLayout frame" );
		
		layout = new FlowLayout();
		container = getContentPane();
		setLayout( layout );
		
		left = new JButton( "left" );
		add( left );
		
		left.addActionListener(
			new ActionListener(){
			public void actionPerformed(  ActionEvent e )
			{
				
				layout.setAlignment( FlowLayout.LEFT );
				
				layout.layoutContainer( container );
			}
			}
		);
		
		
		center = new JButton( "center" );
		add( center );
		center.addActionListener( 
			new ActionListener(){
			public void actionPerformed( ActionEvent e )
			{
				
				layout.setAlignment( FlowLayout.CENTER );
				
				layout.layoutContainer( container );
			}
			}
		);
		
		right = new JButton( "right" );
		add( right );
		
		right.addActionListener( 
			new ActionListener(){
			public void actionPerformed( ActionEvent e )
			{
				
				layout.setAlignment( FlowLayout.RIGHT );
				
				layout.layoutContainer( container );
			}
			}
		);
		
	}
}