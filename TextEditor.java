import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class TextEditor extends MyFrame implements ActionListener
{
	private JButton cutButton,pasteButton;
	private String data = "";
	private JTextArea textA;
	private Box box;
	private JPanel p1,p2;
	public static void main( String [] args )
	{
		TextEditor  frame = new TextEditor();
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setSize( 200,200 );
		frame.setVisible( true );
	}
	public TextEditor()
	{
		setTitle( "Simple Text Editor" );
		getContentPane().setLayout( new FlowLayout() );
		
		box = Box.createHorizontalBox();
		
		cutButton = new JButton( "Cut" );
		pasteButton = new JButton( "Paste" );
		
		p1 = new JPanel(  );
		p1.setBorder( new TitledBorder( "Buttons" ) );
		
		p1.setLayout( new FlowLayout() );
		p1.add( cutButton );
		p1.add( pasteButton );
		
		
		p2 = new JPanel();
		p2.setLayout( new FlowLayout() );
		
		textA = new JTextArea("imtiaz ",10,15 );
		box.add( textA );
		textA.setBounds(100,60,30,30);
		p2.add( box );
		
		cutButton.addActionListener( this );
		pasteButton.addActionListener( this );
		
		getContentPane().add( p1 );
		getContentPane().add( p2 );
	}
	
	public void actionPerformed( ActionEvent e )
	{
		String b = e.getActionCommand();
		String check = textA.getText();
		
		if( b.equals( "Cut" ) )
		{
			data = textA.getSelectedText();
			//textA.setText( "" );
		}
		if( b.equals( "Paste" ) )
		{
			textA.setText( data );
		}
	}
}