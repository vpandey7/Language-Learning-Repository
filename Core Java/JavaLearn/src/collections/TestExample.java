package collections;

import java.util.HashSet;
import java.util.Iterator;

class Animal{
	public int i =12;
	
	public Animal(){
		i=13;
	}
	public String toString(){
		return "Animal " +i;
	}
}

public class TestExample {

	public static void main(String[] args) {
		HashSet s = new HashSet();
		s.add(new Animal());
		s.add(new Animal());
		
		Iterator iter = s.iterator();
		while (iter.hasNext()) {
		    System.out.println(iter.next());
		}
	}
}
