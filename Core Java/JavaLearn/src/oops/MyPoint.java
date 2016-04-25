package oops;

public class MyPoint {
	
	// instance variables
	private int x; 
	private int y;
	
	// Constructor with no Arguments sets point to (0,0)
	
	public MyPoint(){
		x = 0;
		y = 0;
	}
	
	// Constructor with x and y arguments
	
	public MyPoint(int x , int y){
		this.x = x;
		this.y = y;
	}
	// Getters and Setters for x and y
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	// method setXY() to set both x and y.
	public void setXY(int x , int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "MyPoint [x=" + x + ", y=" + y + "]";
	}
	
	// method distance that returns the distance from this point to another point at the given (x, y)
	public double distance(int x , int y){
		int xDiff = this.x-x;
		int yDiff = this.y-y;
		
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	//overloaded distance 
	
	public double distance(MyPoint another ){
		int xDiff = this.x - another.x;
		int yDiff = this.y - another.y;
		
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
		
	}
	
	
	
	

}
