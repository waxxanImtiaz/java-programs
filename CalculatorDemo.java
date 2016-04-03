import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorDemo extends JFrame
{
	
	private Label resultLabel;
	private Container container;
	private JButton[] digits;
	private JButton addB,subB,mulB,divB,resB,eqB,sqrB,dotB;
	private String opr;
	private double op1,op2;
	public static void main( String [] args )
	{
		CalculatorDemo  frame = new CalculatorDemo();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setVisible( true );
	}
	
	public CalculatorDemo()
	{
		
		super( "Calculator" );
		setSize( 250,250 );
		
		container = getContentPane();
		container.setLayout( null );
		
		resultLabel = new Label();
		resultLabel.setFont( new Font( "Arial",Font.BOLD,20 ) );
		resultLabel.setBackground( Color.lightGray );
		resultLabel.setBounds( 20,20,200,30 );
		container.add( resultLabel  );
		container.setBackground( new Color( 150,120,200 ) );
		digits = new JButton[ 10 ];
		for( int i = 0; i<10; i++  )
		{
			digits[ i ] = new JButton( ""+i );
			digits[ i ].addActionListener( new ActionListener(){ public void actionPerformed( ActionEvent e ){
				digit_click( e );
			} } );
			container.add( digits[ i ] );
		}
		//digits setting
		digits[ 7 ].setBounds( 20,80,50,30 );
		digits[ 8 ].setBounds( 69,80,50,30 );
		digits[ 9 ].setBounds( 118,80,50,30 );
		
		digits[ 4 ].setBounds( 20,109,50,30 );
		digits[ 5 ].setBounds( 69,109,50,30 );
		digits[ 6 ].setBounds( 118,109,50,30 );
		
		digits[ 1 ].setBounds( 20,138,50,30 );
		digits[ 2 ].setBounds( 69,138,50,30 );
		digits[ 3 ].setBounds( 118,138,50,30 );
		digits[ 0 ].setBounds( 20,168,50,30 );
		
		addB = new JButton( "+" );
		subB = new JButton( "-" );
		divB = new JButton( "/" );
		mulB = new JButton( "*" );
		dotB = new JButton( "." );
		resB = new JButton( "R" );
		sqrB = new JButton( "sqr" );
		eqB = new JButton( "=" );
		
		add( addB );
		add( subB );
		add( mulB );
		add( divB );
		add( resB );
		add( sqrB );
		add( dotB );
		add( eqB );
		
		dotB.setBounds( 69,168,100,30 );
		eqB.setBounds( 166,138,55,30 );
		
		addB.setBounds( 20,50,50,30 );
		subB.setBounds( 69,50,50,30 );
		mulB.setBounds( 118,50,50,30 );
		
		divB.setBounds( 166,50,55,30 );
		sqrB.setBounds( 166,109,55,30 );
		resB.setBounds( 166,80,55,30 );
		
		
		
		addB.addActionListener( new ActionListener(){
			public void actionPerformed( ActionEvent e ) 
			{
				op_click( e );
			}
		} );
		mulB.addActionListener( new ActionListener(){
			public void actionPerformed( ActionEvent e ) 
			{
				op_click( e );
			}
		} );
		divB.addActionListener( new ActionListener(){
			public void actionPerformed( ActionEvent e ) 
			{
				op_click( e );
			}
		} );
		subB.addActionListener( new ActionListener(){
			public void actionPerformed( ActionEvent e ) 
			{
				op_click( e );
			}
		} );
			
		dotB.addActionListener( new ActionListener(){
			public void actionPerformed( ActionEvent e ) 
			{
				dot_click(  );
			}
		} );
		resB.addActionListener( new ActionListener(){
			public void actionPerformed( ActionEvent e ) 
			{
				onAc_click( e );
			}
		} );
		sqrB.addActionListener( new ActionListener(){
			public void actionPerformed( ActionEvent e ) 
			{
				sqrt_click( );
			}
		} );
		eqB.addActionListener( new ActionListener(){
			public void actionPerformed( ActionEvent e ) 
			{
				eq_click( e );
			}
		} );
	}//end of constructor...
	public void onAc_click( ActionEvent e )
	{
		op1 = 0;
		op2 = 0;
		resultLabel.setText( "0" );
	}
	public void eq_click( ActionEvent e )
	{
		String s1 = resultLabel.getText();
		op2 = Double.parseDouble( s1 );
		double result = 0;
		if( opr.equals( "+" ) )  
				result = op1+op2;
			else if( opr.equals( "-" ) )  
				result = op1-op2;
				else if( opr.equals( "/" ) )  
				result = op1/op2;
					else if( opr.equals( "*" ) )  
					result = op1*op2;
				
				resultLabel.setText( String.valueOf( result ) );
	}//end of eq_click
	
	public void op_click( ActionEvent e )
	{
		opr = e.getActionCommand();
		String s1 = resultLabel.getText();
		resultLabel.setText( "0" );
		op1 = Double.parseDouble( s1 );
		 
	}// end of op_click...
	public void dot_click( )
	{
		String s1 = resultLabel.getText();
		
		int pos = s1.indexOf( "." );
		if( pos<0 )
			resultLabel.setText( s1+"." );
	}//end of dot_click..
	
	public void digit_click( ActionEvent e )
	{
		String s = resultLabel.getText();
		String s1 = e.getActionCommand();
		
		if( s.equals( "0" )&&( s1.equals( "0" ) ) )
		{
			resultLabel.setText( "0" );
		}
		else if( s.equals( "0" )&&( !( s1.equals( "0" ) ) ) )
		{
			resultLabel.setText( s1 );
		}
		else 
			resultLabel.setText( s+s1 );
	}//end of digit_click
	
	public void sqrt_click( )
	{
		String s1 = resultLabel.getText();
		
		
		double sRoot = Math.sqrt(Double.parseDouble( s1 ));
		
		resultLabel.setText( String.valueOf( sRoot ) );
	}
	
	
}