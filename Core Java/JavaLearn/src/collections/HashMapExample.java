package collections;

import java.util.HashMap;

// contains values based on the key.
// contains only unique elements.
// It may have one null key and multiple null values.
// It maintains no order.

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(4, "Four");
		hm.put(3, "Three");
		hm.put(1, "One");
		
		
		for(int i:hm.keySet()){
			System.out.println(i);
			
		}
		for(String s:hm.values()){
			System.out.println(s);
		}

	}

}
