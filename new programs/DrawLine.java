import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class DrawLine
{
public static void main(String [] args)
	{
	Draw obj=new Draw();
	JFrame application=new JFrame();
	application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	application.add(obj);
	application.setSize(300,300);
	application.setVisible(true);
	}
}
class Draw extends JPanel
{
	public void paintComponent(Graphics g)
	{
	super.paintComponent(g);
	int width=getWidth();
	int height=getHeight();
	g.drawString("JAVA COOL ",40,70);
	g.drawRect(10,20,30,50);
	g.drawLine(0,0,width,height);
	g.drawLine(0,width,height,0);
	
	}
}