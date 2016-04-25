package oops;

public class Author {
	private String name;
	private String email;
	private char gender;
	
	//Constructor
	public Author(String name, String email, char gender) {
		
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	//Public getters and setters for private variables
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	
	//toString
	
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender="
				+ gender + "]";
	}
	
	
	
	
	

}
