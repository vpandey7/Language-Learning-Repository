package datastructure;

import java.util.Arrays;

public class HashTable {
	String [] theArray;
	int arraySize;
	
	// constructor for HashTable
	
	HashTable(int size) {
		arraySize = size;
		theArray = new String[size];
		Arrays.fill(theArray, "-1");
	}
	
	// Hash function that matches the value of the item in the array to sam index in the HashTable  
	
	public void hashfunction(String[] stringsForArray, String[] theArray ){
		
		for(int i=0;i<stringsForArray.length;i++){
			String newElemVal = stringsForArray[i];
			theArray[Integer.parseInt(newElemVal)] = newElemVal;
		}
		
	}


	public static void main(String[] args) {
		
		HashTable func = new HashTable(30);
		String[] elemToAdd = {"1","4","17","12","6","19","26","22"};
		func.hashfunction(elemToAdd, func.theArray);
		for(int i=0;i<func.theArray.length;i++){
			System.out.println("value at " +i +" is " + func.theArray[i]);
		}

	}

}
