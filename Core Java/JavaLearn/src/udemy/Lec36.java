package udemy;

class Machinenew{
	public void start(){
		System.out.println("Starting the Machine");
	}
}

interface Leaf{
	public void grow1();
}

public class Lec36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machinenew machine1 = new Machinenew(){

			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("Camera snapping");
			}
			
		};
		machine1.start();
		
		Leaf plant1 = new Leaf() {

			
			public void grow1() {
				// TODO Auto-generated method stub
				System.out.println("Growing plant");
				
			}
			
			
		};
		plant1.grow1();

	}

}
