package javatpoint;

public class Excep2 {
	
	static void validate(int age){
		if(age<18){
			throw new ArithmeticException("not a valid age");
		}
		else{
			System.out.println("Your are eligible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(21);
		System.out.println("Rest of the code executed");

	}

}
