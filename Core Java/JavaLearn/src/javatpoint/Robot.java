package javatpoint;

public class Robot {
	
	private int id;
	
	//Member Inner Class
	
	private class Brain{
		public void think(){
			System.out.println("Robot is thinking with id " + id);
		}
	}
	//static Nested Class
	
	public static class Battery{
		public void charge(){
			System.out.println("Battery Charging");
		}
	}
	
	public Robot(int id){
		
		this.id =id;
	}
	
	public void start(){
		System.out.println("Robot is starting with id "+id);
		Brain brain = new Brain();
		brain.think();
		
		String name = "Gizmo";
		//Local Inner Class
		class Temp{
			public void doSomething(){
				System.out.println("Id is "+ id);
				System.out.println("name of robot is " + name);
			}
		}
		Temp temp = new Temp();
		temp.doSomething();
	}

}
