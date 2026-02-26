package multithreading;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = new int [] {1,2,3,4,5};
		int n =a.length;
		int k =0;
		
		while(k < n) {
			
			 for(int i =0 ; i<n ; i++) {
				 
				 a[i] = a[n];
				 a[n] = a[n-1];
				 
				 
			 }
			
			
			k++;
			
		}
	}

	
}
