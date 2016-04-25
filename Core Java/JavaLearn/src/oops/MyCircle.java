package oops;

public class MyCircle {
	//instance variables
	private MyPoint center;
	private double radius;
	
	//Constructor
	
	public MyCircle(){
		center = new MyPoint();
		radius = 1.0;
	}
	
	
	//Constructor that takes x,y and radius
	public MyCircle(int x , int y , int radius) {
		// TODO Auto-generated constructor stub
		//this.x = x;
		//this.y = y;
		center = new MyPoint(x,y);
		this.radius = radius;
		
	}
	
	// Constructor that takes MyPoint object and radius 
	public MyCircle(MyPoint center , int radius){
		this.center = center;
		this.radius = radius;
	}
	
	//Getters and Setters
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	public MyPoint getCenter(){
		return center;
	}
	
	public void setCenter(MyPoint center){
		this.center = center;
	}
	
	public int getCenterX(){
		return center.getX();
		
	}
	
	public int getCenterY(){
		return center.getY();
		
	}
	
	public void setCenterX(int x){
		center.setX(x);
	}
	
	public void setCenterY(int y){
		center.setY(y);
	}
	public void setCenterXY(int x, int y){
		center.setX(x);
		center.setY(y);
	}

	@Override
	public String toString() {
		return "MyCircle [center=" + center + ", radius=" + radius + "]";
	}
	
	public double getArea(){
		
		return Math.PI*radius*radius;
	}
	
	

}
