/**
* to draw two overlapping rectangles onto the frame
*
* Drawing a Component onto the frame
* 	//Cannot draw directly onto a frame, but rather we construct
*	//a JComponent object and add it to the frame.
*
* @author (Daniel Phan)
* @version (10.5.16)
*/
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MyRectangle extends JComponent
{
	/**
	* Drawing directions go here. 
	* We will draw two overlapping rectangles in this method.
	* @param g graphical utility to help us draw
	*/
	public void paintComponent(Graphics g) //called once per window change
	{
		Graphics2D gn = (Graphics2D)g; //upgrading the parameter (built-in)
		Rectangle rectangle = new Rectangle(0, 0, 20, 50);
		gn.draw(rectangle);
	}
}