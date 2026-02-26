package hackerRankTest;

public class InstaProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5};

		for(int i =0;i<arr.length ; i++) {
		
			int sum = recur(i , arr);
			//System.out.println(sum);
		}
		
		for(int i =0;i<arr.length ; i++) {
			int sum = 1;
		   for(int j = 0; j< arr.length;j++) {
			   
			   if(i != j) {
				   
				   sum  = sum * arr[j]; // O(n^2) 
			   }
		   }
		   
		   System.out.println(sum);
		}
	}
	
	public static int recur(int k , int arr[]) {
		
		int sum = 1;
		int m = k;
		
		while(k > 0) {
			sum = sum * arr[--k];
			
		}
		while(m < arr.length-1) {
			sum = sum * arr[++m];
		}
		return sum;
		
		
	}

}
