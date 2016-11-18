import java.util.Scanner;

public class RecTest
{
	public static void main(String[] args) //to test
	{
		Rectangle rectangle = new Rectangle();
		while(true)
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Width: " + rectangle.getWidth());
			System.out.println("Length: " + rectangle.getLength());
			System.out.println("Area: " + rectangle.area());
			System.out.println("Perimeter: " + rectangle.perimeter());
			System.out.println();
			System.out.print("Change dimensions? (y/n): ");
			String choice = in.nextLine();
			System.out.println();
			if(!choice.equalsIgnoreCase("y")) break;
			System.out.println("Entering a value equal to or less than 0 will result in no value change.");
			System.out.print("New Width: ");
			double newWidth = in.nextDouble();
			rectangle.setWidth(newWidth);
			System.out.print("New Length: ");
			double newLength = in.nextDouble();
			rectangle.setLength(newLength);
			System.out.println();
		}
	}
}