package javatpoint;

abstract class Bank {
	
	abstract int getRateOfInterest();
}

class SBI extends Bank{
		
		int getRateOfInterest(){
			return 7;
		}
	}
	
class ICICI extends Bank{
		int getRateOfInterest(){
			return 8;
		}
		
	}
	
class AXIS extends Bank{
		int getRateOfInterest(){
			return 9;
		}
		
	}

