import javax.swing.JOptionPane;

public class TestClass1
{
	
	public static void main( String [] args )
	{
		
		NextForm obj = new NextForm();
	}
}
class NextForm 
{
	public  NextForm( )
	{
		
		JOptionPane.showMessageDialog( null,String.format( "%s","Hello World" ));
	}
	
}