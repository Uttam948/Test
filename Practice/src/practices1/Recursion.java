package practices1;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //  System.out.println(recursion(6));
		int arr[] = {1,2,3,4,5,6,7};
		int n = arr.length-1;
		recursion(0 , n ,arr);
		
		for(int i =0 ;i <= n ; i++) {
			System.out.println(arr[i]);
		}
		
         // recursion(6);
	}

	public static void recursion(int i , int j , int arr[]) {
		
      if(i < j) {
			
			swap(i ,j , arr);
			recursion(i+1 , j-1 , arr);
		}else {
			return;
		}
         
	}
	public static void swap(int i , int j , int arr[]) {
		int temp  =arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
