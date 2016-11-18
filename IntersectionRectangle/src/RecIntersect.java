/**
* draws two rectangles and calculates the area inside their intersection
*
* @author (Daniel Phan)
* @version (10/5)
*/
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner;
import java.awt.Rectangle;

public class RecIntersect
{
	/**
	* The main function to run the application.
	* @param args the Java command-line arguments
	*/
	public static void main(String[] args)
	{
		Rec rec = createRec();
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		//rec.addRectangle(0, 0, 40, 50); //area 500
		//rec.addRectangle(30, 0, 70, 50);
		frame.add(rec);
		System.out.format("Area of Overlap: %d", findIntersectArea(rec.getRecs()));
	}
	
	/**
	* Finds the area of the overlap of the two rectangles
	* @param rec the array containing the two rectangles
	* @return the area of the overlap of the two rectangles
	*/
	private static int findIntersectArea(Rectangle[] recs)
	{
		int intersectX1 = (int)Math.max(recs[0].getX(), recs[1].getX());
		int intersectY1 = (int)Math.max(recs[0].getY(), recs[1].getY());
		int intersectX2 = (int)Math.min(recs[0].getWidth() + recs[0].getX(), recs[1].getWidth() + recs[1].getX());
		int intersectY2 = (int)Math.min(recs[0].getHeight() + recs[0].getY(), recs[1].getHeight() + recs[1].getY());
		int intersectW = (intersectX2 - intersectX1);
		int intersectH = (intersectY2 - intersectY1);
		if((intersectW < 0) || (intersectH < 0)) return 0;
		return intersectW * intersectH;
	}	
	/**
	* Returns a Rec class instance based on user input values
	* @return an instance of the Rec class based on user input values
	*/
	private static Rec createRec()
	{
		Scanner in = new Scanner(System.in);
		Rec rec = new Rec();
		for(int i = 0; i < 2; i++)
		{
			System.out.format("Rectangle %d (x1, y1, w, h): ", i + 1);
			rec.addRectangle(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
		}
		return rec;
	}
}