import javax.swing.JFrame;

public class LabelFrameTest
{
	public static void main(  String [] args )
	{
		FrontPage app = new FrontPage();
		
		app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		app.setSize(  800 , 400);
		
		app.setVisible(  true );

	}
}