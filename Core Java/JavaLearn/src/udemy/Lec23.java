package udemy;

class Thing{
	
	public String name;
	public static String description;
	public final static int LUCKY_NUMBER = 6;
	public static int count = 0;
	public int id;
	
	public Thing(){
		id = count;
		count++;
	}
	
	public static void showInfo(){
		//System.out.println(name);
		System.out.println("Hello");
		//System.out.println(description);
	}
	
	public void showName(){
		
		//System.out.println("From non static method");
		
		System.out.println("Object id is: " + id + " " + name + " " + description);
	}
}

public class Lec23 {
	public static void main(String[] args) {
		
		System.out.println("Count before objects created: " + Thing.count);
		
		Thing thing1 = new Thing();
		thing1.name = "Bobby";
		
		Thing thing2 = new Thing();
		thing2.name = "Fischer";
		
		Thing.description = "I am a static variable";
		
		System.out.println("Count after objects created: " + Thing.count);
		
		//System.out.println(thing1.name);
		//System.out.println(thing2.name);
		//System.out.println(Thing.description);
		thing1.showName();
		thing2.showName();
		Thing.showInfo();
		System.out.println(Thing.LUCKY_NUMBER);
		
	}

}
