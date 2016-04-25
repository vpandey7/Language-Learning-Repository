package collections;

import java.util.TreeSet;

//contains unique elements only like HashSet.
//maintains ascending order

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Barty");
		ts.add("John");
		ts.add("Sam");
		ts.add("Tyrion");
		ts.add("Tyrion");
		ts.add("Ravi");  
		ts.add("Vijay");  
		ts.add("Ravi");  
		ts.add("Ajay");
		
		// Iterate over the LinkedHashSet
		for(String i:ts){
			System.out.println(i);
		}
		

	}

}
