import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventClass extends MyFrame
{
	private JButton button;
	
	public MouseEventClass(  )
	{
		super( "Test Frame" );
		
		getContentPane().setLayout( new FlowLayout() );
		button = new JButton( "Close" );
		add( button );
		button.addActionListener( new ActionListener()
		{
			public void actionPerformed( ActionEvent e )
			{
				if( e.getSource() == button )
					System.exit( 0 );
			}
		}		);
	}
}