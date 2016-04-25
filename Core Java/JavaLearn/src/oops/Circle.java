package oops;

public class Circle {
	
	//private instance variables
	private double radius;
	private String color;
	
	// 1st Constructor to set the default value for instance variables
	
	public Circle(){
		
		radius = 1.0;
		color ="Red";
	}
	
	//2nd Constructor with given radius and default color
	
	public Circle(double radius){
		radius =this.radius;
		color ="Red";
	}
	
	//3rd Constructor with given radius and color
	
	public Circle(double radius,String c){
		radius = this.radius;
		color =c;
	}
	
	//Public method for getting Radius
	
	public double getRadius(){
		return radius;
	}
	
	//Public method to get the Color
	
	public String getColor(){
		return color;
	}
	
	//Setter for instance variable radius
	
	public void setRadius(double radius){
		radius =this.radius;
	}
	
	//Setter for instance variable color
	
	public void setColor(String color){
		color = this.color;
	}
	
	//Public method to get the Area of the Circle
	
	public double getArea(){
		return radius*radius*Math.PI;
	}
	
	
	

}
