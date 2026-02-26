package NovermberCoding_2025;

public class PracticeThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3};
		recursion(arr,0,0);

	}

	public static void recursion(int arr[] , int sum , int i ) {
		
		if(i >= arr.length) {
			System.out.println(sum);
			sum = 0 ;
			return;
		}
		
		sum = sum + arr[i];
		recursion(arr , sum , i+1);
		sum = sum - arr[i];
		recursion(arr, sum , i+1);
	}
}
