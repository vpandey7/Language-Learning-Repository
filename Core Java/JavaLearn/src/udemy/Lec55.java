package udemy;

import java.util.HashMap;

// HashMap code

public class Lec55 {
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(5, "Five");
		map.put(7, "Seven");
		map.put(10, "Ten");
		map.put(2, "Two");
		
		map.put(4, "Four");
		map.put(7,"Hello");
		
		String text = map.get(7);
		System.out.println(text);
		
	}

}
