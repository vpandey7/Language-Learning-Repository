package udemy;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

//LinkedList Code 

public class Lec54 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
		//list.add(100);
		//list.add(5);
		
		//System.out.println(list.get(1));
		
		

	}
	private static void doTimings(String type, List<Integer> list){
		
		for(int i=0; i<1E5; i++){
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		/*
		//Add items at end of the list
		
		
		for(int i=0; i<1E5; i++){
			list.add(i);
		}*/
		
		// Add items elsewhere of the list
		
		for(int i=0; i<1E5; i++){
			list.add(10000, i);
		}
	
		
		long end = System.currentTimeMillis();
		
		
		System.out.println("Time taken: " + ( end-start) + " ms for " + type );
		
	}

}
