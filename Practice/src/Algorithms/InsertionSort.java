package Algorithms;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {9,7,8,6,4,5,4,3,2};
		//798645432
		
		
		for(int i =1;i<arr.length;i++) {
			
			int temp = arr[i];
			
			int j = i-1;
			
			while(j >= 0 && arr[j] > temp) {
				
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]  =temp;
			
		}
			
		for(Integer i : arr) {
			
			System.out.print(i);
		}

	}

}
