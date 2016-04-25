package euler;

public class PrimeFactor {

	public static void main(String[] args) {
		
		int n = 13195;
		int max = 77777777;
		
		for(int i=1;i<13195;i++){
			
			if(13195%i==0 && i%2!=0){
				max =i ;
				//System.out.println(i);
				if(max<i){
					max=i;
				}
			}
			
		}
		// TODO Auto-generated method stub
		System.out.println(max);
	}

}
