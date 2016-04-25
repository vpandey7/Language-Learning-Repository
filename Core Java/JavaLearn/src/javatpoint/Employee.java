package javatpoint;

public class Employee {
	
	// Instance variables
	int id;
	String name;
	Address address;
	
	// Constructor
	public Employee(int id, String name,Address address){
		this.id = id;
		this.name = name;
		this.address = address;
		
	}
	
	public void display(){
		
		System.out.println("Name "+name);
		System.out.println("Address is " +address.city + " " + address.state + " " + address.country);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address = new Address("Tempe", "AZ", "USA");
		Employee emp = new Employee(1, "Nick", address);
		
		emp.display();
	}

}
