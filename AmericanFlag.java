/**
 * American Flag
 * 		sets up an american flag
 */

import java.awt.Graphics;
import java.awt.Color;

public class AmericanFlag {
	
	private Rectangle[] rects = new Rectangle[13];
	private Rectangle outside;
	private Rectangle starsBox;

	/**
	 * Constructor
	 * 		initializes all of the rectangles in the flag
	 */
	public AmericanFlag(){
		int a = 100, b = 100, width = 190, height = 100;
		int longWidth = width;
		int stripeHeight = (int)((1/13) * height);
		int starsBoxWidth = (int)(.4 * width);
		int starsBoxHeight = (int)(7/13 * height);
		outside = new Rectangle(a, b, width, height);
		starsBox = new Rectangle(a,b, starsBoxWidth, starsBoxHeight);
		for(int i = 0; i < rects.length; i++){
			if(i%2 == 0){
				rects[i] = new Rectangle(a, b, width, stripeHeight, Color.red);
			}else{
				rects[i] = new Rectangle(a,b, width, stripeHeight, Color.white);
			}	
			b = b + stripeHeight;
		}
		
	}

	/**
	 * drawFlag
	 * 		draws the flag to the screen
	 *
	 * @param g - Graphics object
	 */
	public void drawFlag(Graphics g){
		outside.drawRectangle(g, Color.black);
		for(int i = 0; i < rects.length; i++){
			System.out.println("Hello");
			if(i%2 == 0){
				rects[i].fillRectangle(g, Color.red);
				System.out.println("These are the red stirpes");
			}else{
				rects[i].fillRectangle(g, Color.white);
			}
		}
		starsBox.fillRectangle(g, Color.blue);
	}
}