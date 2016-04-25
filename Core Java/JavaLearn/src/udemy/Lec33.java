package udemy;

class Machine1{
	public void start(){
		System.out.println("Machine started");
	}
}

class Camera extends Machine1{

	
	public void start() {
		System.out.println("Camera Started");
	}
	
	public void snap(){
		System.out.println("Snap taken");
	}	
	
}

public class Lec33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine1 machine1 = new Machine1();
		Camera camera1 = new Camera();
		machine1.start();
		camera1.start();
		camera1.snap();
		
		//Upcasting
		
		Machine1 machine2 = camera1;
		machine2.start();
		
		//Downcasting
		
		Machine1 machine3 = new Camera();
		System.out.println("Downcasting");
		Camera camera2 = (Camera) machine3;
		machine3.start();
		camera2.snap();
		
		
		
		
		

	}

}
