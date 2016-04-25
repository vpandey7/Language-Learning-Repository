package collections;

import java.util.HashSet;

//HashSet contains unique elements only
//uses hashtable to store the elements.It extends AbstractSet class and implements Set interface.

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Barty");
		hs.add("John");
		hs.add("Sam");
		hs.add("Tyrion");
		hs.add("Tyrion");
		hs.add("Ravi");  
		hs.add("Vijay");  
		hs.add("Ravi");  
		hs.add("Ajay");
		for(String i:hs){
			System.out.println(i);
		}

	}

}
