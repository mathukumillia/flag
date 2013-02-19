/**
 * drawRectangle
 * 		draws a rectangle to the screen
 */
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class drawRectangle extends JFrame{

	private Rectangle r2;
	private Rectangle r3;

	public static void main(String[] args){
		drawRectangle window = new drawRectangle("Rectangle");
	}

	/**
	 * Constructor
	 * 		set up the window and initialize the rectangles
	 *
	 * @param title - The title of the window
	 */
	public drawRectangle(String title){
		super(title);

		this.setBounds(0,0,1000,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		this.r2 = new Rectangle(400, 400, 500, 400);
		this.r3 = new Rectangle(0, 0, 300, 400);
	}
	public void paint(Graphics g){
		r2.fillRectangle(g, Color.pink);
		r3.drawRectangle(g, Color.black);
	}
}