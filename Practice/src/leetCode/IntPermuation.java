package leetCode;

import java.util.HashSet;
import java.util.Set;

public class IntPermuation {
	
	public static void recurr(int arr[] , Set<Integer> set , int sum) {
		
		if(set.size() == sum) {
			System.out.println(set);
			return;
		}
		
		for(int i =0 ; i<arr.length ; i++) {
			  
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3};
		int sum = 1;
		for(int i =1 ; i<=arr.length ; i++) {
			 sum = sum * i;
		}
		System.out.println(sum);
		Set<Integer> set = new HashSet<>();
		
		// 123 , 132 , 312 , 321 , 231 , 213 
		// 1234 , 
		
		
	}

}
