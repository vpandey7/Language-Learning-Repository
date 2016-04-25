package oops;

public class MyTriangle {
	//instance variables
	
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	
	//Constructors
	public MyTriangle(){
		v1 = new MyPoint();
		v2 = new MyPoint();
		v3 = new MyPoint();
	}
	
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
		v1 = new MyPoint(x1,y1);
		v2 = new MyPoint(x2, y2);
		v3 = new MyPoint(x3, y3);
	}
	
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	public MyPoint getV1() {
		return v1;
	}

	public MyPoint getV2() {
		return v2;
	}

	public MyPoint getV3() {
		return v3;
	}

	@Override
	public String toString() {
		return "MyTriangle [v1=" + v1.getX() + " " + v1.getY() + ", v2=" + v2 + ", v3=" + v3 + "]";
	}
	
	public double getPerimeter(MyTriangle t){
		
		double d1 = v1.distance(v2);
		double d2 = v2.distance(v3);
		double d3 = v3.distance(v1);
		return (d1+d2+d3);
		
	}
	
	


	
	
	

}
