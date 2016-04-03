import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.jnlp.*;
//import javax.jnlp.*;
import javax.jnlp.*;
import javax.swing.ImageIcon;
import javax.swing.*;

public class LoadImageAndScale extends JApplet
{
	private ImageIcon image;
	private JPanel scalePanel;
	private JLabel percentLabel;
	private JTextField scaleInputJTextField;
	private JButton scaleChangeJButton;
	private double scaleValue = 1;
	
	public void init()
	{
		scalePanel = new JPanel();
		percentLabel = new JLabel( "scale percent:" );
		scaleInputJTextField = new JTextField( "100" );
		scaleChangeJButton = new JButton( "Set Scale" );
		
		scalePanel.add( percentLabel );
		scalePanel.add( scaleInputJTextField );
		scalePanel.add( scaleChangeJButton );
		add(  scalePanel,BorderLayout.NORTH );
		
		scaleChangeJButton.addActionListener( 
		new ActionListener(){
			public void actionPerformed( ActionEvent e )
			{
				scaleValue = Double.parseDouble( scaleInputJTextField.getText()/100.0 );
				
				repaint();
			}
		}
		);
		
		try{
			
			FileOpenService fileOpenService = (FileOpenService)ServiceManager.loopup( "javax.jnlp.FileOpenService" );
			
			FileContents contents = fileOpenService.openFileDialog( null,null );
			byte[] imageData = new byte[ (int)contents.getLength() ];
			contents.getInputStream().read( imageData );
			image = new ImageIcon( imageData );
			add( new DrawJPanel() ,BorderLayout.CENTER);
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
	
	private class DrawJPanel extends JPanel
	{
		public void paintComponent( Graphics g )
		{
			super.paintComponent( g );
			
			double spareWidth = getWidth() - scaleValue*image.getIconWidth();
			double spareHeight = getHeight() - scaleValue*image.getIconHeight();
			
			d.drawImage( image.getImage(),(int)( spareWidth )/2,(int)(spareHeight)/2,(int)(image.getIconWidth()*scaleValue),(int)(image.getIconHeight()*scaleValue),this );
		}//end of paintComponent method..
	}//end of DrawJPanel inner class..
}//end of LoadImageAndScale JApplet class....