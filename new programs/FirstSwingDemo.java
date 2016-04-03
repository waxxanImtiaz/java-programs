import javax.swing.*;
public class FirstSwingDemo
{
	public static void main(String [] args)
	{
		JFrame myWindow=new JFrame();

		myWindow.setSize(300,200);
		JLabel myLabel=new JLabel("Imtiaz Wassan");
		
		myWindow.getContentPane().add(myLabel);
	
		WindowDestroyer myListener=new WindowDestroyer();
		myWindow.addWindowListener(myListener);
	
		myWindow.setVisible(true);
	}
}