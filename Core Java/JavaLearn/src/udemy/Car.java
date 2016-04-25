package udemy;

//Inheritance
public class Car extends Machine{
	String name;
	
	public void setName(String name){
		this.name = name;
		
	}
	public String getName(){
		return name;
	}
	//OverRide methods
	public void start(){
		System.out.println("Car Started.");
		//super.start();
	}
	
	public void stop(){
		System.out.println("Car Stopped.");
	}


}
