package udemy;

class PersonNew{
	String name;
	int age;
	
	void speak(){
		System.out.println("My name is "+name+" and my age is " + age);
	}
	
	int yearsToRetirement(){
		int yearsLeft = 65-age;
		//System.out.println("Years left to retirement are : " + yearsLeft);
		return yearsLeft;
	}
	
	int getAge(){
		return age;
	}
	
	String getName(){
		return name;
	}
}

public class Lec19 {
	
	public static void main(String[] args) {
		
		PersonNew p1 = new PersonNew();
		p1.name = "Bob Sagget";
		p1.age = 25;
		//p1.speak();
		int yearsLeft = p1.yearsToRetirement();
		System.out.println("Years left to retirement are : " + yearsLeft);
		int age = p1.getAge();
		String name = p1.getName();
		
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
		
		
	}

}
