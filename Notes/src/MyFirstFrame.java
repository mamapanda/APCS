/**
* To display an empty frame
*
* @author (Daniel Phan)
* @version (10.4.16)
* To show a frame
* 1/ Construct an object of JFrame
* 			JFrame frame = new JFrame();
* 2/ Set the size of the frame
* 			frame.setSize(300, 400);
* 			//300px wide & 400px tall
* 			//defaults to 0px, 0px
* 3/ Optional: Title of the frame
* 			frame.setTitle("MyFirstFrame"); 
* 4/ Set the "default close operation"
* 			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
* 			//if omitted, your program continues running even after the frame is closed
* 5/ Make the frame visible
* 			frame.setVisible(true);        
*/
import javax.swing.JFrame;
public class MyFirstFrame
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(500, 600);
		frame.setTitle("Frame 1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		MyRectangle rectangle = new MyRectangle();
		frame.add(rectangle);
	}
}