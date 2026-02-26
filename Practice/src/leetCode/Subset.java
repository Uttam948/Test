package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,6,7};
		List<Integer> list = new ArrayList<>();
		sumsequence(0 , arr , 7 , 0 , list);
		
		
	}
	

	public static void sumsequence(int i , int [] nums ,int target , int sum , List<Integer>list) {
		
		if(i == nums.length) {
			if(sum == target) {
				System.out.println(list);
			}
			return;
		}
		list.add(nums[i]);
		sum = sum + nums[i];
		sumsequence(i + 1, nums ,target , sum , list);
		list.remove(list.size()-1);
		sum = sum - nums[i];
		sumsequence(i + 1, nums ,target , sum , list);
	}
	/*
	 * public static void subsets(int i , int[] nums , Stack<Integer> stack) {
	 * 
	 * if(i >= nums.length) { List<Integer> list = new ArrayList<>(); for(Integer j
	 * : stack) { list.add(j); } // lists.add(list); return; }
	 * 
	 * stack.push(nums[i]); subsets(i+1 , nums , stack); stack.pop(); subsets(i+1 ,
	 * nums , stack);
	 * 
	 * }
	 */
	 
	 public static void subsetsum(int idx , int num[] , List<Integer> list) {
		 
		 if(idx >= num.length) {
			 System.out.println(list);
			 return;
		 }
		 
		 for(int i = idx;i<num.length ;i++) {
			 
			 if( i > idx && num[idx] != num[i]) {
				 list.add(num[i]);
			 }
			 subsetsum(idx+1, num , list);
		 }
	 }
}
