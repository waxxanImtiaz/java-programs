import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.*;

import java.awt.event.*;
public class StartWindow 
{
	public static void main( String [] args )
	{
		StartWindowTest frame = new StartWindowTest();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setVisible( true );
		frame.setSize( 300,300 );
	}
}

class StartWindowTest extends JFrame
{
	
	private JComboBox list;
	private JPanel fieldPanel,labelPanel,mainPanel;
	private JLabel batch,rollNumber;
	private JTextField jtfBatch,jtfRollNumber;
	private String[] names = { "Computer System Engineering","Electronics","Chemical" };
	private JButton next;
	
	public StartWindowTest()
	{
		super( "Dialog" );
		setLayout( null );
		
		list = new JComboBox( names );
		list.setMaximumRowCount( 5 );
		
		labelPanel = new JPanel();
		labelPanel.setLayout(new GridLayout( 2,2,5,5 ));
		
		mainPanel = new JPanel();
		next = new JButton( "Next" );
		
		labelPanel.add( new JLabel( "Batch" ) );
		labelPanel.add( jtfBatch = new JTextField( 20 ) );
		
		labelPanel.add( new JLabel( "Roll number" ) );
		labelPanel.add( jtfRollNumber = new JTextField( 20 )  );
		
		
				
		add( list);
		add( labelPanel );
		add( next );
		
		next.setBounds( 30,200,90,30 );
		list.setBounds(30, 60, 200, 30);
		labelPanel.setBounds(30, 120, 200, 50);
		
		list.setBackground( Color.PINK );
		list.addItemListener( new ItemListener(){
			public void itemStateChanged( ItemEvent e )
			{
				
			}
		} );
		
	
		
	}
} 