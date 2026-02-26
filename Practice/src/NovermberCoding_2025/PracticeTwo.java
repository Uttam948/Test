package NovermberCoding_2025;

import java.util.List;

public class PracticeTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void recursion(int idx , int arr[], int target , List<Integer> list) {
		
		if(target == 0) {
			
			System.out.println(list);
		}
		
		for(int i = idx ; i < arr.length ; i++) {
			
			if(arr[idx] == arr[i]) {
				recursion(idx+1, arr, target-arr[i], list);
				break;
			}
			recursion(idx+1, arr, target-arr[i], list);
		}
	}

}
