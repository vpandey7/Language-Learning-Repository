package abstractclass;

public class Lec41 {
	
	public static void main(String[] args) {
		
		Camera cam1 = new Camera();
		cam1.setId(4);
		System.out.println(cam1.getId());
		
		Car car1 = new Car();
		car1.setId(10);
		System.out.println(car1.getId());
		cam1.start();
		car1.stop();
		car1.run();
		
		//Machine machine1 = new Machine();
	}

}
