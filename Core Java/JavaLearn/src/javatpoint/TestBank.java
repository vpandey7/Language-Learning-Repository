package javatpoint;




public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s = new SBI();	
		System.out.println(s.getRateOfInterest());
		//Bank b1 = new Bank();
		//System.out.println("Default"+b1.getRateOfInterest());
		//SBI s = new SBI();
		Bank b3 = new AXIS();
		ICICI b4 = new ICICI();
		System.out.println(b3.getRateOfInterest());
		System.out.println(b4.getRateOfInterest());
		

	}

}
