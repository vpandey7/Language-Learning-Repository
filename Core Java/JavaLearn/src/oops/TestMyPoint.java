package oops;

public class TestMyPoint {

	public static void main(String[] args) {
		// Test Program
		MyPoint p1 = new MyPoint(15, 12);
		MyPoint p2 = new MyPoint(12,10);
		MyPoint p3 = new MyPoint();
		//p3.setX(5);
		//p3.setY(2);
		//p3.setXY(5, 2);
		// Testing the overloaded method distance()
		//System.out.println(p3.distance(3, 0));
		System.out.println("Hello");
		System.out.println(p1.distance(p2));
		
		MyPoint[] points = new MyPoint[10];
		//System.out.println(points.length);
		
		for ( int i=0;i< points.length;i++){
			points[i] = new MyPoint(i,i);
			//System.out.println(points[i].distance(p3));
			
		}

	}

}
