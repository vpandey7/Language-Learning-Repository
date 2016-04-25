package collections;

import java.util.ArrayList;
import java.util.Iterator;



class Student {
	int rollno;
	String name;
	static final String school = "ASU";

	Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;

	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", school=" + school +"]";
	}
	
	
	

}

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(1, "Aman");
		Student s2 = new Student(2, "Bipin");
		Student s3 = new Student(3, "Chatur");
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()){
			Student st = (Student) itr.next();
			System.out.println(st.rollno +" " +st.name + " " +Student.school);
		}
		
		for(Student st1:al){
			System.out.println(st1.rollno +" " +st1.name + " " +Student.school);
		}

		
				
		//System.out.println(al);

	}

}
