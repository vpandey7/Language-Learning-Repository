package udemy;

class Frog{
	String name;
	int age;
	
	public void setName(String name){
		this.name = name;
		
	}
	
	public void setAge(int age){
		this.age = age;
		
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
		
	}
	
	public void setInfo(String name,int age){
		setName(name);
		setAge(age);
		
		
	}
}

public class Lec21 {
	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		//frog1.name = "Bernie";
		//frog1.age = 12;
		frog1.setInfo("Bryan", 7);
		//frog1.setAge(15);
		//frog1.setName("Ellen");
		
		
		System.out.println("Frog age is " + frog1.getAge());
		System.out.println("Frog name is " + frog1.getName());
		
	}

}
