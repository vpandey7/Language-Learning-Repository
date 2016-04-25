package udemy;

import java.util.ArrayList;
import java.util.HashMap;

class Abc{
	
}

public class Lec34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//////Generics with one Argument////////
		
		
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Pear");
		
		String getfruit = fruits.get(2);
		System.out.println(getfruit);
		System.out.println(fruits.get(1));
		
//////////////Generics can have more thanone arugument///////
		
		HashMap<Integer, String> map = new HashMap<>();
		
		////// You can also pass class as a parameter////
		
		ArrayList<Abc> abc = new ArrayList<Abc>(); 
		
		
	}

}
