package javatpoint;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="java string split method by javatpoint";  
		String[] words=s1.split("\\s");//splits the string based on string  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println(w);  
		} 
		System.out.println("Hello");
		System.out.println(words[0]);
		System.out.println(words[1]);
		System.out.println(words[2]);


	}

}
