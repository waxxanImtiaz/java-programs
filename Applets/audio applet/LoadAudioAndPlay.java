import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.applet.AudioClip;

public class LoadAudioAndPlay extends JApplet
{
	private AudioClip sound1,sound2,currentSound;
	private JButton playButton,loopButton,stopButton;
	private JComboBox soundComboBox;
	
	public void init()
	{
		setLayout( new FlowLayout() );
		
		String choices[] = { "Welcome","Hi" };
		
		soundComboBox = new JComboBox( choices );
		
		soundComboBox.addItemListener(
		new ItemListener()
		{
			public void itemStateChanged( ItemEvent e )
			{
				currentSound.stop();
				currentSound = soundComboBox.getSelectedIndex() == 0? sound1:sound2;
			}
			
		}
		);
		
		add( soundComboBox );
		
		ButtonHandler handler = new ButtonHandler();
		
		playButton = new JButton( "Play" );
		playButton.addActionListener( handler );
		add( playButton );
		
		loopButton = new JButton( "Loop" );
		loopButton.addActionListener( handler );
		add( loopButton );
		
		stopButton = new JButton( "Stop" );
		stopButton.addActionListener( handler );
		add( stopButton );
		
		sound1 = getAudioClip(  getDocumentBase(),"welcome.wav" );
		sound2 = getAudioClip( getDocumentBase(),"hi.au" );
		
		currentSound = sound1;
	}
	
	public void stop()
	{
		currentSound.stop();
	}
	
	public class ButtonHandler implements ActionListener
	{
		public void actionPerformed( ActionEvent e )
		{
			if( e.getSource() == playButton )
				currentSound.play();
			else if( e.getSource() == loopButton )
				currentSound.loop();
			else if( e.getSource() == stopButton )
				currentSound.stop();
		} 
	}
}
