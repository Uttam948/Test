package hackerRankTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(63,54,17,78,43,70,32,97,16,94,74,18,60, 
				61,35,83,13,56,75,52,70,12,24,37,17,0,16,64,34,81,82,24,69,2,30,61,83,37,97,16,70,53,0,
				61,12,17,97,67,33,30,49,70,11,40,67,94,84,60,35,58,19,81,
				16,14,68,46,42,81,75,87,13,84,33,34,14,96,7,59, 
				17,98,79,47,71,75,8,27,73,66,64,12,29,35,80,78,80,6,5,24,49,82);
		
		
		
         List<Integer> list1 = new ArrayList<>();
		
         for(Integer i : list) {
        	 list1.add(0);
         }
         
         Collections.sort(list);
        
         int count = 0;
         for(int i =0 ;i<list.size() ; i++) {
        	 
        	 if(list.contains(i)){
        		 list1.add(i , count++);
        	 }else {
        		 list1.add(i , count=1);
        	 }
         }
         
         System.out.println(list1);
         
		Map<Integer , Integer> map = new HashMap<>();
		
		int k = 0;
		for(Integer i : list) {
			map.put(k , 0);
			k++;
		}
	
	
		for(Integer i : list ) {
			
		     if(map.containsKey(i)) {
		    	 map.put(i, map.get(i)+1);
		     }else {
		    	 map.put(i, 1);
		     }
			
		}
		list1.addAll(map.values());
	//	System.out.println(list1);

		
		

	}

}
