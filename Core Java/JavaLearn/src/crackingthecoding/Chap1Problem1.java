package crackingthecoding;

// algorithm to determine if string has all unique chahracters.Not allowed to use additional Data Structure

public class Chap1Problem1 {
	
	public boolean isUniqueChar(String str){
		boolean[] char_set = new boolean[Character.MAX_VALUE];
		for(int i=0; i<str.length();i++){
			int val = str.charAt(i); // getting the ASCII value
			if(char_set[val]){
				return false;
			}
			char_set[val] = true; // setting the index in char_set as true if character found first time 
			
		}
		return true;	
	}
	
	

	public static void main(String[] args) {
		
		String s = "!23a	  ";
		for(int i=0; i<s.length();i++){
			int val = s.charAt(i);
		System.out.println(val);
		}
		
		Chap1Problem1 p1 = new Chap1Problem1();
		System.out.println(p1.isUniqueChar("!23a	  "));
		
		
		
		
		
						
		

	}
}



