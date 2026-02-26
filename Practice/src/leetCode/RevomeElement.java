package leetCode;

import java.util.ArrayList;
import java.util.List;

public class RevomeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RevomeElement revomeElement = new RevomeElement();
		
		int a[] = {3,2,2,3};
		
		
		
		System.out.println(revomeElement.removeElement(a, 3));
		
		 
		
		 
	}
	
	 public int removeElement(int[] nums, int val) {
	        
	        int j =1 ;
	        int k = 0;
	        int n = nums.length;
	        int val2 = 0;
	        int count = 0;

	         for(int i =0 ;i<nums.length ; i++){
	            if(nums[i] != val){

	              //  count++;
	            }
	         }
	        
	          for(int i =0 ;i <n ; i++){
	        	  
	        	  if(nums[i] != val);

	              val2= nums[i];
	              nums[i] = nums[k];
	              nums[k] = val2;

	              k++;
	              
	              System.out.println(i);
	              
	             

					/*
					 * if(nums[i] == val && nums[i-1] == val){
					 * 
					 * val2= nums[i-1]; nums[i-1] = nums[i+1]; nums[i+1] = val2;
					 * 
					 * }else if(nums[i-1] == val){
					 * 
					 * val2 = nums[i-1]; nums[i-1] = nums[i]; nums[i] = val2;
					 * 
					 * 
					 * }
					 * 
					 * System.out.println(i);
					 */
	          }
              
	          for(int i =0 ;i<nums.length ; i++){
	        	 // System.out.println(nums[i]);
	          }
	          
	       //   System.out.println(k);
	          
	        return count;

	 }

}
