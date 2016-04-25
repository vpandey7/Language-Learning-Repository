package oops;

public class TestMyTriangle {

	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint(15, 12);
		MyPoint p2 = new MyPoint(5, 9);
		MyPoint p3 = new MyPoint(12, 10);
		
		MyTriangle t1 = new MyTriangle(p1, p2, p3);
		MyTriangle t2 = new MyTriangle();
		System.out.println(t1);
		//System.out.println(p2.getX());
		System.out.println(p1.distance(p2));
		System.out.println(p2.distance(p3));
		System.out.println(p3.distance(p1));
		System.out.println(t1.getPerimeter(t1));
	}

}
