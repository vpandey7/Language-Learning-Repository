package collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		LinkedList<Integer> ll2 = new LinkedList<Integer>();
		
		ll.add(2);
		ll.add(5);
		ll.add(7);
		ll2.addAll(ll);
		
		/*for(int i=0;i<ll.size();i++){
			System.out.println(ll.get(i));
		}*/
		
		System.out.println(ll.size());
		
		for(int i:ll){
			System.out.println(i);
		}

	}

}
