import java.awt.Graphics;
import javax.swing.JPanel;

public class drawPanel extends JPanel
{
public void paintComponent(Graphics g)
{
 super.paintComponent(g);
 int w=getWidth();
 int h=getHeight();
 g.drawLine(0, 0, w, h);
 g.drawLine(0,h,w,0);
}
}