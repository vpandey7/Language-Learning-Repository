package udemy;

import java.util.ArrayList;

// ArrayList code

public class Lec53 {

	public static void main(String[] args) {
		
		//Declaring Arraylist(expandable Array)
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//Adding and retrieving values
		numbers.add(10);
		numbers.add(100);
		numbers.add(7);
		System.out.println(numbers.get(1));
		
		
		// Indexed loop iteration
		System.out.println("\nIteration #1:");
		
		for(int i=0;i < numbers.size();i++){
			System.out.println(numbers.get(i));
		}
		System.out.println("\nIteration #2:");
		for(Integer value:numbers){
			System.out.println(value);
		}
		
		// Removing items from list
		
		// Removing items from the Array list is slow if you remove from the starting as it has to move every other item
		// every item one step back.
		// Removing from end is fast in ArrayList 
	}

}
