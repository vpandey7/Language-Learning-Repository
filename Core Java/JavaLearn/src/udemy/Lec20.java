package udemy;

class Robot{
	 public void speak(String text){
		System.out.println(text);
	}
	 
	 public void jump(int height){
		 System.out.println("Jump height in meters is " + height);
	 }
	 
	 public void move(String direction,int distance){
		 System.out.println("Moved in direction " + direction + " Moved distance in meters is " + distance);
	 }
}

public class Lec20 {
	
	public static void main(String[] args) {
		
		Robot sam = new Robot();
		sam.speak("Hello There");
		sam.jump(20);
		sam.move("West", 45);
		
		String direc = "East";
		int dist = 32;
		sam.move(direc, dist);

		
	}	

}
