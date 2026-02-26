package Algorithms;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a = new int[]{1,2,3,4,5,6,7,8,9};
		
		//the array should be initially sorted.
		System.out.println(binarySearch(a, 5));
		
	}

	public static int binarySearch(int[]arr ,  int item) {
		
		int i =0 , j = arr.length;
		
		while(true) {
			
			int mid = (i+j)/2;
			
		if(arr[mid] == item) {
			return item;
		}else if(arr[mid] < item) {
			
			i = mid+1;
			
		}else {
			j = mid-1;
		}
		 
		}
		
		
	}
}
