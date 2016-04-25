package udemy;

public class Lec16 {
	public static void main(String[] args) {
		
		int[][] values = {
				{3, 5, 8},
				{1, 56, 6, 8},
				{2, 1}
		};
		//System.out.println(values[1][1]);
		//System.out.println(values[0][2]);
		
		for(int row=0;row<values.length;row++){
			
			for(int col=0;col<values[row].length;col++){
				System.out.print(values[row][col] + "\t");
			}
			System.out.println();
		}

	}

}
