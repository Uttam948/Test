package RecurrsionProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3};
       Set<List<Integer>> set = new HashSet<>();
       int factorial = 1;
       for(int i = 1; i <=arr.length ; i++) {
    	   factorial = factorial*i;
       }
     //  System.out.println(factorial);
       recursionArray(set , factorial , arr);
   	
	}

	public static void recursionArray(Set<List<Integer>> set , int fact , int arr[]) {
	
		if(set.size() == fact) {
			System.out.println(set);
			return;
		}
		
		for(int i =0 ;i< arr.length-1 ; i ++) {
			
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
			List<Integer> list = new ArrayList<>();	
			for(int j =0 ;j<arr.length ; j++) {
				
				list.add(arr[j]);
				
			}
		//	System.out.println(list);
			set.add(list);
		}
		recursionArray(set , fact , arr);
		
	}
}
