import javax.swing.JApplet;
import java.awt.Graphics;
import javax.swing.JOptionPane;
public class MyApplet extends JApplet {

		private double sum;
		@Override
		public void init()
		{
			String firstNum = JOptionPane.showInputDialog("Enter first number:");
			
			String secondNum = JOptionPane.showInputDialog("Enter second number:" );
			
			double num1 = Double.parseDouble( firstNum );
			
			double num2 = Double.parseDouble( secondNum );
			
			sum = num1+num2;
			
			
		}
		@Override
		public void start()
		{
			System.out.println( "imitaz" );
		}
		@Override
		public void paint( Graphics g )
		{
			super.paint( g );
			
			g.drawRect(15, 10, 270, 20);
			
			
			g.drawString(" sum is  "+sum, 25, 25);
		}
}
