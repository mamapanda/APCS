/**
* Accepts bar values and displays a bar graph of the values
*
* @author Daniel Phan
* @version 10.11.16
*/
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class BarGraph extends JComponent
{
    int[] values; //the values of the bar graph
	int frameW; //the width of the JFrame's content pane
	int frameH; //the height of the JFrame's content pane
    
    /**
     * Constructs a new BarGraph with the array of given values, frame width, and frame height
     * @param values the array of values to put into the bar graph
     * @param frameW the width of the JFrame's content pane
     * @param frameH the height of the JFrame's content pane
     */
    public BarGraph(int[] values, int frameW, int frameH)
    {
        this.values = values;
		this.frameH = frameH;
		this.frameW = frameW;
    }
    
    /**
     * Calculates the maximum of the absolute values of the bar values
     */
    private int calcAbsMax()
    {
        int absMax = 0;
        for(int value: values)
        {
            absMax = Math.max(Math.abs(value), absMax);
        }
		//System.out.println(absMax);
        return absMax;
    }
    
    /**
     * Creates an array of bars based on the bar graph's values
     */
    private Rectangle[] createRectangles()
    {
        Rectangle[] recs = new Rectangle[values.length];
        int barWidth = (int)Math.round(frameW * 1.0 / recs.length);
        int x = 0;
        //int scale = (int)((frameH / 2) / calcAbsMax());
        double scale = ((frameH / 2.0) / calcAbsMax());
        for(int i = 0; i < values.length; i++)
        {
            //int barHeight = scale * Math.abs(values[i]);
            int barHeight = (int)(scale * Math.abs(values[i]));
			//int barHeight = (int)Math.round((double)Math.abs(values[i]) / calcAbsMax() * frameH / 2);
            if(values[i] < 0){
                recs[i] = new Rectangle(x, frameH / 2, barWidth, barHeight);
            }else{
                recs[i] = new Rectangle(x, frameH / 2 - barHeight, barWidth, barHeight);
            }
            x += barWidth;
        }
        return recs;
    }
    
    /**
     * Paints the bar graph onto the JFrame
     * @param g the graphical utility to help paint onto the JFrame
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D gn = (Graphics2D)g;
        Rectangle[] recs = createRectangles();
        for(int i = 0; i < recs.length; i++)
        {
            gn.setPaint((i % 2 == 0) ? new Color(148, 0, 211) : Color.CYAN);
            gn.fill(recs[i]);
			gn.setPaint(Color.WHITE);
			//gn.draw(recs[i]);
        }
    }
    
    /**
     * The main function to run the application
     * @param args Java's command line arguments
     */
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(1000 + 16, 700 + 38);
        frame.setTitle("Daniel Phan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
		frame.getContentPane().setBackground(Color.WHITE);
		Dimension fD = frame.getContentPane().getSize();
		//System.out.println(fD.getWidth());
        int[] arr = 
        {
            32, 40, 57, -25, 82, -30, 10
        };
        BarGraph br = new BarGraph(arr, (int)fD.getWidth(), (int)fD.getHeight());
        frame.add(br);
    }
}