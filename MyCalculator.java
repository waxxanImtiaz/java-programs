import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class MyCalculator extends JFrame
{
	private Label resultLabel;
	private JButton digitB[],addB,subB,mulB,divB,remB,eqB,resB;
	private String opr;
	private int op1,op2;
	
	public static void main( String [] args )
	{
		MyCalculator  frame = new MyCalculator();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setVisible( true );
	}
	
	public MyCalculator()
	{
		setTitle( "Calculator" );
		setSize( 300,300 );
		Color color = new Color( 0,220,211 );
		getContentPane().setBackground( color );
	
		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
	
		resultLabel = new Label( );
		resultLabel.setBounds( 100,25,200,30 );
		
		Font f = new Font( "Arial",Font.BOLD,30 );
		resultLabel.setFont( f );
		resultLabel.setBackground( Color.lightGray );
		add( resultLabel );
		
		digitB = new JButton[10];
		
		setLayout( null );
		
		subB = new JButton( "-" );
		mulB = new JButton( "*" );
		divB = new JButton( "/" );
		addB = new JButton( "+" );
		remB = new JButton( "%" );
		eqB = new JButton( "=" );
		resB = new JButton( "RESET" );
		
		add( addB );
		add( mulB );
		add( divB );
		add( subB );
		add( remB );
		add( eqB );
		add( resB );
		
		resB.setBounds( 205,60,96,30 );  
		addB.setBounds( 205,95,65,30 );
		subB.setBounds( 245,95,56,30 );
		mulB.setBounds( 205,130,65,30 );
		divB.setBounds( 245,130,56,30 );
		eqB.setBounds(  205,165,96,30 );
		
		remB.addActionListener( new ActionListener(){ public void actionPerformed( ActionEvent e ){ opr_click(e);} } );
		addB.addActionListener( new ActionListener(){ public void actionPerformed( ActionEvent e ){ opr_click(e);} } );
		subB.addActionListener( new ActionListener(){ public void actionPerformed( ActionEvent e ){ opr_click(e);} } );
		divB.addActionListener( new ActionListener(){ public void actionPerformed( ActionEvent e ){ opr_click(e);} } );
		mulB.addActionListener( new ActionListener(){ public void actionPerformed( ActionEvent e ){ opr_click(e);} } );
		eqB.addActionListener( new ActionListener(){ public void actionPerformed( ActionEvent e ){ eq_click(e);} } );
		
		for( int i = 0; i<10; i++ )
		{
			digitB[ i ] = new JButton( ""+i );
			digitB[ i ].addActionListener( new ActionListener(){
				public void actionPerformed( ActionEvent e )
				{
					digit_click( e );
				}
			} );
			getContentPane().add( digitB[ i ]  );
		}
		
		digitB[1].setBounds(100,60,50,30);
		digitB[2].setBounds(135,60,50,30);
		digitB[3].setBounds(170,60,50,30);
		digitB[4].setBounds(100,95,50,30);
		digitB[5].setBounds(135,95,50,30);
		digitB[6].setBounds(170,95,50,30);
		digitB[7].setBounds(100,130,50,30);
		digitB[8].setBounds(135,130,50,30);
		digitB[9].setBounds(170,130,50,30);
		digitB[0].setBounds(135,165,50,30);
		
		
		
		
		
		
	}
	
	public void opr_click( ActionEvent e )
	{
		String s = resultLabel.getText();
		op1 = Integer.parseInt( s );
		resultLabel.setText( "0" );
		opr = e.getActionCommand();
	}
	public void eq_click( ActionEvent e )
	{
		String s = resultLabel.getText();
		op2 = Integer.parseInt( s );
		
		int result = 0;
		
		if( opr.equals( "+" ) )
		{
			result = op1+op2;
		}
		else if( opr.equals( "-" ) )
		{
			result = op1 - op2;
		}
		else if( opr.equals( "*" ) )
		{
			result = op1*op2;
		}
		else if( opr.equals( "/") )
		{
			result = op1/op2;
		}
		else if( opr.equals( "%" ) )
		{
			result = op1%op2;
		}
		
		resultLabel.setText( ""+result );
	}
	public void digit_click( ActionEvent e )
	{
		String s = resultLabel.getText();
		String s1 = e.getActionCommand();
		
		if( s1.equals( "0" ) )
			resultLabel.setText( "0" );
		else 
			resultLabel.setText( s+s1 );
	}
	
	
}