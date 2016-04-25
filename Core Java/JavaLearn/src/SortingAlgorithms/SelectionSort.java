package SortingAlgorithms;

public class SelectionSort {
	
	public static void main(String[] args){
		
		int[] myArray = {2,2,1,1,3,3,3,7,7,5,5,4 };
		int n = myArray.length;
		
		for(int i=0;i<n-1;i++){
			int iMin=i; //iMin Stores the minimum index
			
			for(int j=(i+1);j<n;j++){ // inner loop for comparison of the elements
				if(myArray[j]<myArray[iMin]){
					iMin=j; // j has the minimum vale so giving the index of j to iMin
				}
			}
			
			//Swap the elements
			int temp = myArray[i];
			myArray[i] = myArray[iMin];
			myArray[iMin] = temp;
			
		}
		
		for(int i=0;i<n;i++){
			System.out.println(myArray[i]);
		}
		
	}	

}
