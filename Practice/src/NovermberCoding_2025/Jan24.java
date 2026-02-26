package NovermberCoding_2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jan24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //Select the adjacent pair with the minimum sum in nums. If multiple such pairs exist, choose the leftmost one.
	//	Replace the pair with their sum.
	//	Return the minimum number of operations needed to make the array non-decreasing.

		//An array is said to be non-decreasing if each element is greater than or equal to its previous element (if it exists).
		
		int arr[] = {5,2,3,1};
	//	int arr[] = {1,2,2};
		//1224
		
		List<Integer> list = new ArrayList<>();
		//list.add(5);
		//list.add(2);
		//list.add(3);
		//list.add(1);
		for(int i =0  ;i<arr.length-1 ; i++) {
			if(arr[i] > arr[i+1]) {
				list.add(arr[i]);
			}
		}
		list.add(arr[arr.length-1]);
		
	
		if(arr.length != list.size()) {
			System.out.println("The array is already sorted");
		}else {
			System.out.println(setNewArray(list , 0 , 0));
		}
		
		
		
	//System.out.println(list.size());
	
		
	}
	
	public static int setNewArray( List<Integer> list , int count , int idx ) {
		
		if(count == list.size()-2) {
			return idx;
		}
		int sum = 0;
		int j = 0;
		int min = Integer.MAX_VALUE;
		for(int i =0 ;i<list.size()-1 ; i++) {
  
	      		 
			if(list.get(i) > list.get(i+1)) {
				sum = list.get(i) + list.get(i+1);
			}else {
				sum = list.get(i) + list.get(i+1);
				count++;
			}
				
			if(sum < min) {
				min = sum;
				j = i;
			}
			
			//System.out.println(list);
		
		}
		
		if(min < Integer.MAX_VALUE) {
			
			list.remove(j+1);
			list.remove(j);
			//System.out.println(list);
			list.add(min);
		}
		
		System.out.println(list);
		return setNewArray(list , 0 , idx+1 );
		
	}

}
