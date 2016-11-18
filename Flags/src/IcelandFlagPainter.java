/**
* Has all the properties of and paints the flag of Iceland
*
* @author Daniel Phan
* @version 10.6.16
*/
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class IcelandFlagPainter
{
	private int x1; //the x-coordinate of the top left corner of the flag
	private int y1; //the y-coordinate of the top left corner of the flag
	private int width; //the width of each rectangle on the flag
	private int height; //the height of each rectangle on the flag
	private int crossCenterX; //the x-coordinate of the center of the crosses
	private int crossCenterY; //the y-coordinate of the center of the crosses
	
	/**
	* Constructs the flag of Iceland with the given width and height for each rectangle section
	* and with the given x- and y-coordinates of the top left corner of the flag
	* @param x1 the x-coordinate of the top left corner of the flag
	* @param y1 the y-coordinate of the top left corner of the flag
	* @param width the width of the flag
	* @param height the height of the flag
	*/
	public IcelandFlagPainter(int x1, int y1, int width, int height)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.width = width;
		this.height = height;
		this.crossCenterX = (int)Math.round(9 / 25.0 * width) + x1;
		this.crossCenterY = height / 2 + y1;
	}
	
	/**
	* Paints the blue portions of the flag
	* @param gn the graphical utility to help draw the blue portions of the flag
	*/
	public void paintBlue(Graphics2D gn)
	{
		gn.setPaint(Color.BLUE);
		Rectangle blueRec = new Rectangle(x1, y1, width, height);
		gn.fill(blueRec);
	}
	
	/**
	* Paints the flag
	* @param gn the graphical utility to help draw the flag
	*/
	public void paintFlag(Graphics2D gn)
	{
		paintBlue(gn);
		paintWhite(gn);
		paintRed(gn);
	}
	
	/**
	* Paints the red portions of the flag
	* @param gn the graphical utility to help draw the red portions of the flag
	*/
	public void paintRed(Graphics2D gn)
	{
		int redDimH = (int)Math.round(1 / 18.0 * height);
		int redDimW = (int)Math.round(1 / 25.0 * width);
		gn.setPaint(Color.RED);
		Rectangle redRecH1 = new Rectangle(x1, crossCenterY - redDimH, width, redDimH);
		Rectangle redRecH2 = new Rectangle(x1, crossCenterY, width, redDimH);
		Rectangle redRecV1 = new Rectangle(crossCenterX - redDimW, y1, redDimW, height);
		Rectangle redRecV2 = new Rectangle(crossCenterX, y1, redDimW, height);
		gn.fill(redRecH1);
		gn.fill(redRecH2);
		gn.fill(redRecV1);
		gn.fill(redRecV2);
	}
	
	/**
	* Paints the white portions of the flag
	* @param gn the graphical utility to help draw the white portions of the flag
	*/
	public void paintWhite(Graphics2D gn)
	{
		int whiteDimH = (int)Math.round(2 / 18.0 * height);
		int whiteDimW = (int)Math.round((2 / 25.0) * width);
		gn.setPaint(Color.WHITE);
		Rectangle whiteRecH1 = new Rectangle(x1, crossCenterY - whiteDimH, width, whiteDimH);
		Rectangle whiteRecH2 = new Rectangle(x1, crossCenterY, width, whiteDimH);
		Rectangle whiteRecV1 = new Rectangle(crossCenterX - whiteDimW, y1, whiteDimW, height);
		Rectangle whiteRecV2 = new Rectangle(crossCenterX, y1, whiteDimW, height);
		gn.fill(whiteRecH1);
		gn.fill(whiteRecH2);
		gn.fill(whiteRecV1);
		gn.fill(whiteRecV2);
	}
}