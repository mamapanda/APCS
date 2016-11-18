/**
* Has all the properties of and paints the German Flag
*
* @author Daniel Phan
* @version 10.6.16
*/
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class GermanFlagPainter
{
	private int x1; //the x-coordinate of the top left corner of the flag
	private int y1; //the y-coordinate of the top left corner of the flag
	private int width; //the width of each rectangle on the flag
	private int height; //the height of each rectangle on the flag
	
	/**
	* Constructs a German flag with the given width and height for each rectangle section
	* and with the given x- and y-coordinates of the top left corner of the flag
	* @param x1 the x-coordinate of the top left corner of the flag
	* @param y1 the y-coordinate of the top left corner of the flag
	* @param width the width of each rectangle section of the flag
	* @param height the height of each rectangle section of the flag
	*/
	public GermanFlagPainter(int x1, int y1, int width, int height)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.width = width;
		this.height = height;
	}
	
	/**
	* Paints the flag
	* @param gn the graphical utility to help draw the flag
	*/
	public void paintFlag(Graphics2D gn)
	{
		gn.setPaint(Color.BLACK);
		Rectangle blackRec = new Rectangle(x1, y1, width, height);
		gn.fill(blackRec);
		gn.setPaint(Color.RED);
		Rectangle redRec = new Rectangle(x1, y1 + height, width, height);
		gn.fill(redRec);
		gn.setPaint(Color.YELLOW);
		Rectangle yellowRec = new Rectangle(x1, y1 + 2 * height, width, height);
		gn.fill(yellowRec);
	}
}