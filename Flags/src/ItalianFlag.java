/**
* Has all of the properties of the Italian flag
*
* @author (Daniel Phan)
* @version (10/6)
*/
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
public class ItalianFlag
{
	private int xLeft, yTop; //the x and y coordinates of the top left corner
	private int	width; //the width of the rectangle
	public ItalianFlag(int x, int y, int width)
	{
		this.xLeft = x;
		this.yTop = y;
		this.width = width;
	}
	public void draw(Graphics2D gn)
	{
		gn.setPaint(Color.GREEN);
		Rectangle gRec = new Rectangle(xLeft, yTop, width, 400);
		gn.fill(gRec);
		gn.setPaint(Color.WHITE);
		Rectangle wRec = new Rectangle(xLeft + width, yTop, width, 400);
		gn.fill(wRec);
		gn.setPaint(Color.RED);
		Rectangle rRec = new Rectangle(xLeft + 2 * width, yTop, width, 400);
		gn.fill(rRec);
		/*gn.setPaint(Color.BLUE);
		Line2D.Double line = new Line2D.Double(0, 0 , 400, 200);
		Ellipse2D.Double circle = new Ellipse2D.Double(0, 0, 400, 200);
		Point2D.Double point = new Point2D.Double(500, 500); //can use for lines
		gn.draw(circle);
		gn.draw(line);
		//display a message
		gn.drawString("lol what", 0, 0);*/
	}
}