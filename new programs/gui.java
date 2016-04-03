import javax.swing.JOptionPane;
public class GUI
{
 public static void main(String [] args)
	{
	String name=JOptionPane.showInputDialog("Enter you name","kamran");
	
	String message=String.format("welcome %s to java programming",name);
	JOptionPane.showMessageDialog(null,message,"imtiaz",JOptionPane.PLAIN_MESSAGE);
	System.exit(0);
	}

}