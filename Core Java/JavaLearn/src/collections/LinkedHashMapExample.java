package collections;

import java.util.LinkedHashMap;

//It is same as HashMap instead maintains insertion order.

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer,String>();
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
