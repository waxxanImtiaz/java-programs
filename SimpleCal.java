import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCal extends MyFrame  implements ActionListener 
{
	private JButton add,sub,div,mul;
	private JPanel jbp,jfp;
	private JTextField num1Field;
	private JTextField num2Field;
	private JTextField resultField;
	private JMenuBar jmb;
	public static void main( String [] args )
	{
		SimpleCal  frame = new SimpleCal();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setSize( 200,200 );
		frame.setVisible( true );
	}
	public SimpleCal()
	{
		setTitle( "Simple Calculator" );
		jbp = new JPanel();
		jfp = new JPanel();
		
		jmb = new JMenuBar();
		setJMenuBar( jmb );
		
		JMenu jmFile = new JMenu( "File" );
		JMenu jmHelp = new JMenu( "Help" );
		jmb.add( jmFile );
		jmb.add( jmHelp );
		
		jmFile.add( new JMenuItem( "New" ) );
		jmFile.add(  new JMenuItem( "Open" ) );
		jmFile.addSeparator();
		jmFile.add( new JMenuItem( "Print" ) );
		jmFile.addSeparator();
		jmFile.add( new JMenuItem( "Exit" ) );
		
		JMenu hardSM = new JMenu(  "Hardware" );
		JMenu softSM = new JMenu( "Software" );
		jmHelp.add( softSM );
		jmHelp.add( hardSM );
		softSM.add( new JMenuItem( "NT" ) );
		softSM.add( new JMenuItem( "Win98" ) );
		softSM.add( new JMenuItem( "Windows 7" ) );
		softSM.add( new JMenuItem( "Windows 8" ) );
		
		
		hardSM.add( new JMenuItem( "Mobile" ,'M') );
		hardSM.add( new JMenuItem("Computer",'C' ));
		hardSM.add( new JMenuItem( "TV" , 'T'));
		hardSM.add( new JMenuItem( "Camera" ,'Q') );
		
		JRadioButtonMenuItem jrBlue,jrYellow,jrRed;
		JMenu colorHelpM = new JMenu( "Color" );
		colorHelpM.add( jrBlue = new JRadioButtonMenuItem( "Blue" )  );
		colorHelpM.add( jrYellow = new JRadioButtonMenuItem( "Yellow" ) );
		colorHelpM.add( jrRed = new JRadioButtonMenuItem( "Red" ) );
		
		ButtonGroup group = new ButtonGroup();
		group.add( jrBlue );
		group.add( jrYellow );
		group.add( jrRed );
		
		jrBlue.addActionListener( this );
		jrRed.addActionListener( this );
		jrYellow.addActionListener( this );
	
		
		jmHelp.add( colorHelpM );
		add = new JButton( "Add" );
		div = new JButton( "Div" );
		sub = new JButton( "Sub" );
		mul = new JButton( "Mul" );
		
		jbp.setLayout( new FlowLayout() );
		jbp.add( add );
		jbp.add( sub );
		jbp.add( mul );
		jbp.add( div );
		
		
		
		jfp.setLayout( new FlowLayout() );
		jfp.add( new JLabel( "Num1" ) );
		jfp.add( num1Field = new JTextField( "2",10 ) );
		jfp.add( new JLabel( "Num2" ) );
		jfp.add( num2Field = new JTextField( "3",10 ) );
		jfp.add( new JLabel( "Result" ) );
		jfp.add( resultField = new JTextField(10) );
		
		getContentPane().setLayout( new BorderLayout() );
		getContentPane().add( jfp,BorderLayout.CENTER );
		getContentPane().add( jbp,BorderLayout.SOUTH );
		
		add.addActionListener( this );
		sub.addActionListener( this );
		mul.addActionListener( this );
		div.addActionListener( this );
		setBackground( Color.RED );
	}//end of constructor
	
	public void itemStateChanged( ItemEvent e )
	{
	
	}
	public void actionPerformed( ActionEvent e )
	{
		String command = e.getActionCommand();
		
		if( "Add".equals( command ) )
			operator( '+' );
		else
			if( "Sub".equals( command ) )
				operator( '-' );
			else
				if( "Div".equals( command ) )
					operator( '/' );
				else
					if( "Mul".equals( command ) )
						operator( '*' );
						 if( e.getSource() instanceof JMenuItem )
							if( e.getActionCommand().equals("Blue")) 
								getContentPane().setBackground( Color.BLUE );
					
	}//end of actionPerformed method
	
	public void operator( char op )
	{
		int n1 = Integer.parseInt( num1Field.getText().trim() );
		int n2 = Integer.parseInt( num2Field.getText().trim() );
		int result = 0;
		
		switch( op )
		{
			case '+':
				result = n1+n2; break;
			case '*':
				result = n1*n2; break;
			case '/':
				result = n1/n2; break;
			case '-':
				result = n1-n2; break;
		}//end of switch
		
		resultField.setText( String.valueOf(result ));
		
	}
}