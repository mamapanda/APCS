/**
 * Contains methods that calculate the surface area and volume of cones,
 * cylinders, and spheres and various properties of ellipses
 *
 * @author Daniel Phan
 * @version 10.25.16
 */
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Geometry
{
	/**
	 * Calculates the surface area of a cone with the given radius and height
	 * (Postcondition: surfaceArea > 0)
	 * @param r the radius of the cone
	 * @param h the height of the cone
	 * @return the surface area of the cone
	 * (Precondition: r > 0, h > 0)
	 */
	public static double coneSurface(double r, double h)
	{
		double surfaceArea = Math.PI * r * (r + Math.sqrt(h * h + r * r));
		return surfaceArea;
	}
	
	/**
	 * Calculates the volume of a cone with the given radius and height
	 * (Postcondition: volume > 0)
	 * @param r the radius of the cone
	 * @param h the height of the cone
	 * @return the volume of the cone
	 * (Precondition: r > 0, h > 0)
	 */
	public static double coneVolume(double r, double h)
	{
		double volume = Math.PI * r * r * h / 3;
		return volume;
	}
	
	/**
	 * Calculates the surface area of a cylinder with the given radius and height
	 * (Postcondition: surfaceArea > 0)
	 * @param r the radius of the cylinder
	 * @param h the height of the cylinder
	 * @return the surface area of the cylinder
	 * (Precondition: r > 0, h > 0)
	 */
	public static double cylinderSurface(double r, double h)
	{
		double surfaceArea = 2 * Math.PI * r * r + 2 * Math.PI * r * h;
		return surfaceArea;
	}
	
	/**
	 * Calculates the volume of a cylinder with the given radius and height
	 * (Postcondition: volume > 0)
	 * @param r the radius of the cylinder
	 * @param h the height of the cylinder
	 * @return the volume of the cylinder
	 * (Precondition: r > 0, h > 0)
	 */
	public static double cylinderVolume(double r, double h)
	{
		double volume = Math.PI * r * r * h;
		return volume;
	}
	
	/**
	 * Calculates the surface area of a sphere with the given radius
	 * (Postcondition: surfaceArea > 0)
	 * @param r the radius of the sphere
	 * @return the surface area of the sphere
	 * (Precondition: r > 0)
	 */
	public static double sphereSurface(double r)
	{
		double surfaceArea = 4 * Math.PI * r * r;
		return surfaceArea;
	}
	
	/**
	 * Calculates the volume of a sphere with the given radius
	 * (Postcondition: volume > 0)
	 * @param r the radius of the sphere
	 * @return the surface area of the sphere
	 * (Precondition: r > 0)
	 */
	public static double sphereVolume(double r)
	{
		double volume = (4 / 3.0) * Math.PI * Math.pow(r, 3);
		return volume;
	}
	
	/**
	 * Approximates the circumference of a given ellipse
	 * (Postcondition: circumference > 0)
	 * @param e the ellipse to calculate the circumference of
	 * @return the circumference of the ellipse
	 * (Precondition: e.isEmpty() == false)
	 */
	public static double perimeter(Ellipse2D.Double e)
	{
		double a = e.getHeight() / 2.0;
		double b = e.getWidth() / 2.0;
		double circumference = Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
		return circumference;
	}
	
	/**
	 * Calculates the area of a given ellipse
	 * (Postcondition: area > 0)
	 * @param e the ellipse to calculate the area of
	 * @return the area of the ellipse
	 * (Precondition: e.isEmpty() == false)
	 */
	public static double area(Ellipse2D.Double e)
	{
		double a = e.getHeight() / 2.0;
		double b = e.getWidth() / 2.0;
		double area = Math.PI * a * b;
		return area;
	}
	
	/**
	 * Calculates whether a given point lies inside, but not on, the given ellipse
	 * (Postcondition: isInside == true || isInside == false)
	 * @param p the given point
	 * @param e the given ellipse
	 * @return true if the point inside, but not on, the ellipse, false otherwise
	 * (Precondition: e.isEmpty() == false)
	 */
	public static boolean isInside(Point2D.Double p, Ellipse2D.Double e)
	{
		//ellipse equation: (x - x0)^2 / a ^ 2 + (y - y0)^2 / b^2 = 1
		double horizontalR = e.getWidth() / 2.0;
		double verticalR = e.getHeight() / 2.0;
		double xCenter = e.getX() + horizontalR;
		double yCenter = e.getY() + verticalR;
		boolean isInside = Math.pow(p.getX() - xCenter, 2) / Math.pow(horizontalR, 2)
							+ Math.pow(p.getY() - yCenter, 2) / Math.pow(verticalR, 2)
							< 1;
		//return isInside;
		return e.contains(p.getX(), p.getY());
	}
	
	/**
	 * Calculates whether a given point lies on the given ellipse
	 * (Postcondition: isOnBoundary == true || isOnBoundary == false)
	 * @param p the given point
	 * @param e the given ellipse
	 * @return true if the point lies on the ellipse, false otherwise
	 * (Precondition: e.isEmpty() == false)
	 */
	public static boolean isOnBoundary(Point2D.Double p, Ellipse2D.Double e)
	{
		//ellipse equation: (x - x0)^2 / a ^ 2 + (y - y0)^2 / b^2 = 1
		double horizontalR = e.getWidth() / 2.0;
		double verticalR = e.getHeight() / 2.0;
		double xCenter = e.getX() + horizontalR;
		double yCenter = e.getY() + verticalR;
		boolean isOnBoundary = Math.abs(
								Math.pow(p.getX() - xCenter, 2) / Math.pow(horizontalR, 2)
								+ Math.pow(p.getY() - yCenter, 2) / Math.pow(verticalR, 2)
								- 1)
								<= 0.0000001;
		return isOnBoundary;
	}
}