/**
 * GraphicsPoint
 *
 * 		a point that is limited to positive integers
 *
 * 
 */

public class GraphicsPoint {
	private int x, y;

	/**
	 *  Constructor
	 *
	 *  @param - x - x coordinate of point
	 *  @param - y - y coordinate of point
	 * 	
	 */
	public GraphicsPoint(int x, int y){
		setX(x);
		setY(y);
	}
	
	/**
	 * getters and setters
	 * 
	 **/
	public int getX(){
		return this.x;
	}
	public void setX(int x){
		if(x >= 0){
			this.x = x;
		}	
	}
	public int getY(){
		return this.y;
	}
	public void setY(int y){
		if(y >= 0){
			this.y = y;
		}	
	}
}