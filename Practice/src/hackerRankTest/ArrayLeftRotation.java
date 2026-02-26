package hackerRankTest;

import java.util.Arrays;
import java.util.List;

public class ArrayLeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//int arr[] = {1,2,3,4,5};
		int d = 2;
		
		List<Integer> arr = Arrays.asList(1,2,3,4,5);
		
		int arrr[] = {1,2,3,4,5};
		
		ArrayLeftRotation arrayLeftRotation = new ArrayLeftRotation();
		arrayLeftRotation.leftRotation(arrr, 4);
		
	//	arr.add(1, arr.get(2+1));
		int len = arr.size()-1;
		
		for(int i =0 ; i < 4 ; i++) {
			int n = 0;
			 int temp = arr.get(n);
			
			 while(n < arr.size()-1) {
				
				 //arr.remove(n);
				arr.set(n, arr.get(n+1));
				 n++;
			 }
			 arr.set(len, temp);
			 
				}
		
		
		
		for(Integer i : arr) {
			
			//System.out.print(i);
		}


	}
	
	public void leftRotation(int arr[] ,  int rotation) {
		
		
		int newarr[] = new int[arr.length];
		int n= arr.length-1;
		int i =0 ;
		int j = 0;
		int rot = rotation;
		while(rotation <= n) {
			
			newarr[i] = arr[rotation];
			i++;
			rotation++;
		}
		
		while(j < rot) {
			newarr[i] = arr[j];
			i++;j++;
		}
		
		
		
		 for(Integer k : newarr) {
			 System.out.println(k);
		 }
		
	}

}
