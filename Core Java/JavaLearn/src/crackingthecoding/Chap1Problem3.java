package crackingthecoding;

import java.util.Arrays;


public class Chap1Problem3 {
	public boolean stringpermutation(String str1,String str2){
		char[] a = str1.toCharArray();
		char[] b = str2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a, b)){
			System.out.println("Permutation");
			return true;
			
		}
		else{
			System.out.println("Not a permutation");
			return false;
		}
				
	}

	public static void main(String[] args) {
		
		//Chap1Problem3 cp3 = new Chap1Problem3();
		//cp3.stringpermutation("abcdf", "fdacb");
		
		String str1 = "abcdf";
		String str2 = "abcdf";
		char[] a = str1.toCharArray();
		char[] b = str2.toCharArray();
		
		int [] letters = new int[256];
		for(char c :a){
			letters[c]++;
		}
		for(int i=0;i<str2.length();i++){
			int val = str2.charAt(i);
			if(--letters[val]>0){
				System.out.println("Not a permutation");
			}
			else{
				System.out.println("Permutaion");
			}
			
			
			
		}
		
		
	}

}
