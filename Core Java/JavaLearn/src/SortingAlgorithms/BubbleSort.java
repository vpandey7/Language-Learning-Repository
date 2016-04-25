package SortingAlgorithms;

public class BubbleSort {
	
	public static void main (String[] args){
		int A[]={1,2,18,4,5};
		int n= A.length;
		int temp=0;
		int flag = 0;
		
		//System.out.println("Hello");
		
		
		for (int i = 0; i < n; i++) { //Pass on to the array
			for (int j = 0; j < n-i-1; j++) { // Inner loop to compare the elements

				if (A[j] > A[j + 1]) {
					
					//Swap the elements
					temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
					flag = 1;
				}
			}
		}
		if(flag == 0){
			System.out.println("Sorted Array");
		}
		for(int i=0;i<n;i++){
			System.out.println(A[i]);
		
		}
		
		
		
		
		/*for(int j=0;j<n;j++){
			
		
		
		for(int i=0;i<(n-j-1);i++){
			if(A[i+1]<A[i]){
				temp = A[i];
				A[i]=A[i+1];
				A[i+1]=temp;
				flag =1;
			}
		}
		}
		if(flag==0){
			System.out.println("Sorted Array");
		}
		for(int i=0;i<n;i++){
			System.out.println(A[i]);
		
		}
*/		
	}

}
