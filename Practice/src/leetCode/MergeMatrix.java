package leetCode;

import java.util.TreeSet;

public class MergeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = {{1,3},{2,6},{8,10},{15,18}};
		int arr2[][] = new int [arr.length-1][2];
		//int arr[][] = new int [arr.length-2][2];
		
		for(int i = 0 ;i<arr.length-1 ; i++) {
			 
			for(int j =0 ;j< arr[i].length ; j++) {
				
				if(arr[i][0] > arr[i+1][j]) {
					arr2[i][j] = arr[i][j];
				}else if(arr[i][0] < arr[i+1][j]) {
					arr2[i][j] = arr[i][j];
				}
				
				System.out.println(arr2[i][j]);
				
			}
		}
		
	}

}
