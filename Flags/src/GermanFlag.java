/**
* Draws the German flag on the JFrame
*
* @author Daniel Phan
* @version 10.6.16
*/
import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class GermanFlag extends JComponent
{
	/**
	* Paints the German flag
	* @param g the graphical utility to help draw the flag
	*/
	public void paintComponent(Graphics g)
	{
		Graphics2D gn = (Graphics2D)g;
		GermanFlagPainter gfp = new GermanFlagPainter(0, 0, 500, 100); //edit values here
		gfp.paintFlag(gn);
	}
	
	/**
	* The main function to run the application
	* @param args the Java command-line arguments
	*/
	public static void main(String[] args)
	{
		GermanFlag germanFlag = new GermanFlag();
		JFrame frame = new JFrame();
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(germanFlag);
	}
}