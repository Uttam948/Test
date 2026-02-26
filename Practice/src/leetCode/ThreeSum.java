package leetCode;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {-1,0,1,2,-1,-4};
		
		//-1,0,1  -1,0,2  -1,0,-1   -1,0,-4
		//-1,1,2  -1,1,-1  -1,1,-4
		//-1,2,-1  -1,2,-4
		//
		
		
		
		ThreeSum sum = new ThreeSum();
		System.out.println(sum.threeSum(arr));

	}

	
          public List<List<Integer>> threeSum(int[] nums) {
        	  
        	  List<List<Integer>> list1  = new ArrayList<>();
        	  List<Integer>  list = new ArrayList<>();
        	  
        	  
        	  
        	  
        	  
        	  list1.add(list);
        	  
			return list1;
        
          }
}
