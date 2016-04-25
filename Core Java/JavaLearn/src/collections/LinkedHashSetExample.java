package collections;

import java.util.LinkedHashSet;

//contains unique elements only like HashSet. It extends HashSet class and implements Set interface.
//maintains insertion order.


public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("Barty");
		hs.add("John");
		hs.add("Sam");
		hs.add("Tyrion");
		hs.add("Tyrion");
		hs.add("Ravi");  
		hs.add("Vijay");  
		hs.add("Ravi");  
		hs.add("Ajay");
		
		// Iterate over the LinkedHashSet
		for(String i:hs){
			System.out.println(i);
		}

	}

}
