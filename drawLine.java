/**
 * drawLine
 * 		draws a line on the screen
 */
import javax.swing.JFrame;
import java.awt.Graphics;

public class drawLine extends JFrame{

	private Line l;
	private Line l1;
	private Line l2;
	private Line l3;

	public static void main(String[] args) {
		drawLine window = new drawLine("Line");
	}
	/**
	 * constructor
	 * 		sets up the window
	 *
	 * @param title - title of window
	 */
	public drawLine(String title){
		super(title);

		this.setBounds(100,100,600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		this.l = new Line(200,200,300,200);
		this.l1 = new Line(200,300,300,300);
		this.l2= new Line(200,200,200,300);
		this.l3 = new Line(300,200,300,300);



	}

	public void paint(Graphics g){
		this.l.draw(g);
		this.l1.draw(g); 
		this.l2.draw(g);
		this.l3.draw(g);
	}
}