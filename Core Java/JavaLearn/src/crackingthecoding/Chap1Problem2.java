package crackingthecoding;

public class Chap1Problem2 {
	
	// by converting to Char array- in place-O(n) space complexity and O(1) time

	public String reverseStringChar(String str) {

		char[] ch = str.toCharArray();

		int length = ch.length;
		System.out.println(length);
		int half = length / 2;

		for (int i = 0; i < half; i++) {
			char temp = ch[i];
			ch[i] = ch[length - 1 - i];
			ch[length - 1 - i] = temp;
		}
		System.out.println(ch);
		return "Reversed";

	}
	// By using new String
	
	public String reverseString2(String str){
		String reversed = "";
		for(int i=str.length()-1;i>=0;i--){
			reversed += str.charAt(i);
		}
		return reversed;
		
		
	}

	public static void main(String[] args) {

		Chap1Problem2 ch = new Chap1Problem2();
		System.out.println(ch.reverseStringChar("Hello"));
		System.out.println(ch.reverseString2("This is Reverse"));
		
		
	}

}
