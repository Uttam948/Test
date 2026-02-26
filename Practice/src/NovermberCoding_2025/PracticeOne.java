package NovermberCoding_2025;

public class PracticeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 5, -1, 7, -3, -1, -2} ; //
		int k = 4;
       System.out.println(SumOfMinMaxSubArray(arr,k));
	}

	public static int SumOfMinMaxSubArray(int arr[] , int k) {
		int sum = 0;
		for(int i =0 ; i <= arr.length-k ; i++) {
			int max = 0, min = arr[i];
			
			int j = i+k , n = i;
			while(n < j) {
				if(arr[n]> max) {
					max= arr[n];
				}
				if(arr[n] < min) {
					min = arr[n];
				}
				n++;
			}
			sum = sum + (max + min);
		}
		return sum;
		
	}
}
