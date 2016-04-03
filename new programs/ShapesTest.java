import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ShapesTest 
{
public class void main(String [] args)
	{
	String input=JOptionPane.showInputDialog("Enter 1 to draw rectangle\n"+" Enter 2 to draw ovals ");
	}
	int choice=Integer.paseInt(input);
	Shapes panel=new Shapes(choice);
	ShapesTest app=new ShapesTest();
	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	app.add(panel);
	app.setSize(300,300);
	app.setVisible(true);
	
}
class Shapes extends JPanel
{
  private int choice;
	public Shapes(int userChoice)
	{
	choice=userChoice;
	}
	public void paintComponent(Graphics g)
	{
	super.paintComponent(g);
	for(int i=0; i<10; i++)
	{
 	switch(choice)
	{
	case 1:
	 g.drawRect(10+i*10,10+i*10,50+i*10,50+i*10);
	 break;
	case 2:
	 g.drawOval(10+i*10,10+i*10,50+i*10,50+i*10);
	break;
	}
	}
	}
}
