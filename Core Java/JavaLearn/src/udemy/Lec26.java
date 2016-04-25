package udemy;

public class Lec26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine mac1 = new Machine();
		mac1.start();
		mac1.stop();
		
		Car car1 = new Car();
		car1.start();
		car1.stop();
		car1.setName("Hyundai");
		System.out.println("Car name is : " + car1.getName());

	}

}
