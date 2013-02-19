/**
 *
 * Line
 * 		draws a line between two graphics points
 * 
 */

import java.awt.Graphics;

public class Line{
	
	private GraphicsPoint p1;
	private GraphicsPoint p2;

	/**
	 * Constructors
	 * 		create a line
	 *
	 */
	public Line(int x1, int y1, int x2, int y2){
		this(new GraphicsPoint(x1,y1), new GraphicsPoint(x2,y2));
	}

	public Line(GraphicsPoint p1, GraphicsPoint p2){
		this.p1 = p1;
		this.p2 = p2;
	}

	public GraphicsPoint getP1(){
		return p1;
	}
	public GraphicsPoint getP2(){
		return p2;
	}
	public void setP1(GraphicsPoint p1){
		this.p1 = p1;
	}

	public void setP1(int x, int y){
		setP1(new GraphicsPoint(x,y));
	}
	public void setP2(GraphicsPoint p1){
		this.p2 = p2;
	}

	public void setP2(int x, int y){
		setP2(new GraphicsPoint(x,y));
	}

	/**
	 * draw
	 * 		draws the line on the screen
	 *
	 * @param - g - Graphics object
	 */
	public void draw(Graphics g){
		g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
	}

}