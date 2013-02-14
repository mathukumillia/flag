/**
 *
 * Line
 * 		draws a line between two graphics points
 * 
 */

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class Line extends JFrame{
	
	private GraphicsPoint p1;
	private GraphicsPoint p2;

	public Line(int x1, int y1, int x2, int y2){
		GraphicsPoint p1 = new GraphicsPoint(x1,y1);
		GraphicsPoint p2 = new GraphicsPoint(x2,y2);
		this(p1,p2);
	}

	public Line(GraphicsPoint p1, GraphicsPoint p2){
		this.p1 = p1;
		this.p2 = p2;
	}


}