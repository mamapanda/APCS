
/**
 * Paints two rectangles and calculates the area of their intersection
 * 
 * @author Daniel Phan 
 * @version 10.7.16
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class IntersectionRectangle extends JComponent
{
	private Rectangle rec1, rec2; //the two rectangles to find the area of their intersection
	private Rectangle intersection; //the rectangle representing the two rectangles' intersection
	
	/**
	* Constructs a new IntersectionRectangle with the two given rectangles
	* @param rec1 the first rectangle to paint and use to find the intersection area
	* @param rec2 the second rectangle to paint and use to find the intersection area
	*/
	public IntersectionRectangle(Rectangle rec1, Rectangle rec2)
	{
		this.rec1 = rec1;
		this.rec2 = rec2;
		this.intersection = rec1.intersection(rec2);
	}
	
	/**
	* Displays the intersection area of the rectangles
	* @param gn the graphical utility to help draw on the JFrame
	*/
	public void displayIntersectArea(Graphics2D gn)
	{
		gn.setPaint(Color.BLACK);
		gn.setFont(new Font("Arial", Font.BOLD, 20));
		int coordX = (int)(intersection.getX() + intersection.getWidth() / 2);
		if(coordX < 0) coordX = 20;
		int coordY = (int)(intersection.getY() + intersection.getHeight() / 2) + 5;
		if(coordY < 0) coordY = 20;
		if(this.intersection.isEmpty()){
			gn.drawString("The rectangles do not intersect.", coordX, coordY);
			//gn.drawString("The rectangles do not intersect.", 0, 20);
		}
		else{
			int area = (int)(intersection.getWidth() * intersection.getHeight());
			gn.drawString("Intersection area: " + area, coordX, coordY);
		}
	}
	
	/**
	* Paints the rectangles, the intersection, and displays the the intersection area
	* @param g the graphical utility to help draw on the JFrame
	*/
	public void paintComponent(Graphics g)
	{
		Graphics2D gn = (Graphics2D)g;
		gn.setPaint(Color.CYAN);
		gn.fill(rec1);
		gn.fill(rec2);
		gn.setPaint(Color.BLUE);
		gn.fill(intersection);
		displayIntersectArea(gn);
	}
	
	/**
	* The main function to run the application.
	* @param args Java's command line arguments
	*/
    public static void main(String[] args)
	{
		Rectangle rec1 = new Rectangle(0, 0, 400, 300);
		Rectangle rec2 = new Rectangle(200, 150, 500, 500);
		IntersectionRectangle iR = new IntersectionRectangle(rec1, rec2);
		JFrame frame = new JFrame();
		frame.setSize(1200, 1000);
		frame.setTitle("IntersectionRectangle.java");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(iR);
	}
}
