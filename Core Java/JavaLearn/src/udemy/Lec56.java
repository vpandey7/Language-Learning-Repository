package udemy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lec56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String > hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer,String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer,String>();
		
		//testMap(hashMap, "HashMap");
		//testMap(linkedHashMap,"LinkedHashMap");
		testMap(treeMap,"TreeMap");
	}
	
	public static void testMap(Map<Integer,String> map,String type){
		map.put(9, "fox");
		map.put(0, "cat");
		map.put(12, "lion");
		map.put(7, "tiger");
		map.put(14, "rat");
		map.put(2, "rabbit");
		map.put(8, "bear");
		map.put(4, "leopard");
		map.put(1, "snake");
		map.put(10, "dog");
		System.out.println("Key value pair for map type" + type);
		for (Integer key : map.keySet()) {
			
			String value = map.get(key);
			
			
			System.out.println(key + ": " +value);
		}
		
		
	}

}
