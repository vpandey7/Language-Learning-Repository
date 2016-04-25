package euler;

import java.util.Scanner;

public class Fibonacci {
	
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c;
		int sum=0;
		//Scanner input = new Scanner(System.in);
		int n = 4000000;
		System.out.println(a + " " +b);
		
		for (int i=2;i<n;i++){
			c=a+b;
			System.out.println(" " + c);
			if(c%2==0){
				sum=sum+c;
			}
			
			a=b;
			b=c;
			
			
		}
		//System.out.println();
		System.out.println("sum is " +sum);
		
		
		
		
		
		
	}

}
