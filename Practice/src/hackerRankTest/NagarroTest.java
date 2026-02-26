package hackerRankTest;

public class NagarroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,3,8};
		int n = 3;

	 		for(int i =0 ; i<arr.length ; i++) {
	 			int sum = recurr(arr , i , n-2 );
	 			
	 			System.out.println(sum);
	 		}
	 		
	 		int ar[] = {1,2,4,5,7};
	 		for(int i =0 ; i<ar.length ; i++) {
	 			
	 			for(int j = 0;j<ar.length ; j++) {
	 				 
	 			}
	 		}
	}
	
	
	public static int recurr(int arr[] , int i , int n ) {
		int s1 = 0, s2 = 0;
		int k = arr[i];
		int sum2 = 0;
		int m = i;
		
		
		while(n> 0) {
			if(i > 0 && n > 0) {
				s1 = k - arr[--i];
				n--;
				sum2 = sum2 + s1;
			}
			if(m < arr.length-1 && n>0) {
			   s2 = arr[++m] - k;
			   n--;
			   sum2 = sum2 + s2;
			}
			
			 
		}
		//System.out.println();
		
		return sum2;
	}
	
}
