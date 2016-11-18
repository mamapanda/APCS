public class Rectangle
{
	private double length;
	private double width;
	public Rectangle()
	{
		length = 1;
		width = 1;
	}
	public Rectangle(int newLength, int newWidth)
	{
		length = newLength;
		width = newWidth;
	}
	public double area()
	{
		return width*length;
	}
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	public double perimeter()
	{
		return 2 * length + 2 * width;
	}
	public void setLength(double newLength)
	{
		if(newLength > 0) length = newLength;
	}
	public void setWidth(double newWidth)
	{
		if(newWidth > 0) width = newWidth;
	}
}