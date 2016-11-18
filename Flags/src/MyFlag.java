/**
* Draws an Italian flag
*
* @author (Daniel Phan)
* @version (10/6)
*/
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class MyFlag extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D gn = (Graphics2D)g;
		ItalianFlag flag = new ItalianFlag(100, 100, 150);
		flag.draw(gn);
	}
	public static void main(String[] args)
	{
		MyFlag flag = new MyFlag();
		JFrame frame = new JFrame();
		frame.setSize(600, 400);
		frame.setTitle("Italian Flag");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(flag);
	}
}