/**
 * rectangle
 * 		draws a rectangle with given dimensions and a given top left point
 */

import java.awt.Graphics;
import java.awt.Color;

public class Rectangle {

	private int a;
	private int b;
	private int width;
	private int height;


	/**
	 * Constructor
	 * 		establishes the top right point and width and height of the rectangle and sets up the lines that make up the rectangle
	 *
	 * @param a - top left point x-coordinate
	 * @param b - top left point y-coordinate
	 * @param width - width of the rectangle
	 * @param height - height of the rectangle
	 */
	public Rectangle(int a, int b, int width, int height){
		setA(a);
		setB(b);
		setWidth(width);
		setHeight(height);
	}

	/**
	 * 	getters and setters
	 */
	public void setA(int a){
		this.a = a;
	}
	public void setB(int b){
		this.b = b;
	}
	public void setWidth(int width){
		this.width = width;
	}
	public void setHeight(int height){
		this.height = height;
	}

	/**
	 * drawRectangle 
	 * 		draws the rectangle
	 *
	 * @param g - graphics object
	 */
	public void drawRectangle(Graphics g, Color color){
		g.setColor(color);
		g.drawRect(a, b, width, height);
	}
	public void fillRectangle(Graphics g, Color color){
		g.setColor(color);
		g.fillRect(a, b, width, height);
	}

}
