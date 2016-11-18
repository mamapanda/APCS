/**
* Creates and stores up to two rectangles for the frame to use
*
* @author (Daniel Phan)
* @version (10/5)
*/
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Rec extends JComponent
{
	private Rectangle[] recs; //the array of rectangles
	private int currentRec; //the index current rectangle to add (only used by addRectangle)
	
	/**
	* Constructs a new rectangle group, initializes the empty array of two rectangles,
	* and sets the current rectangle index to 0
	*/
	public Rec()
	{
		recs = new Rectangle[2];
		currentRec = 0;
	}
	
	/**
	* Adds a rectangle with the given points
	* @param x1 the x-position of the top-left corner
	* @param y1 the y-position of the top-left corner
	* @param w the width of the rectangle
	* @param h the height of the rectangle
	*/
	public void addRectangle(int x1, int y1, int w, int h)
	{
		recs[currentRec++] = new Rectangle(x1, y1, w, h);
	}
	
	/**
	* Returns the array containing the rectangles
	* @return the array containing the rectangles
	*/
	public Rectangle[] getRecs()
	{
		return recs;
	}
	
	/**
	* Draws the rectangles stored in recs[]
	* @param g the graphical utility to help us draw
	*/
	public void paintComponent(Graphics g) 
	{
		Graphics2D gn = (Graphics2D)g; 
		for(int i = 0; i < recs.length; i++)
		{
		    gn.draw(recs[i]);
		}
	}
}