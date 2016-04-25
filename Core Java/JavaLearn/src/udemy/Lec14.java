package udemy;

public class Lec14 {
	public static void main(String[] args) {
		int val = 7;
		//System.out.println(val);
		
		int[] values;
		values = new int[3];
		System.out.println(values[0]);
		
		values[0] = 10;
		System.out.println(values[0]);
		
		for(int i=0;i<values.length;i++){
			values[i]=20;
			System.out.println(values[i]);
		}
		
		int[] numbers = {3,6,7};
		for(int i=0;i<numbers.length;i++){
			System.out.println(numbers[i]);
		}
	}

}
