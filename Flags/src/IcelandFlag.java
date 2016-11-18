/**
* Draws the flag of Iceland on the JFrame
*
* @author Daniel Phan
* @version 10.6.16
*/
import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class IcelandFlag extends JComponent
{
	/**
	* Paints the flag of Iceland
	* @param g the graphical utility to help draw the flag
	*/
	public void paintComponent(Graphics g)
	{
		Graphics2D gn = (Graphics2D)g;
		IcelandFlagPainter flagPainter = new IcelandFlagPainter(0, 0, 50, 36); //edit values here
		flagPainter.paintFlag(gn);
	}
	
	/**
	* The main function to run the application
	* @param args the Java command-line arguments
	*/
	public static void main(String[] args)
	{
		IcelandFlag iLFlag = new IcelandFlag();
		JFrame frame = new JFrame();
		frame.setTitle("Flag of Iceland");
		frame.setSize(1200, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(iLFlag);
	}
}