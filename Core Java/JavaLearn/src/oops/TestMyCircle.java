package oops;

public class TestMyCircle {

	public static void main(String[] args) {
		// Test Class for MyCircle methods
		
		MyCircle c1 = new MyCircle(2, 3, 5);
		
		System.out.println(c1);
		//c1.setCenterXY(0, 3);
		//System.out.println(c1);
		//MyPoint p1 = new MyPoint(4, 0);
		c1.setRadius(7);
		
		//c1.setCenter(p1);;
		System.out.println(c1.getRadius());
		System.out.println(c1.getCenterX());
		//System.out.println(c1);
		System.out.println(c1.getArea()); 

	}

}
