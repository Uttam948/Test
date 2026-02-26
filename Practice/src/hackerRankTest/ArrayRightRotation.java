package hackerRankTest;

public class ArrayRightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int arr[] = {1,2,3,4,5};
		int d = 2;
		
		
		for(int i =0 ; i < 4 ; i++) {
			int n = arr.length -1;
			 int temp = arr[n];
			
			 while(n > 0) {
				 
				 arr[n] = arr[n-1];
				 n--;
			 }
			 
			 arr[0] =temp;
		}
		
		for(Integer i : arr) {
			
			System.out.print(i);
		}

	}
	
	

}
