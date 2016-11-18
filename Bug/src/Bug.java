public class Bug
{
	private int position;
	private boolean isFacingRight;
	
	public Bug(int initialPosition)
	{
		position = initialPosition;
		isFacingRight = true;
	}
	public int getPosition()
	{
		return position;
	}
	public void move()
	{
		position += (isFacingRight) ? 1 : -1;
	}
	public void turn()
	{
		isFacingRight = !isFacingRight;
	}
}