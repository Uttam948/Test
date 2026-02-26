package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ThreeSome {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int [] nums = {1000000000,1000000000,1000000000,1000000000};
		int [] nums = {1,0,-1,0,-2,2};
        //int target = -294967296;
		int target = 0;
        List<List<Integer>> arrs = new ArrayList<>();
     
           
        Set<List<Integer>> resSet = new HashSet<>();
   int sum1 = 0;
		for(int i =0 ;i <= nums.length-3 ; i++) {
			 
			for(int j = i+1;j<=nums.length-2 ;j++) {
				Set<Integer> s = new HashSet<>();
				for(int k = j+1 ; k<=nums.length-1 ; k++) {
				
					long sum = target -(long) nums[j] - (long)nums[i] -(long) nums[k];
					
					if(sum > -2147483648 && sum < 2147483647) {
						sum1 = (int)sum;
					}
					
					
					
					if(s.contains(sum1)) {
				
						List<Integer> ar1 = Arrays.asList(nums[i] , nums[j] , sum1, nums[k]);
						Collections.sort(ar1);
						resSet.add(ar1);		
					//}
				}
					s.add(nums[k]);
				
				
			}
		}
		
		arrs = new ArrayList<>(resSet);
		
	//	for(List<Integer> i : arr) {
			
		///	TreeSet<Integer>  treeset = new TreeSet<>();
			//treeset.addAll(i.subList(0, 3));
			//if(set.add(treeset)) {
				//arn.add(i);
			
			
		//}
		//}
		
		//List<Integer> ar1 = Arrays.asList(0 , 0 , 0);
		
		}
		 System.out.println(arrs);
	}

}
