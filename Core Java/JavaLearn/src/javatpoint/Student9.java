package javatpoint;

public class Student9 {
	int id;
	String name;
	static String college ="ASU";
	
	Student9(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	void display(){
		System.out.println(id +" " +name + " "  +college);
	}
	
	static void change(){
		college="NCSU";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student9 s1 = new Student9(2, "Hari");
		Student9.change();
		s1.display();

	}

}
