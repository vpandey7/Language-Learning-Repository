package javatpoint;

public class TestImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Hello";
		s= s.concat("How");
		System.out.println(s);
		s=s.concat("No");
		System.out.println(s);
		s=s.replace("No", "Hello");
		System.out.println(s);


	}

}
