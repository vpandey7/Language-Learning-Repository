package udemy;

class Person {

	String name;
	int age;

	void speak() {
		for (int i = 0; i < 3; i++) {
			System.out.println("My name is: " + name + " and I am " + age
					+ " years old");
		}
	}
	
	void sayHello(){
		System.out.println("Hello There! ");
	}

}

public class Lec17 {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.age = 18;
		p1.name = "Bob Sagget";
		p1.speak();
		p1.sayHello();

		Person p2 = new Person();
		p2.age = 27;
		p2.name = "Clive Bixby";
		p2.speak();
		p2.sayHello();

		// System.out.println("My name is " + p2.name+" "+"and my age is " +
		// p2.age);

	}

}
