package oops;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle();
		
		System.out.println("radius is "+ c1.getRadius());
		System.out.println("Area is " + c1.getArea());
		System.out.println("Color is " + c1.getColor());
		
		Circle c3 = new Circle();
		c3.setRadius(5);
		c3.setColor("Brown");
		System.out.println(c3.getRadius());
		System.out.println(c3.getColor());
		
		/*
		
		Circle c2 = new Circle(2.0);
		System.out.println("radius 2nd circle  is "+ c2.getRadius());
		System.out.println("Area 2nd circle is " + c2.getArea());
		System.out.println("Color 2nd circle  is " + c2.getColor());
		
		Circle c3 = new Circle(3.0, "blue");
		System.out.println("radius 3rd circle  is "+ c3.getRadius());
		System.out.println("Area 3rd circle is " + c3.getArea());
		System.out.println("Color 3rd circle is " + c3.getColor());
		*/
	}

}
