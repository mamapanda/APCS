/**
 * Class to test the Geometry.java methods
 *
 * @author Daniel Phan
 * @version 10.24.16
 */
import java.util.Scanner;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Program
{
	/**
	 * The main method to run the application
	 * @param args Java's command line arguments
	 */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.println("1 - Cone/Cylinder/Sphere");
			System.out.println("2 - Ellipse");
			System.out.println("3 - End Program");
			System.out.print("> ");
			String choice = in.nextLine();
			System.out.println();
			if(choice.equals("1")) geom3D();
			else if(choice.equals("2")) ellipse();
			else break;
			System.out.println();
		}
	}
	
	/**
	 * Tests the Geometry class's cone, cylinder, and sphere methods
	 */
	private static void geom3D()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double r = in.nextDouble();
		System.out.print("Enter the height: ");
		double h = in.nextDouble();
		System.out.format("Sphere volume: %.2f\n", Geometry.sphereVolume(r));
		System.out.format("Sphere surface area: %.2f\n", Geometry.sphereSurface(r));
		System.out.format("Cylinder volume: %.2f\n", Geometry.cylinderVolume(r, h));
		System.out.format("Cylinder surface area: %.2f\n", Geometry.cylinderSurface(r, h));
		System.out.format("Cone volume: %.2f\n", Geometry.coneVolume(r, h));
		System.out.format("Cone surface area: %.2f\n", Geometry.coneSurface(r, h));
	}
	
	/**
	 * Tests the Geometry class's ellipse methods
	 */
	private static void ellipse()
	{
		Scanner in = new Scanner(System.in);
		Ellipse2D.Double e = obtainEllipse();
		System.out.println();
		System.out.format("The ellipse's circumference: %.2f\n", Geometry.perimeter(e));
		System.out.format("The ellipse's area: %.2f\n", Geometry.area(e));
		System.out.println();
		while(true)
		{
			Point2D.Double p = obtainPoint();
			System.out.println();
			System.out.format("The point is inside the ellipse: %b\n", Geometry.isInside(p, e));
			System.out.format("The point is on the ellipse: %b\n", Geometry.isOnBoundary(p, e));
			System.out.print("Test another point? (y/n): ");
			String choice = in.nextLine();
			System.out.println();
			if(choice.equals("n")) break;
		}
	}
	
	/**
	 * Returns an ellipse based on user input values
	 * (Postcondition: e matches user input values)
	 * @return an ellipse based on user input values
	 */
	private static Ellipse2D.Double obtainEllipse()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Ellipse's bounding rectangle's lower-left corner (Cartesian) x y: ");
		double eX = in.nextDouble();
		double eY = in.nextDouble();
		System.out.print("Ellipse w h: ");
		double eW = in.nextDouble();
		double eH = in.nextDouble();
		Ellipse2D.Double e = new Ellipse2D.Double(eX, eY, eW, eH);
		return e;
	}
	
	/**
	 * Returns a point based on user input values
	 * (Postcondition: p matches user input values)
	 * @return an point based on user input values
	 */
	private static Point2D.Double obtainPoint()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Point x y: ");
		double x = in.nextDouble();
		double y = in.nextDouble();
		Point2D.Double p = new Point2D.Double(x, y);
		return p;
	}
}