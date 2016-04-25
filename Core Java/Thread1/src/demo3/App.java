package demo3;

import java.util.Scanner;

class Processor extends Thread{
	
	private volatile boolean running = true;

	@Override
	public void run() {
		
		while(running){
			System.out.println("Hello");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	public void shutdown(){
		running = false;
	}
	
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Processor proc1 = new Processor();
		proc1.start();
		
		System.out.println("Press Enter to stop");
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		
		proc1.shutdown();

	}

}
