/**
 * drawFlag
 * 		draws a flag
 *
 */

import javax.swing.JFrame;
import java.awt.Graphics;

public class drawFlag extends JFrame{

	private AmericanFlag flag;

	public static void main(String[] args){
		drawFlag window = new drawFlag("flag");
	}
	/**
	 * Constructor
	 * 		sets up the window and initializes the flag
	 *
	 * @param title - title of the window
	 */
	public drawFlag(String title){
		super(title);

		this.setBounds(0,0,400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		flag = new AmericanFlag();
	}
	/**
	 * paint
	 * 		paints the flag to the screen
	 *
	 * @param g - Graphics object
	 */
	public void paint(Graphics g){
		flag.drawFlag(g);
	}
}