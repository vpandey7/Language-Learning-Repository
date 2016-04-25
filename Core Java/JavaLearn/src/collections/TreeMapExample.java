package collections;

import java.util.TreeMap;

//same as HashMap but maintains ascending order

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> tm = new TreeMap<Integer,String>();
		
		tm.put(1, "A");
		tm.put(2, "D");
		tm.put(8, "Z");
		tm.put(2, "C");
		tm.put(3, "Z");
		tm.put(5, "E");
		tm.put(7, "C");
		
		for(int i:tm.keySet()){
			System.out.println(i);
		}
		
		for(String s:tm.values()){
			System.out.println(s);
		}

	}

}
