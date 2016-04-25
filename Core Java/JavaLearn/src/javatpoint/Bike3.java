package javatpoint;

class Vehicle{
	int speed = 50;
	Vehicle(){
		
		System.out.println("This is a vehicle");
	}
}

public class Bike3 extends Vehicle {
	Bike3(){
		super();
		System.out.println("THis is Bike3");
	}
	int speed = 100;
	
	void display(){
		System.out.println("Speed of Bike is "+ speed);
		System.out.println("Speed of vehicle is "+ super.speed);
	}
	
	public static void main(String[] args) {
		Bike3 b1 = new Bike3();
		b1.display();
	}

}
